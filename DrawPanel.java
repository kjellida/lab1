import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.*;

// This panel represents the animated part of the view with the car images.

public class DrawPanel extends JPanel{
    HashMap<Car, BufferedImage> carImages = new HashMap<Car, BufferedImage>();
    HashMap<Car, Point> carPositions = new HashMap<Car, Point>();
    BufferedImage volvoWorkshopImage;

    CarShop<Car> workshop = new CarShop<>(4,new Point(500,0));


    // To keep track of a single car's position
    Point volvoPoint = new Point(0,0);
    Point saabPoint = new Point(0,100);
    Point scaniaPoint = new Point(0, 200);
    Point volvoWorkshopPoint = new Point(500,0);





    // TODO: Make this general for all cars
    void moveit(int x, int y, Car car) {
        Point newPosition = new Point(x, y);
        carPositions.put(car, newPosition); // Update car's position

        // Update image's position (if car has an associated image)
        BufferedImage carImage = carImages.get(car);
        if (carImage != null) {
            carPositions.put(car, newPosition);

            //carPositions.put(car, new Point(x,y));
        }
    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.pink);

    }

    public void createImage(Car car) {
        try {
            if (car instanceof Volvo240) {
                carImages.put(car, ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Volvo240.jpg")));
                carPositions.put(car, volvoPoint);
            } else if (car instanceof Saab95) {
                carImages.put(car, ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Saab95.jpg")));
                carPositions.put(car, saabPoint);
            } else if (car instanceof Scania) {
                carImages.put(car, ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Scania.jpg")));
                carPositions.put(car, scaniaPoint);
            }


            volvoWorkshopImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/VolvoBrand.jpg"));
            // Update the car's initial position
        } catch (IOException ex) {
        }
    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Car car : carImages.keySet()) {
            Point carPoint = carPositions.get(car);
            BufferedImage carImage = carImages.get(car);
            if(carPoint != null && carImage != null) {
                g.drawImage(carImage, (int)carPoint.getX(), (int) carPoint.getY(), null);
            }
        }
        g.drawImage(volvoWorkshopImage, (int)volvoWorkshopPoint.getX(), (int)volvoWorkshopPoint.getY(), null);
    }

    void addToCarShop(Car car) {
            workshop.addCar(car);
            carImages.remove(car);
            carPositions.remove(car);

    }



}