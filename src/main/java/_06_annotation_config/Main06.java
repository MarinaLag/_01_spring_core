package _06_annotation_config;

import _06_annotation_config.entities.ConnectionManager;
import _06_annotation_config.entities.Controller;
import _06_annotation_config.entities.Dao;
import _06_annotation_config.entities.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main06 {
    public static void main(String[] args) {

        // если нужны НЕ все классы
        // var ctx = new AnnotationConfigApplicationContext(ConnectionManager.class, Dao.class, Service.class, Controller.class);

        // если все классы, чтобы не перечислять
        var ctx = new AnnotationConfigApplicationContext("_06_annotation_config.entities");

        System.out.println("---------------");
        var cm = ctx.getBean(ConnectionManager.class);
        var dao = ctx.getBean(Dao.class);
        var service = ctx.getBean(Service.class);
        var controller = ctx.getBean(Controller.class);

        var pr = Arrays.asList(cm,dao,service,controller);
        pr.forEach(System.out::println);

        System.out.println("-------controller1--------");
        var controller1 = ctx.getBean(Controller.class);
        System.out.println(controller1);

    }
}
