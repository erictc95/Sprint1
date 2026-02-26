package nivel1.ejercicio2.cars;


public class CarMain {
    public static void main(String[] args) {
        Car.brake();
        Car car1 = new Car("Gallardo");
        car1.accelerate();
        System.out.println(car1);
        Car car2 = new Car("Aventador");
        Car car3 = new Car("Urus");
        System.out.println(car2);
        System.out.println(car3);
    }

}
