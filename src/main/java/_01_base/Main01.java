package _01_base;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main01 {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("01_helloword.xml");


        var defaultMessage = ctx.getBean("default-message", String.class);
        System.out.println("defaultMessage: " + defaultMessage);

        var message = ctx.getBean("message", String.class);
        System.out.println("message: " + message);


    }
}
