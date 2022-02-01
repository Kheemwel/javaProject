package HCI.Draft;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDriven extends JFrame {
    JPanel panel1 = new JPanel();
    JLabel lbl1 = new JLabel("First Name:");
    JLabel lbl2 = new JLabel("Last Name:");
    JLabel lbl3 = new JLabel("Middle Name:");
    JLabel lbl4 = new JLabel("Mobile Number:");
    JLabel lbl5 = new JLabel("Email Address:");
    JTextField fld1 = new JTextField(15);
    JTextField fld2 = new JTextField(15);
    JTextField fld3 = new JTextField(15);
    JTextField fld4 = new JTextField(15);
    JTextField fld5 = new JTextField(15);
    JButton btn1 = new JButton("Submit");
    JButton btn2 = new JButton("Clear All");

    JPanel panel2 = new JPanel();
    JTextArea text = new JTextArea(8, 20);
    JButton btn3 = new JButton("Okay");

    Frame2 frame2;

    public EventDriven() {
        frame2 = new Frame2();

        this.setSize(200, 325);
        this.setLocation(200, 200);
        this.setTitle("INPUT");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1.add(lbl1);
        panel1.add(fld1);
        panel1.add(lbl2);
        panel1.add(fld2);
        panel1.add(lbl3);
        panel1.add(fld3);
        panel1.add(lbl4);
        panel1.add(fld4);
        panel1.add(lbl5);
        panel1.add(fld5);
        panel1.add(btn1);
        btn1.addActionListener(new btnSubmit());
        panel1.add(btn2);
        btn2.addActionListener(new btnClearAll());

        this.add(panel1);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        EventDriven eventDriven = new EventDriven();
    }

    class btnSubmit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame2.setVisible(true);
            String fname = fld1.getText();
            String lname = fld2.getText();
            String mname = fld3.getText();
            String contact = fld4.getText();
            String email = fld5.getText();
            text.setText("First Name:\t" + fname + "\n" +
                    "Last Name:\t" + lname + "\n" +
                    "Middle Name:\t" + mname + "\n" +
                    "Contact No.:\t" + contact + "\n" +
                    "Email Add:\t" + email);
            btn1.setEnabled(false);
        }
    }

    class btnClearAll implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            fld1.setText("");
            fld2.setText("");
            fld3.setText("");
            fld4.setText("");
            fld5.setText("");
            text.setText("");
            frame2.dispose();
            btn1.setEnabled(true);
        }
    }

    class Frame2 extends JFrame {
        public Frame2() {
            this.setSize(300, 225);
            this.setLocation(450, 200);
            this.setTitle("OUTPUT");
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            text.setEditable(false);
            panel2.add(text);
            panel2.add(btn3);
            btn3.addActionListener(new btnOkay());
            this.add(panel2);
            this.setVisible(false);
        }
    }

    class btnOkay implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            fld1.setText("");
            fld2.setText("");
            fld3.setText("");
            fld4.setText("");
            fld5.setText("");
            text.setText("");
            frame2.dispose();
            btn1.setEnabled(true);
        }
    }
}
