package SampleCodes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {
    JPanel pnlMain = new JPanel();
    JLabel lblFirstName = new JLabel("First Name: ");
    JLabel lblLastName = new JLabel("Last Name: ");
    JButton btnSubmit = new JButton("Submit");
    JButton btnClearAll = new JButton("ClearAll");
    JTextField fldFirstName = new JTextField(15);
    JTextField fldLastName = new JTextField(15);
    JTextArea outputArea = new JTextArea(8, 20);
    FlowLayout fl = new FlowLayout();
    Font setFont = new Font("", Font.BOLD, 14);

    public UserInterface() {
        this.setSize(300, 350);
        this.setLocation(200, 200);
        this.setTitle("Event Driven program");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputArea.setBackground(Color.LIGHT_GRAY);
        outputArea.setEditable(false);
        outputArea.setFont(setFont);
        fldFirstName.setFont(setFont);
        fldLastName.setFont(setFont);
        pnlMain.add(lblFirstName);
        pnlMain.add(fldFirstName);
        pnlMain.add(lblLastName);
        pnlMain.add(fldLastName);
        pnlMain.add(outputArea);
        btnSubmit.addActionListener(new actionButton1());
        pnlMain.add(btnSubmit);
        btnClearAll.addActionListener(new actionButton2());
        pnlMain.add(btnClearAll);
        this.add(pnlMain);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
    }

    class actionButton1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent a) {
            String firstName = fldFirstName.getText();
            String lastName = fldLastName.getText();
            outputArea.append("\nFirst Name:\n " + firstName + "\n\nLast Name:\n "
                    + lastName);
        }
    }

    class actionButton2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            fldFirstName.setText("");
            fldLastName.setText("");
            outputArea.setText("");
        }
    }
}
