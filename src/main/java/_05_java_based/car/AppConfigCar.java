package _05_java_based.car;

import _02_car.ComplexCar;
import _02_car.Engine;
import _02_car.SimpleCar;
import org.springframework.context.annotation.Bean;

public class AppConfigCar {
    @Bean(name = "mess") // имя можно не писать
    public String message() {
        return "Hello word";
    }

    @Bean
    public SimpleCar car1() {
        return new SimpleCar();
    }

    @Bean
    public SimpleCar car2() {
        return new SimpleCar("BMV");
    }

    @Bean
    public Engine engine() {
        return new Engine("ECO");
    }

    @Bean
    public ComplexCar car3() {
        return new ComplexCar(engine());
    }


}
