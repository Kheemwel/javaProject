package SampleCodes.ComProg2AndOOP.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchPanel extends JFrame implements ActionListener {

    JPanel firstPanel = new JPanel();
    JPanel secondPanel = new JPanel();

    JButton btn1 = new JButton("Switch to 2nd Panel");
    JButton btn2 = new JButton("Switch to 1st Panel");

    public SwitchPanel() {
        setTitle("SwitchPanel");
        setSize(300, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        firstPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        firstPanel.setBackground(Color.BLUE);
        firstPanel.add(btn1);
        btn1.addActionListener(this);
        secondPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        secondPanel.setBackground(Color.GREEN);
        secondPanel.add(btn2);
        btn2.addActionListener(this);
        setContentPane(firstPanel);
    }

    public static void main(String[] args) {
        new SwitchPanel().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        if (btn.equals(btn1)) {
            setContentPane(secondPanel);
        } else {
            setContentPane(firstPanel);
        }
        validate();
    }
}
