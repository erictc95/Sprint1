package cars;

import static cars.Car.brake;

public class CarMain {
    public static void main(String[] args) {
        Car.brake();
        Car car1 = new Car("Gallardo", 500);
        car1.accelerate();
        System.out.println(car1);
    }

}
