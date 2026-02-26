package nivel1.ejercicio2.cars;

public class Car {

    private static final String brand ="Lamborghini";
    private static String model;
    private final int power = 450;

    public Car(String model) {
        Car.model = model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }

    public static void brake(){
        System.out.println("The car is braking!");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }

}
