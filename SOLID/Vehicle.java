public class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }
}

abstract class VehicleSpeedLimit {
    public abstract double calculateAllowedSpeed();
}

class CarSpeedLimit extends VehicleSpeedLimit {
    private Car car;

    public CarSpeedLimit(Car car) {
        this.car = car;
    }

    public double calculateAllowedSpeed() {
        return car.getMaxSpeed() * 0.8;
    }
}

class BusSpeedLimit extends VehicleSpeedLimit {
    private Bus bus;

    public BusSpeedLimit(Bus bus) {
        this.bus = bus;
    }

    public double calculateAllowedSpeed() {
        return bus.getMaxSpeed() * 0.6;
    }
}

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return new CarSpeedLimit((Car) vehicle).calculateAllowedSpeed();
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return new BusSpeedLimit((Bus) vehicle).calculateAllowedSpeed();
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Vehicle car = new Car(100, "car");
        Vehicle bus = new Bus(80, "bus");
        SpeedCalculation speedCalculation = new SpeedCalculation();
        System.out.println(speedCalculation.calculateAllowedSpeed(car));
        System.out.println(speedCalculation.calculateAllowedSpeed(bus));
    }
}

class Car extends Vehicle {
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
}

class Bus extends Vehicle {
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
}
