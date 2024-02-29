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

    void removeImage(Car car){
        carPositions.remove(car);
    }



}
