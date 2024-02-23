import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Map;





/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
   //private final int delay = 50;
    // The timer is started with a listener (see below) that executes the statements
    // each step between delays.
  //  private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
  //CarView frame;

    // A list of cars, modify if needed
    ArrayList<Car> cars = new ArrayList<>();





    //methods:

    /*public static void main(String[] args) {
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
*/
    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
   /* private class TimerListener implements ActionListener {
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

        // Calls the gas method for each car once
        void gas(int amount) {
            double gas = ((double) amount) / 100;
            for (Car car : cars) {
                car.gas(gas);
            }
        }

        void brake(int amount) {
            double brake = ((double) amount) / 100;
            for (Car car : cars) {
                car.brake(brake);
            }
        }

        void turboOn() {
            for (Car car : cars) {
                if (car instanceof Saab95) {
                    ((Saab95) car).setTurboOn();
                }
            }

        }

        void turboOff() {
            for (Car car : cars) {
                if (car instanceof Saab95) {
                    ((Saab95) car).setTurboOff();
                }
            }
        }


        void liftBed(){
        for (Car car : cars) {
                if (car instanceof Scania) {
                    ((Scania) car).raisePlatform();
                }
            }
        }




        void lowerBed(){
            for (Car car : cars) {
                if (car instanceof Scania) {
                    ((Scania) car).lowerPlatform();
                }
            }
        }

        void startAll(){
            for (Car car : cars) {
                car.startEngine();
            }


        }

        void stopAll(){
            for (Car car : cars) {
                car.stopEngine();
            }

        }

        /*


        gasButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            carC.gas(gasAmount);
        }
    });
    //controlPanel.add(brakeButton, 3);
        brakeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            carC.brake(gasAmount); // Call the brake method in the CarController
        }
    });

        turboOnButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            carC.turboOn();

        }
    });

        turboOffButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            carC.turboOff();

        }
    });

       liftBedButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            carC.liftBed();
        }
    });

        lowerBedButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            carC.lowerBed();
        }
    });

        stopButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            carC.stopAll();
        }

    });

        startButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            carC.startAll();
        }

    });
    */
/*
    public ActionListener createGasActionListener(int gasAmount) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gas(gasAmount);
            }
        };
    }

    public ActionListener createBrakeActionListener(int brakeAmount) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                brake(brakeAmount);
            }
        };
    }

    public ActionListener createTurboOnActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turboOn();
            }
        };
    }

    public ActionListener createTurboOffActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turboOff();
            }
        };
    }

    public ActionListener createLiftBedActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liftBed();
            }
        };
    }

    public ActionListener createLowerBedActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lowerBed();
            }
        };
    }

    public ActionListener createStartAllActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startAll();
            }
        };
    }

    public ActionListener createStopAllActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopAll();
            }
        };
    }

*/


}
