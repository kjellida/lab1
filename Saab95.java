import java.awt.*;

public class Saab95 extends Car {
    protected boolean turboOn;

    public Saab95() {
        super(2, Color.red, 125,"Saab95");
        turboOn = false;
        stopEngine();
    }

    protected void setTurboOn() {
        turboOn = true;
    }

    protected void setTurboOff() {
        turboOn = false;
    }

    @Override
    protected double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

}
