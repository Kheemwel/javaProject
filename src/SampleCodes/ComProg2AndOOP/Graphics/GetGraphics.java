package SampleCodes.ComProg2AndOOP.Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetGraphics extends JFrame implements ActionListener {

    JButton jButton = new JButton("Press");

    public GetGraphics() {
        setTitle("GetGraphics");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(jButton);
        jButton.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GetGraphics();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics draw = getGraphics();
        draw.drawString("You clicked the button!", 50, 100);
    }

}
