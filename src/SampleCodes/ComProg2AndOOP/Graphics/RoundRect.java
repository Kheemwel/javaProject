package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;

public class RoundRect extends JFrame {

    public RoundRect() {
        setTitle("RoundRect");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawRoundRect();
        drawFillRoundRect();
    }

    public void drawRoundRect() {
        Graphics r = getGraphics();
        int x = 20;
        int y = 40;
        final int WIDTH = 80, HEIGHT = 80;
        final int HORIZONTAL_GAP = 100;
        for (int arcSize = x; arcSize <= HEIGHT; arcSize += 20) {
            r.drawRoundRect(x, y, WIDTH, HEIGHT, arcSize, arcSize);
            x += HORIZONTAL_GAP;
        }
    }

    public void drawFillRoundRect() {
        Graphics f = getGraphics();
        int x = 20;
        int y = 150;
        final int WIDTH = 80, HEIGHT = 80;
        final int HORIZONTAL_GAP = 100;
        f.setColor(Color.GRAY);
        for (int arcSize = x; arcSize <= HEIGHT; arcSize += 20) {
            f.fillRoundRect(x, y, WIDTH, HEIGHT, arcSize, arcSize);
            x += HORIZONTAL_GAP;
        }
    }

    public static void main(String[] args) {
        new RoundRect();
    }
}
