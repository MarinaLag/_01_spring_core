package _02_car;

import java.util.StringJoiner;

public class ComplexCar {
    private int id;
    private String model;
    private Engine engine;

    public ComplexCar(int id, String model, Engine engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
    }

    public ComplexCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ComplexCar.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("model='" + model + "'")
                .add("engine=" + engine.getType()) // значение
                .toString();
    }
}
