import java.awt.*;

public abstract class Truck extends Car {

    public Truck(int nrDoors, Color color, double enginePower, String modelName, int weight) {
        super(nrDoors, color, enginePower, modelName, weight);
    }

    abstract void raisePlatform();
    abstract void lowerPlatform();

    @Override
    protected double speedFactor() {
        return enginePower * 0.01;
    }
}
