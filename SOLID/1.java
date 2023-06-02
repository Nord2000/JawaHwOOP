interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    @Override public void start() { // Starting the petrol engine } }

class Car { private Engine engine;

public Car(Engine engine) { this.engine = engine; }

public void start() { this.engine.start(); } }

public class DependencyInversionPrincipleExample { public static void main(String[] args) { Engine engine = new PetrolEngine(); Car car = new Car(engine); car.start(); } }
