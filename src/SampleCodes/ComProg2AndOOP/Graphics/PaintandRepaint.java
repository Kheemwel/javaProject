package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaintandRepaint extends JFrame implements ActionListener {

    JButton jButton = new JButton("Press");

    public PaintandRepaint() {
        setTitle("Pant And Repaint");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(jButton);
        jButton.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button is pressed.");
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("In Paint Method");
    }

    public static void main(String[] args) {
        new PaintandRepaint();
    }

}
