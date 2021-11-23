import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDriven extends JFrame {
    OutputFrame outputFrame;

    JPanel inputPanel = new JPanel();
    JLabel lblFirstName = new JLabel("First Name:");
    JTextField fldFirstName = new JTextField(15);
    JLabel lblLastName = new JLabel("Last Name:");
    JTextField fldLastName = new JTextField(15);
    JLabel lblMiddleName = new JLabel("Middle Name:");
    JTextField fldMiddleName = new JTextField(15);
    JLabel lblContact = new JLabel("Mobile Number:");
    JTextField fldContact = new JTextField(15);
    JLabel lblEmail = new JLabel("Email Address:");
    JTextField fldEmail = new JTextField(15);
    JButton btnSubmit = new JButton("Submit");
    JButton btnClearAll = new JButton("Clear All");

    JPanel outputPanel = new JPanel();
    JTextArea textArea = new JTextArea(8, 20);
    JButton btnOkay = new JButton("Okay");

    public EventDriven() {
        this.setSize(240, 310);
        this.setLocation(200, 200);
        this.setTitle("INPUT");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inputPanel.add(lblFirstName);
        inputPanel.add(fldFirstName);
        inputPanel.add(lblLastName);
        inputPanel.add(fldLastName);
        inputPanel.add(lblMiddleName);
        inputPanel.add(fldMiddleName);
        inputPanel.add(lblContact);
        inputPanel.add(fldContact);
        inputPanel.add(lblEmail);
        inputPanel.add(fldEmail);
        inputPanel.add(btnSubmit, BOTTOM_ALIGNMENT);
        btnSubmit.addActionListener(new btnSubmit());
        inputPanel.add(btnClearAll, BOTTOM_ALIGNMENT);
        btnClearAll.addActionListener(new btnClearAll());
        this.add(inputPanel);
        this.setVisible(true);
        outputFrame = new OutputFrame();
    }

    public static void main(String[] args) {
        new EventDriven();
    }

    class OutputFrame extends JFrame {
        public OutputFrame() {
            this.setSize(300, 210);
            this.setLocation(450, 200);
            this.setTitle("OUTPUT");
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            textArea.setEditable(false);
            outputPanel.add(textArea);
            outputPanel.add(btnOkay, BOTTOM_ALIGNMENT);
            btnOkay.addActionListener(new btnOkay());
            this.add(outputPanel);
            this.setVisible(false);
        }
    }

    class btnSubmit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            outputFrame.setVisible(true);
            String firstname = fldFirstName.getText();
            String lastname = fldLastName.getText();
            String middlename = fldMiddleName.getText();
            String contactnumber = fldContact.getText();
            String emailaddress = fldEmail.getText();
            textArea.setText(
                    "First Name:\t" + firstname + "\n" +
                            "Last Name:\t" + lastname + "\n" +
                            "Middle Name:\t" + middlename + "\n" +
                            "Contact No.:\t" + contactnumber + "\n" +
                            "Email Add:\t" + emailaddress
            );
            btnSubmit.setEnabled(false);
        }
    }

    class btnClearAll implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            fldFirstName.setText("");
            fldLastName.setText("");
            fldMiddleName.setText("");
            fldContact.setText("");
            fldEmail.setText("");
            textArea.setText("");
            outputFrame.dispose();
            btnSubmit.setEnabled(true);
        }
    }

    class btnOkay implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            fldFirstName.setText("");
            fldLastName.setText("");
            fldMiddleName.setText("");
            fldContact.setText("");
            fldEmail.setText("");
            textArea.setText("");
            outputFrame.dispose();
            btnSubmit.setEnabled(true);
        }
    }
}
