package _02_car;

public class Engine {
    public String type; // тип - дизель, газ и тд

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
