class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void accelerate() {
        speed += 10;
        System.out.println(brand + " accelerated to " + speed + " km/h");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Toyota", 60);
        car.displayInfo();
        car.accelerate();
    }
}

/* 
Brand: Toyota, Speed: 60 km/h
Toyota accelerated to 70 km/h
*/
