ective float4 _vcolor_S0 = {0, 0, 0, 0};
static noperspective float2 _varccoord_S0 = {0, 0};

cbuffer DriverConstants : register(b1)
{
    float4 dx_ViewAdjust : packoffset(c1);
    float2 dx_ViewCoords : packoffset(c2);
    float2 dx_ViewScale  : packoffset(c3);
    float clipControlOrigin : packoffset(c3.z);
    float clipControlZeroToOne : packoffset(c3.w);
};

@@ VERTEX ATTRIBUTES @@

VS_OUTPUT generateOutput(VS_INPUT input)
{
    VS_OUTPUT output;
    output.gl_Position = gl_Position;
    output.dx_Position.x = gl_Position.x;
    output.dx_Position.y = clipControlOrigin * gl_Position.y;
    if (clipControlZeroToOne)
    {
        output.dx_Position.z = gl_Position.z;
    } else {
        output.dx_Position.z = (gl_Position.z + gl_Position.w) * 0.5;
    }
    output.dx_Position.w = gl_Position.w;
    output.v0 = _vcolor_S0;
    output.v1 = _varccoord_S0;

    return output;
}

VS_OUTPUT main(VS_INPUT input){
    initAttributes(input);

(_vcolor_S0 = _color);
float _aa_bloat_multiplier2569 = {1.0};
float2 _corner2570 = _corner_and_radius_outsets.xy;
float2 _radius_outset2571 = _corner_and_radius_outsets.zw;
float2 _aa_bloat_direction2572 = _aa_bloat_and_coverage.xy;
float _is_linear_coverage2573 = _aa_bloat_and_coverage.w;
float2 _pixellength2574 = rsqrt(vec2_ctor(dot(_skew.xz, _skew.xz), dot(_skew.yw, _skew.yw)));
float4 _normalized_axis_dirs2575 = (_skew * _pixellength2574.xyxy);
float2 _axiswidths2576 = (abs(_normalized_axis_dirs2575.xy) + abs(_normalized_axis_dirs2575.zw));
float2 _aa_bloatradius2577 = ((_axiswidths2576 * _pixellength2574) * 0.5);
float4 _radii_and_neighbors2578 = mul(_radii_selector, transpose(mat4_ctor_float4_float4_float4_float4(_radii_x, _radii_y, _r