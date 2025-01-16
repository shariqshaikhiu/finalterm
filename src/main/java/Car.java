package Transport;

public class Car extends Vehicle {

    private String speed;
    private int fuelLevel;

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void startEngine() {
        System.out.println("Transport.Car Engine is running.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Transport.Car Engine is stopping.");
    }
}
