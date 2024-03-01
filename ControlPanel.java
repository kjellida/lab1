import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class ControlPanel {
    private int gasAmount = 0;
    private ActionObserver carControl;

    public ControlPanel(ActionObserver carControl) {
        this.carControl = carControl;
    }

    public JPanel createControlPanel(int X) {


        JPanel controlPanel = new JPanel();
        JPanel gasPanel = new JPanel();

        JLabel gasLabel = new JLabel("Amount of gas");
        JSpinner gasSpinner = createGasSpinner();

        gasPanel.setLayout(new BorderLayout());
        gasPanel.add(gasLabel, BorderLayout.PAGE_START);
        gasPanel.add(gasSpinner, BorderLayout.PAGE_END);
        controlPanel.add(gasPanel);


        JButton gasButton = createButton("Gas", e -> carControl.gas(gasAmount));
        JButton brakeButton = createButton("Brake", e -> carControl.brake(gasAmount));
        JButton turboOnButton = createButton("Saab Turbo on", e -> carControl.turboOn());
        JButton turboOffButton = createButton("Saab Turbo off", e -> carControl.turboOff());
        JButton liftBedButton = createButton("Scania Lift Bed", e -> carControl.liftBed());
        JButton lowerBedButton = createButton("Lower Lift Bed", e -> carControl.lowerBed());
        JButton startButton = createButton("Start all", e -> carControl.startAll());
        JButton stopButton = createButton("Stop all", e -> carControl.stopAll());
        JButton addCarButton = createButton("Add car", e -> carControl.addCar()); // ny
        JButton removeCarButton = createButton("Remove car", e -> carControl.removeCar());



        JPanel buttonPanel = new JPanel(new GridLayout(2, 4)); // Adjust the number of rows and columns as needed
        buttonPanel.add(gasButton,0);
        buttonPanel.add(turboOnButton, 1);
        buttonPanel.add(liftBedButton, 2);
        buttonPanel.add(brakeButton, 3);
        buttonPanel.add(turboOffButton, 4);
        buttonPanel.add(lowerBedButton, 5);
        buttonPanel.add(addCarButton, 6); // ny
        buttonPanel.add(removeCarButton, 7);

        buttonPanel.setPreferredSize(new Dimension( (X/2)+4, 200));
        buttonPanel.setBackground(Color.CYAN);

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
            }
        });
        return gasSpinner;
    }




}



