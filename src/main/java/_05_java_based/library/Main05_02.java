package _05_java_based.library;

import _05_java_based.car.AppConfigCar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main05_02 {
    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext(AppConfigBook.class);

        var lib = ctx.getBean("library", Library.class);
        System.out.println(lib);
    }
}
