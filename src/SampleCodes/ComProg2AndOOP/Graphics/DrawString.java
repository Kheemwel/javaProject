package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;

public class DrawString extends JFrame {

    public DrawString() {
        setTitle("DrawString");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawString();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Serif", Font.ITALIC, 48));
        g.setColor(Color.BLUE);
        g.drawString("Doraemon", 50, 100);
    }
}
