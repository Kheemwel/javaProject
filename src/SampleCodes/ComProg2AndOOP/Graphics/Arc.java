package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;

public class Arc extends JFrame {

    public Arc() {
        setTitle("Arc");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Arc();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawArc(20, 50, 100, 100, 0, 360);
        g.drawArc(200, 50, 100, 100, 0, 270);
        g.drawArc(20, 200, 100, 100, 0, 180);
        g.drawArc(200, 200, 100, 100, 0, 90);
        g.setColor(Color.YELLOW);
        g.fillArc(20, 350, 100, 100, 20, 320);
        g.setColor(Color.RED);
        g.fillArc(60, 350, 100, 100, 340, 40);
    }
}
