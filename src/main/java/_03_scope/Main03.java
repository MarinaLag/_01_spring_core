package _03_scope;

import _02_car.SimpleCar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main03 {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("03_scope.xml");

        var car1 =ctx.getBean("car", SimpleCar.class);
        var car2 =ctx.getBean("car", SimpleCar.class);
        var car3 =ctx.getBean("car", SimpleCar.class);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
