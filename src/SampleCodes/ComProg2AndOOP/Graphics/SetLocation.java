package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetLocation extends JFrame implements ActionListener {
    final int GAP = 30;
    JButton jButton = new JButton("Press");
    int x = 0, y = 0;

    public SetLocation() {
        setTitle("SetLocation");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(jButton);
        jButton.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SetLocation();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jButton.setLocation(x, y);
        x += GAP;
        y += GAP;
    }

}
