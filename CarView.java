import javax.swing.*;
import java.awt.*;

/**
 * This class represents the full view of the MVC pattern of your car simulator.
 * It initializes with being center on the screen and attaching it's controller in it's state.
 * It communicates with the Controller by calling methods of it when an action fires of in
 * each of it's components.
 * TODO: Write more actionListeners and wire the rest of the buttons
 **/

public class CarView extends JFrame{
    private JPanel controlPanel;
    private ActionObserver carControl;

    DrawPanel drawPanel;

    private static final int X = 800;
    private static final int Y = 800;


    public CarView(String frameName, ActionObserver carControl) {
        this.carControl = carControl;
        initComponents(frameName);

    }




    private void initComponents(String title) {

        setTitle(title);
        setPreferredSize(new Dimension(X, Y));
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        // Initialize draw panel
        drawPanel = GraphicsFactory.createDrawPanel(X, Y-240);
        this.add(drawPanel);

        controlPanel = new ControlPanel(carControl).createControlPanel(X);

        this.add(controlPanel);


        this.pack();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }






}