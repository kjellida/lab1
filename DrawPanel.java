import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

// This panel represents the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    // Just a single image, TODO: Generalize
    BufferedImage volvoImage;
    // To keep track of a single car's position
    Point volvoPoint = new Point();
    Point saabPoint = new Point();

    BufferedImage saabImage;

    BufferedImage scaniaImage;

    Point scaniaPoint = new Point();

    BufferedImage volvoWorkshopImage;
    Point volvoWorkshopPoint = new Point(300,300);

    // TODO: Make this general for all cars
    void moveit(int x, int y){
        //volvoPoint.x = x;
       // volvoPoint.y = y;
        volvoPoint.setLocation(x,y);
        saabPoint.setLocation(x,y + 100);
        scaniaPoint.setLocation(x, y +200);

    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.pink);
        // Print an error message in case file is not found with a try/catch block
        try {
            // You can remove the "pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // volvoImage = ImageIO.read(new File("Volvo240.jpg"));

            // Rememember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
            // if you are starting in IntelliJ.
            volvoImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Volvo240.jpg"));
            volvoWorkshopImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/VolvoBrand.jpg"));
            saabImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Saab95.jpg"));
            scaniaImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Scania.jpg"));

        } catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(volvoImage, (int) volvoPoint.getX(), (int) volvoPoint.getY(), null); // see javadoc for more info on the parameters
        g.drawImage(volvoWorkshopImage, (int) volvoWorkshopPoint.getX(), (int) volvoWorkshopPoint.getY(), null);
        g.drawImage(saabImage, (int) saabPoint.getX(), (int) saabPoint.getY(), null); // see javadoc for more info on the parameters
        g.drawImage(scaniaImage, (int) scaniaPoint.getX(), (int) scaniaPoint.getY(), null); // see javadoc for more info on the parameters


    }
}
