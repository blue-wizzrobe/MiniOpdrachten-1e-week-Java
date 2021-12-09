import java.util.Random;

public class Car {
    private boolean engine;
    private boolean door;
    private boolean windshield;
    private boolean exhaust;

    public Car(boolean engine, boolean door, boolean windshield, boolean exhaust) {
        this.engine = engine;
        this.door = door;
        this.windshield = windshield;
        this.exhaust = exhaust;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public boolean isDoor() {
        return door;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }

    public boolean isWindshield() {
        return windshield;
    }

    public void setWindshield(boolean windshield) {
        this.windshield = windshield;
    }

    public boolean isExhaust() {
        return exhaust;
    }

    public void setExhaust(boolean exhaust) {
        this.exhaust = exhaust;
    }

    public boolean[] getParts() {
        boolean[] parts = {engine, door, windshield, exhaust};
        return parts;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Car{" +
                "engine broken =" + engine +
                ", door broken =" + door +
                ", windshield broken =" + windshield +
                ", exhaust broken =" + exhaust +
                '}';
    }
}
