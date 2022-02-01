package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;

public class Oval extends JFrame {

    public Oval() {
        setTitle("Oval");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(20, 50, 180, 80);
        g.setColor(Color.GRAY);
        g.fillOval(20, 150, 180, 80);
    }

    public static void main(String[] args) {
        new Oval();
    }
}
