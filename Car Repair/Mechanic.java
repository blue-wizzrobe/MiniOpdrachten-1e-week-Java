import java.util.Arrays;

public class Mechanic {
    public static void main(String[] args) {
        Car carToFix = new Car(true, false, false, true);
        fixThatCar(carToFix);
    }

    static void fixThatCar(Car car) {
        int price = 0;
        boolean[] parts = car.getParts();
        if (parts[0]) {
            car.setEngine(false);
            price += 25;
            System.out.println("Je motor is gerepareerd!");
        }
        if (parts[1]) {
            car.setDoor(false);
            price += 25;
            System.out.println("Je deur is gerepareerd!");

        }
        if (parts[2]) {
            car.setWindshield(false);
            price += 25;
            System.out.println("Je voorruit is gerepareerd!");

        }
        if (parts[3]) {
            car.setExhaust(false);
            price += 25;
            System.out.println("Je uitlaat is gerepareerd!");

        }
        System.out.println("Dat zaakje kost je: " + price + " knaken.");
    }
}
