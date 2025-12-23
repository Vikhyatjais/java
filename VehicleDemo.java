//create with vehicle class with common artibutes brand,speed then create car and bike classes that inherit vehicle class demonstrate how inheritance avoid code implmentation
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car F1 = new Car("REDBULL", 320, 1);
        F1.displayInfo();
        Bike bike = new Bike("BMW", 120, true);
        bike.displayInfo();
    }
}
