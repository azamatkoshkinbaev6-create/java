import java.util.*;

class Order{
    String name;
    int price;

    Order(String n,int p){
        name=n; price=p;
    }
}

public class Tap_20 {
    public static void main(String[] args) {
        List<Order> orders=Arrays.asList(
                new Order("Phone",500),
                new Order("Book",50),
                new Order("Laptop",900)
        );

        orders.stream()
                .filter(o->o.price>100)
                .map(o->o.name)
                .forEach(System.out::println);
    }
}