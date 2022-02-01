package ComProg2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabExer7B extends JFrame {
    JPanel mainPanel = new JPanel();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();

    JTextField jTextField1 = new JTextField(15);
    JTextField jTextField2 = new JTextField(15);
    JButton btnCheck = new JButton("CHECK");
    JButton btnSwap = new JButton("SWAP");
    JLabel jLabel = new JLabel();

    public LabExer7B() {
        this.setSize(300, 200);
        this.setLocationRelativeTo(null); //this will center the window
        this.setTitle("Checker and Swapper");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainPanel.setLayout(new GridLayout(3, 1));
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel1.add(jTextField1);
        jPanel1.add(btnCheck);
        btnCheck.addActionListener(new btnCheck());
        jPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel2.add(jTextField2);
        jPanel2.add(btnSwap);
        btnSwap.addActionListener(new btnSwap());
        jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel3.add(jLabel);
        mainPanel.add(jPanel1);
        mainPanel.add(jPanel2);
        mainPanel.add(jPanel3);
        this.add(mainPanel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LabExer7B();
    }

    class btnCheck implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text1 = jTextField1.getText();
            String text2 = jTextField2.getText();

            if (text1.equalsIgnoreCase(text2) || text2.equalsIgnoreCase(text1)) {
                jLabel.setText("SAME");
            } else {
                jLabel.setText("NOT THE SAME");
            }
            jLabel.setFont(new Font(jLabel.getFont().getName(), Font.BOLD, 30));
        }
    }

    class btnSwap implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text1 = jTextField1.getText();
            String text2 = jTextField2.getText();
            jTextField1.setText(text2);
            jTextField2.setText(text1);
        }
    }
}
