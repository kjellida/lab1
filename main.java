import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class main {
/*
    final int delay = 50;

    Timer timer = new Timer(delay, new TimerListener());

    CarView frame;

   // ArrayList<Car> cars = new ArrayList<>();


    public static void main (String[] args){

            // Instance of this class
            // CarController cc = new CarController();

            CarController cc = GraphicsFactory.createCarController();

            cc.cars.add(CarFactory.createVolvo(new Point(0,0)));
            cc.cars.add(CarFactory.createSaab(new Point(0,100)));
            cc.cars.add(CarFactory.createScania(new Point(0,200)));





            //Car volvo1 = new Volvo240();
            //volvo1.pos = new Point(0,0);

            //Car saab1 = new Saab95();
            // saab1.pos = new Point(0,100);

            //Car scania = new Scania();
            //scania.pos = new Point(0,200);

            //cc.cars.add(volvo1);
            //cc.cars.add(saab1);
            //cc.cars.add(scania);



            // Start a new view and send a reference of self
            //cc.frame = new CarView("CarSim 1.0", cc);
            cc.frame = GraphicsFactory.createCarView("CarSim 1.0", cc);

            // Start the timer
            cc.timer.start();
        }

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ArrayList<Car> carscopy = new ArrayList<>(cars);

            for (Car car : carscopy) {
                frame.drawPanel.createImage(car);

                int prevX = (int) Math.round(car.pos.getX());
                int prevY = (int) Math.round(car.pos.getY());
                car.move();

                if(car.pos.getX() < 0 || car.pos.getX() >= frame.getWidth() || car.pos.getY() < 0 ||car.pos.getX() >= frame.getHeight()){
                    double speed = car.getCurrentSpeed();
                    car.stopEngine();
                    car.turnLeft();
                    car.turnLeft();
                    car.startEngine();
                    car.currentSpeed = speed;
                    frame.drawPanel.moveit(prevX, prevY, car);
                }else {

                    int x = (int) Math.round(car.pos.getX());
                    int y = (int) Math.round(car.pos.getY());
                    frame.drawPanel.moveit(x, y, car);


                }

                frame.drawPanel.repaint();


                if(car instanceof Volvo240 && frame.drawPanel.workshop.isWithinWorkshopRadius(car.pos,frame.drawPanel.workshop.location, 10)){
                    frame.drawPanel.addToCarShop(car);
                    cars.remove(car);
                }
                frame.drawPanel.repaint();


        }
    }


    }*/

    public static void main (String[]args){

        CarController cc = GraphicsFactory.createCarController();

        CarView frame = GraphicsFactory.createCarView("CarSim 1.0", cc);

        cc.cars.add(CarFactory.createVolvo(new Point(0, 0)));
        cc.cars.add(CarFactory.createSaab(new Point(0, 100)));
        cc.cars.add(CarFactory.createScania(new Point(0, 200)));



        Game game = new Game(frame, cc.cars);
        game.start();

    }




}
