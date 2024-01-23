import java.awt.*;

public abstract class Car implements Movable {
    int nrDoors; // Number of doors on the car
    double enginePower; // Engine power of the car
    double currentSpeed; // The current speed of the car
    Color color; // Color of the car
    String modelName;
    //Point pos;
    Point pos = new Point(0, 0);
    int direction = 0;


    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }


    public abstract double speedFactor();

    public abstract void incrementSpeed(double amount);

    public abstract void decrementSpeed(double amount);

    public abstract void gas(double amount);

    public abstract void brake (double amount);


    @Override
    public void move() {
        double speed = getCurrentSpeed();

        if (direction == 0){
            pos.setLocation(pos.getX() + speed, pos.getY());
        } else if (direction == 1) {
            pos.setLocation(pos.getX(), pos.getY() + speed);
        } else if (direction == 2){
            pos.setLocation(pos.getX() - speed, pos.getY());
        } else if (direction == 3){
            pos.setLocation(pos.getX(), pos.getY() - speed);
        }
    }

    @Override
    public void turnLeft() {
        direction = (direction + 1) % 4;
    }

    @Override
    public void turnRight() {
        direction = (direction - 1) % 4;
    }



    }
