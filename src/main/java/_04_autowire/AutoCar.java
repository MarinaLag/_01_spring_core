package _04_autowire;

import _02_car.Engine;

import java.util.StringJoiner;

public class AutoCar {
    private int id;
    private  String model;
    private Engine engine;

    public AutoCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AutoCar.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("model='" + model + "'")
                .add("engine=" + engine.getType())
                .toString();
    }
}
