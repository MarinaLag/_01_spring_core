package _05_java_based.car;

import _02_car.ComplexCar;
import _02_car.SimpleCar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main05_01 {
    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext(AppConfigCar.class);

        System.out.println(ctx.getBean("mess",String.class));

        var car1 = ctx.getBean("car1", SimpleCar.class);
        var car2 = ctx.getBean("car2", SimpleCar.class);
        var car3 = ctx.getBean("car3", ComplexCar.class);

        System.out.println("===================");
        System.out.println("car1 " + car1);
        System.out.println("car2 " + car2);
        System.out.println("car3 " + car3);

        System.out.println("==================");
        var cars = Arrays.asList(car1,car2,car3);
        cars.forEach(System.out::println);
    }
}
