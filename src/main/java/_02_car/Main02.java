package _02_car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main02 {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("02_car.xml");

        var cars = new ArrayList<SimpleCar>();
        cars.add(ctx.getBean("car1", SimpleCar.class));
        cars.add(ctx.getBean("car2", SimpleCar.class));
        cars.add(ctx.getBean("car3", SimpleCar.class));
        cars.add(ctx.getBean("car4", SimpleCar.class));
        cars.add(ctx.getBean("car5", SimpleCar.class));
        cars.add(ctx.getBean("car6", SimpleCar.class));

        cars.forEach(System.out::println);


        System.out.println("=======================");
        var car7 =ctx.getBean("car7",ComplexCar.class);
        System.out.println(car7);
    }
}
