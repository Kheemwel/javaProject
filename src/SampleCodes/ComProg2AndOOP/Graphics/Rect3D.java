package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;

public class Rect3D extends JFrame {

    public Rect3D() {
        setTitle("3DRect");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.PINK);
        g.draw3DRect(20, 40, 60, 80, true);
        g.draw3DRect(100, 40, 60, 80, false);
        g.fill3DRect(20, 150, 60, 80, true);
        g.fill3DRect(100, 150, 60, 80, false);
    }

    public static void main(String[] args) {
        new Rect3D();
    }
}
