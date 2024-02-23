import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.*;

// This panel represents the animated part of the view with the car images.

public class DrawPanel extends JPanel{
    /*HashMap<Car, BufferedImage> carImages = new HashMap<Car, BufferedImage>();
    HashMap<Car, Point> carPositions = new HashMap<Car, Point>();
    BufferedImage volvoWorkshopImage;

    CarShop<Car> workshop = new CarShop<>(4,new Point(500,0));


    // To keep track of a single car's position
    Point volvoPoint = new Point(0,0);
    Point saabPoint = new Point(0,100);
    Point scaniaPoint = new Point(0, 200);
    Point volvoWorkshopPoint = new Point(500,0);


*/
/*
    HashMap<Car, Point> carPositions = new HashMap<Car, Point>();

    CarShop<Car> workshop = new CarShop<>(4,new Point(500,0));

    DrawImage d = new DrawImage();


    // TODO: Make this general for all cars
    void moveit(int x, int y, Car car) {
        Point newPosition = new Point(x, y);
        d.carPositions.put(car, newPosition);
    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.pink);

    }

   /* public void createImage(Car car) {
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
*/
    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
/*
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Car car : d.carImages.keySet()) {
            Point carPoint = d.carPositions.get(car);
            BufferedImage carImage = d.carImages.get(car);
            if(carPoint != null && carImage != null) {
                g.drawImage(carImage, (int)carPoint.getX(), (int) carPoint.getY(), null);
            }
        }
        g.drawImage(d.volvoWorkshopImage, (int)d.volvoWorkshopPoint.getX(), (int)d.volvoWorkshopPoint.getY(), null);
}

    void addToCarShop(Car car) {
            workshop.addCar(car);
           // carImages.remove(car);
          //  carPositions.remove(car);

    }
*/
    HashMap<Car, Point> carPositions = new HashMap<>();
    DrawImage drawImage = new DrawImage();
    CarShop<Car> workshop = new CarShop<>(4, new Point(500, 0));

    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.pink);
    }

    public void createImage(Car car) {
        Point position = new Point(0, 0); // Default position
        carPositions.put(car, position);
    }

    void moveit(int x, int y, Car car) {
        Point newPosition = new Point(x, y);
        carPositions.put(car, newPosition);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Car car : carPositions.keySet()) {
            Point position = carPositions.get(car);
            drawImage.drawCar(g, car, position);
        }
        drawImage.drawWorkshop(g, new Point(500, 0));
    }

    void addToCarShop(Car car) {  //removeImage
        workshop.addCar(car);
        carPositions.remove(car);
    }



}
