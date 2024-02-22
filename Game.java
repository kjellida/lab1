import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Game {
     /*   private CarController carController;
        private Timer timer;
        CarView frame;

        private final int delay = 50;


        public Game(CarController carController, CarView frame, ArrayList<Car> cars) {
        this.carController = carController;
        this.frame = frame;
        timer = new Timer(delay, new TimerListener());
    }

    public void start(){
            timer.start();
        }

        class TimerListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                ArrayList<Car> carscopy = new ArrayList<>(CarController.cars);

                for (Car car : carscopy) {
                    frame.drawPanel.createImage(car);

                    int prevX = (int) Math.round(car.pos.getX());
                    int prevY = (int) Math.round(car.pos.getY());
                    car.move();

                    if (car.pos.getX() < 0 || car.pos.getX() >= frame.getWidth() || car.pos.getY() < 0 || car.pos.getX() >= frame.getHeight()) {
                        double speed = car.getCurrentSpeed();
                        car.stopEngine();
                        car.turnLeft();
                        car.turnLeft();
                        car.startEngine();
                        car.currentSpeed = speed;
                        frame.drawPanel.moveit(prevX, prevY, car);
                    } else {

                        int x = (int) Math.round(car.pos.getX());
                        int y = (int) Math.round(car.pos.getY());
                        frame.drawPanel.moveit(x, y, car);


                    }

                    frame.drawPanel.repaint();


                    if (car instanceof Volvo240 && frame.drawPanel.workshop.isWithinWorkshopRadius(car.pos, frame.drawPanel.workshop.location, 10)) {
                        frame.drawPanel.addToCarShop(car);
                        CarController.cars.remove(car);
                    }
                    frame.drawPanel.repaint();


                }

        }
    }*/

        private Timer timer;
        private CarView frame;
        private ArrayList<Car> cars;

        private final int delay = 50;

        public Game(CarView frame, ArrayList<Car> cars) {
            this.frame = frame;
            this.cars = cars;
            timer = new Timer(delay, new TimerListener());
        }

        public void start() {
            timer.start();
        }

        private class TimerListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                ArrayList<Car> carsCopy = new ArrayList<>(cars);

                for (Car car : carsCopy) {
                    frame.drawPanel.createImage(car);

                    int prevX = (int) Math.round(car.pos.getX());
                    int prevY = (int) Math.round(car.pos.getY());
                    car.move();

                    if (car.pos.getX() < 0 || car.pos.getX() >= frame.getWidth() || car.pos.getY() < 0 || car.pos.getX() >= frame.getHeight()) {
                        double speed = car.getCurrentSpeed();
                        car.stopEngine();
                        car.turnLeft();
                        car.turnLeft();
                        car.startEngine();
                        car.currentSpeed = speed;
                        frame.drawPanel.moveit(prevX, prevY, car);
                    } else {
                        int x = (int) Math.round(car.pos.getX());
                        int y = (int) Math.round(car.pos.getY());
                        frame.drawPanel.moveit(x, y, car);
                    }

                    frame.drawPanel.repaint();

                    // Remove car if it enters the workshop
                    if (car instanceof Volvo240 && frame.drawPanel.workshop.isWithinWorkshopRadius(car.pos, frame.drawPanel.workshop.location, 10)) {
                        frame.drawPanel.addToCarShop(car);
                        cars.remove(car);
                    }
                    frame.drawPanel.repaint();
                }
            }
        }

}
