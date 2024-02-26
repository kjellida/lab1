import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class ControlPanel {

   /* private CarController carC;

    int gasAmount = 0;

        public GUI(CarController carC) {
            this.carC = carC;
        }

        public DrawPanel createDrawPanel() {
            return GraphicsFactory.createDrawPanel(800, 560);
        }

        public JPanel createControlPanel() {
            JPanel controlPanel = new JPanel(new GridLayout(2, 4));

                JButton gasButton = createGasButton();
                JButton brakeButton = createBrakeButton();
                JButton turboOnButton = createTurboOnButton();
                JButton turboOffButton = createTurboOffButton();
                JButton liftBedButton = createLiftBedButton();
                JButton lowerBedButton = createLowerBedButton();

                controlPanel.add(gasButton);
                controlPanel.add(turboOnButton);
                controlPanel.add(liftBedButton);
                controlPanel.add(brakeButton);
                controlPanel.add(turboOffButton);
                controlPanel.add(lowerBedButton);

            JSpinner gasSpinner = createGasSpinner();



              controlPanel.add(gasSpinner);


            // Add buttons to the control panel
            return controlPanel;
        }

        public JButton createGasButton() {
            JButton gasButton = new JButton("Gas");
            gasButton.addActionListener(e -> carC.gas(gasAmount));
            return gasButton;
        }

    public JButton createBrakeButton() {
        JButton brakeButton = new JButton("Brake");
        brakeButton.addActionListener(e -> carC.brake(gasAmount));
        return brakeButton;
    }

    public JButton createTurboOnButton() {
        JButton turboOnButton = new JButton("Saab Turbo on");
        turboOnButton.addActionListener(e -> carC.turboOn());
        return turboOnButton;
    }

    public JButton createTurboOffButton() {
        JButton turboOffButton = new JButton("Saab Turbo off");
        turboOffButton.addActionListener(e -> carC.turboOff());
        return turboOffButton;
    }

    public JButton createLiftBedButton() {
        JButton liftBedButton = new JButton("Scania Lift Bed");
        liftBedButton.addActionListener(e -> carC.liftBed());
        return liftBedButton;
    }

    public JButton createLowerBedButton() {
        JButton lowerBedButton = new JButton("Lower Lift Bed");
        lowerBedButton.addActionListener(e -> carC.lowerBed());
        return lowerBedButton;
    }

    public JButton createStartButton() {
        JButton startButton = new JButton("Start all cars");
        startButton.addActionListener(e -> carC.startAll());
        return startButton;
    }

    public JButton createStopButton() {
        JButton stopButton = new JButton("Stop all cars");
        stopButton.addActionListener(e -> carC.stopAll());
        return stopButton;
        }



    public JSpinner createGasSpinner() {
        SpinnerModel spinnerModel =
                new SpinnerNumberModel(0, //initial value
                        0, //min
                        100, //max
                        1);//step
        JSpinner gasSpinner = new JSpinner(spinnerModel);
        gasSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int gasAmount = (int) ((JSpinner)e.getSource()).getValue();
                carC.gas(gasAmount);
            }
        });
        return gasSpinner;
    }
*/


      /* private CarController carC;
         int gasAmount = 0;


        public GUI(CarController carC) {
            this.carC = carC;
        }

      public DrawPanel createDrawPanel() {
        return GraphicsFactory.createDrawPanel(800, 560);
    }

        public JButton createGasButton() {
            JButton gasButton = new JButton("Gas");
            gasButton.addActionListener(carC.createGasActionListener(gasAmount));
            return gasButton;
        }

        public JButton createBrakeButton() {
            JButton brakeButton = new JButton("Brake");
            brakeButton.addActionListener(carC.createBrakeActionListener(gasAmount));
            return brakeButton;
        }

        public JButton createTurboOnButton() {
            JButton turboOnButton = new JButton("Saab Turbo on");
            turboOnButton.addActionListener(carC.createTurboOnActionListener());
            return turboOnButton;
        }

        public JButton createTurboOffButton() {
            JButton turboOffButton = new JButton("Saab Turbo off");
            turboOffButton.addActionListener(carC.createTurboOffActionListener());
            return turboOffButton;
        }

        public JButton createLiftBedButton() {
            JButton liftBedButton = new JButton("Scania Lift Bed");
            liftBedButton.addActionListener(carC.createLiftBedActionListener());
            return liftBedButton;
        }

        public JButton createLowerBedButton() {
            JButton lowerBedButton = new JButton("Lower Lift Bed");
            lowerBedButton.addActionListener(carC.createLowerBedActionListener());
            return lowerBedButton;
        }

    public JButton createStartButton() {
        JButton startButton = new JButton("Start all cars");
        startButton.addActionListener(e -> carC.startAll());
        return startButton;
    }

    public JButton createStopButton() {
        JButton stopButton = new JButton("Stop all cars");
        stopButton.addActionListener(e -> carC.stopAll());
        return stopButton;
    }



    // Create gas spinner
        public JSpinner createGasSpinner() {
            SpinnerModel spinnerModel =
                    new SpinnerNumberModel(0, //initial value
                            0, //min
                            100, //max
                            1);//step
            JSpinner gasSpinner = new JSpinner(spinnerModel);
            gasSpinner.addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                    int gasAmount = (int) ((JSpinner) e.getSource()).getValue();
                    carC.gas(gasAmount);
                }
            });
            return gasSpinner;
        }

    public JPanel createControlPanel() {
        JPanel controlPanel = new JPanel(new GridLayout(3, 2));
        GUI guiBuilder = new GUI(carC);
        JButton gasButton = guiBuilder.createGasButton();
        JButton brakeButton = guiBuilder.createBrakeButton();
        JButton turboOnButton = guiBuilder.createTurboOnButton();
        JButton turboOffButton = guiBuilder.createTurboOffButton();
        JButton liftBedButton = guiBuilder.createLiftBedButton();
        JButton lowerBedButton = guiBuilder.createLowerBedButton();

        // Create gas spinner
        JSpinner gasSpinner = guiBuilder.createGasSpinner();

        controlPanel.add(gasButton);
        controlPanel.add(turboOnButton);
        controlPanel.add(liftBedButton);
        controlPanel.add(brakeButton);
        controlPanel.add(turboOffButton);
        controlPanel.add(lowerBedButton);

        // Add gasSpinner to the control panel
        controlPanel.add(gasSpinner);

        return controlPanel;
    }*/

    private static final int X = 800;
    private static final int Y = 800;
    int gasAmount = 0;



   // private CarController carController;

    private CarControl carControl;

    /*public GUI(CarController carController) {
        this.carController = carController;
    }*/

    public ControlPanel(CarControl carControl) {
        this.carControl = carControl;
    }


    public JPanel createControlPanel() {


        JPanel controlPanel = new JPanel();
        JPanel gasPanel = new JPanel();

        JLabel gasLabel = new JLabel("Amount of gas");
        JSpinner gasSpinner = createGasSpinner();

        gasPanel.setLayout(new BorderLayout());
        gasPanel.add(gasLabel, BorderLayout.PAGE_START);
        gasPanel.add(gasSpinner, BorderLayout.PAGE_END);
        controlPanel.add(gasPanel);



        // Create buttons
     /*   JButton gasButton = createButton("Gas", e -> carController.gas(gasAmount));
        JButton brakeButton = createButton("Brake", e -> carController.brake(gasAmount));
        JButton turboOnButton = createButton("Saab Turbo on", e -> carController.turboOn());
        JButton turboOffButton = createButton("Saab Turbo off", e -> carController.turboOff());
        JButton liftBedButton = createButton("Scania Lift Bed", e -> carController.liftBed());
        JButton lowerBedButton = createButton("Lower Lift Bed", e -> carController.lowerBed());
        JButton startButton = createButton("Start all", e -> carController.startAll());
        JButton stopButton = createButton("Stop all", e -> carController.stopAll());
*/

        JButton gasButton = createButton("Gas", e -> carControl.gas(gasAmount));
        JButton brakeButton = createButton("Brake", e -> carControl.brake(gasAmount));
        JButton turboOnButton = createButton("Saab Turbo on", e -> carControl.turboOn());
        JButton turboOffButton = createButton("Saab Turbo off", e -> carControl.turboOff());
        JButton liftBedButton = createButton("Scania Lift Bed", e -> carControl.liftBed());
        JButton lowerBedButton = createButton("Lower Lift Bed", e -> carControl.lowerBed());
        JButton startButton = createButton("Start all", e -> carControl.startAll());
        JButton stopButton = createButton("Stop all", e -> carControl.stopAll());



        JPanel buttonPanel = new JPanel(new GridLayout(2, 4)); // Adjust the number of rows and columns as needed
        buttonPanel.add(gasButton,0);
        buttonPanel.add(turboOnButton, 1);
        buttonPanel.add(liftBedButton, 2);
        buttonPanel.add(brakeButton, 3);
        buttonPanel.add(turboOffButton, 4);
        buttonPanel.add(lowerBedButton, 5);
        //buttonPanel.add(startButton);
        //buttonPanel.add(stopButton);
        buttonPanel.setPreferredSize(new Dimension( (X/2)+4, 200));
        buttonPanel.setBackground(Color.CYAN);

        /*controlPanel.add(buttonPanel, BorderLayout.CENTER);
        // Add components to control panel
        controlPanel.add(gasButton, 0);
        controlPanel.add(turboOnButton, 1);
        controlPanel.add(liftBedButton, 2);
        controlPanel.add(brakeButton, 3);
        controlPanel.add(turboOffButton, 4);
        controlPanel.add(lowerBedButton, 5);*/

        controlPanel.add(buttonPanel);



        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.green);
        startButton.setPreferredSize(new Dimension(X / 5 - 15, 200));
        controlPanel.add(startButton);

        stopButton.setBackground(Color.red);
        stopButton.setForeground(Color.black);
        stopButton.setPreferredSize(new Dimension(X / 5 - 15, 200));
        controlPanel.add(stopButton);







        return controlPanel;
    }

    private JButton createButton(String text, ActionListener listener) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        return button;
    }

    private JSpinner createGasSpinner() {
        SpinnerModel spinnerModel =
                new SpinnerNumberModel(0, //initial value
                        0, //min
                        100, //max
                        1);//step
        JSpinner gasSpinner = new JSpinner(spinnerModel);


        gasSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                gasAmount = (int) ((JSpinner) e.getSource()).getValue();
               // carController.gas(gasAmount);
            }
        });
        return gasSpinner;
    }




}



