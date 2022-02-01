package ComProg2.Draft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class LabExer7A extends JFrame implements MouseListener {

    Container con = getContentPane();
    FlowLayout centerLayout = new FlowLayout(FlowLayout.CENTER);
    Font font1 = new Font("Arial", Font.BOLD, 100);
    Font font2 = new Font("Century", Font.BOLD, 20);
    JLabel lbl1 = new JLabel("1");
    JLabel lbl2 = new JLabel("2");
    JLabel lbl3 = new JLabel("3");
    JLabel lbl4 = new JLabel("4");
    JLabel lbl5 = new JLabel("5");
    JLabel lbl6 = new JLabel("6");
    JLabel lbl7 = new JLabel("7");
    JLabel lbl8 = new JLabel("8");
    JLabel lbl9 = new JLabel("9");
    JLabel lblresult = new JLabel();
    Random random = new Random();
    int randomNum, attemptCount;
    boolean win = false;

    public LabExer7A() {
        super("Number Finder");
        setSize(600, 200);
        setLocationRelativeTo(null); //this will locate the window at the center of the screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        con.setLayout(centerLayout);
        lbl1.setFont(font1);
        lbl2.setFont(font1);
        lbl3.setFont(font1);
        lbl4.setFont(font1);
        lbl5.setFont(font1);
        lbl6.setFont(font1);
        lbl7.setFont(font1);
        lbl8.setFont(font1);
        lbl9.setFont(font1);
        lblresult.setFont(font2);
        lbl1.addMouseListener(this);
        lbl2.addMouseListener(this);
        lbl3.addMouseListener(this);
        lbl4.addMouseListener(this);
        lbl5.addMouseListener(this);
        lbl6.addMouseListener(this);
        lbl7.addMouseListener(this);
        lbl8.addMouseListener(this);
        lbl9.addMouseListener(this);
        con.add(lbl1);
        con.add(lbl2);
        con.add(lbl3);
        con.add(lbl4);
        con.add(lbl5);
        con.add(lbl6);
        con.add(lbl7);
        con.add(lbl8);
        con.add(lbl9);
        con.add(lblresult);
        setVisible(true);

        randomNum = random.nextInt(10) + 1; //will generate a random number from 0 to 9, and plus 1
        attemptCount = 1;
    }

    public static void main(String[] args) {
        new LabExer7A();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!win) {
            if (e.getSource() == lbl1) {
                checkInput(convertStringToInteger(lbl1.getText()), lbl1);
            } else if (e.getSource() == lbl2) {
                checkInput(convertStringToInteger(lbl2.getText()), lbl2);
            } else if (e.getSource() == lbl3) {
                checkInput(convertStringToInteger(lbl3.getText()), lbl3);
            } else if (e.getSource() == lbl4) {
                checkInput(convertStringToInteger(lbl4.getText()), lbl4);
            } else if (e.getSource() == lbl5) {
                checkInput(convertStringToInteger(lbl5.getText()), lbl5);
            } else if (e.getSource() == lbl6) {
                checkInput(convertStringToInteger(lbl6.getText()), lbl6);
            } else if (e.getSource() == lbl7) {
                checkInput(convertStringToInteger(lbl7.getText()), lbl7);
            } else if (e.getSource() == lbl8) {
                checkInput(convertStringToInteger(lbl8.getText()), lbl8);
            } else if (e.getSource() == lbl9) {
                checkInput(convertStringToInteger(lbl9.getText()), lbl9);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    private void checkInput(int n, JLabel lbl) {
        if (n == randomNum) {
            lblresult.setText("Correct! " + attemptCount + " attempt(s)");
            win = true;
        } else {
            lbl.setEnabled(false);
            attemptCount++;
            lblresult.setText("Try again.");
        }
    }

    private int convertStringToInteger(String s) {
        return Integer.parseInt(s);
    }

}
