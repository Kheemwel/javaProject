package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;

public class Polygon extends JFrame {

    public Polygon() {
        setTitle("Polygon");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int xPoints[] = {42, 52, 72, 52, 60, 40, 15, 28, 9, 32, 42};
        int ypoints[] = {38, 62, 68, 80, 105, 85, 102, 75, 58, 60, 38};
        g.drawPolygon(xPoints, ypoints, xPoints.length);
        int Y[] = new int[ypoints.length];
        for (int i = 0; i < ypoints.length; i++) {
            Y[i] = ypoints[i] + 100;
        }
        g.setColor(Color.YELLOW);
        g.fillPolygon(xPoints, Y, xPoints.length);
    }

    public static void main(String[] args) {
        new Polygon();
    }
}
