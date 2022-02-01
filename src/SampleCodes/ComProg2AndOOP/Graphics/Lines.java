package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;

public class Lines extends JFrame {

    public Lines() {
        setTitle("Lines");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lines();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(50, 100, 150, 100);
        g.drawLine(80, 150, 80, 200);
        g.drawLine(80, 250, 120, 300);
    }
}
