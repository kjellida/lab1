
import java.awt.*;
public class Scania extends Car{
    int platformAngle = 0;

    public Scania(){
        super(2, Color.pink, 200,"Scania",300);
        stopEngine();

    }

    @Override
    protected double speedFactor() {
        return enginePower * 0.01;
    }

    public int getPlatformAngle(){
        return platformAngle;
    }

    public void raisePlatform(int amount){
        if(getCurrentSpeed() == 0) {
            if (amount >= 0 && amount <= 70) {
                platformAngle += amount;
            }
        }
    }

   public void lowerPlatform(int amount){
        if(getCurrentSpeed() == 0) {
            if (amount >= 0 && amount <= 70) {
                platformAngle -= amount;
            }
        }
    }

    @Override
     public void startEngine(){
        if(platformAngle == 0) {
            currentSpeed = 0.1;
        }
    }

  //    får jag sätta på engine när flaket är inte 0?
    @Override
    protected void incrementSpeed(double amount) {
        if(platformAngle == 0) {
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
        }
    }

}
