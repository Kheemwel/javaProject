package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JFrame {

    public Rectangle() {
        setTitle("Rectangle");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(20, 50, 180, 80);
        g.setColor(Color.GRAY);
        g.fillRect(20, 150, 180, 80);
        getContentPane().setBackground(Color.BLUE);
        g.clearRect(20, 250, 180, 80);
    }

    public static void main(String[] args) {
        new Rectangle();
    }
}
