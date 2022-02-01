package ComProg2.Draft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabExer8 extends JFrame implements ActionListener {

    JMenuBar mainBar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Event Type");

    JMenuItem exit = new JMenuItem("Exit");

    JMenu adult = new JMenu("Adult");
    JMenu child = new JMenu("Child");

    JMenuItem adultBday = new JMenuItem("Birthday");
    JMenuItem anniv = new JMenuItem("Anniversary");
    JMenuItem retirement = new JMenuItem("Retirement");
    JMenuItem adultOther = new JMenuItem("Other");

    JMenuItem childBday = new JMenuItem("Birthday");
    JMenuItem childOther = new JMenuItem("Other");

    JPanel currentPanel = new JPanel();
    JPanel otherPanel = new JPanel();
    JLabel currentLabel = new JLabel();
    JLabel otherLabel = new JLabel();

    public LabExer8() {
        setTitle("Party Planner");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        composeMenus();
        addActionListeners();
        layoutComponents();
    }

    private void composeMenus() {
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);

        menu1.add(exit);

        menu2.add(adult);
        menu2.add(child);

        adult.add(adultBday);
        adult.add(anniv);
        adult.add(retirement);
        adult.add(adultOther);

        child.add(childBday);
        child.add(childOther);
    }

    private void addActionListeners() {
        exit.addActionListener(this);

        adultBday.addActionListener(this);
        anniv.addActionListener(this);
        retirement.addActionListener(this);
        adultOther.addActionListener(this);

        childBday.addActionListener(this);
        childOther.addActionListener(this);
    }

    private void layoutComponents() {
        currentPanel.add(currentLabel);
        otherPanel.add(otherLabel);
        currentLabel.setOpaque(true);
        otherLabel.setOpaque(true);
        otherLabel.setText("We have lots of ideas for memorable events");
        this.add(currentPanel);
        this.add(otherPanel);
    }

    public static void main(String[] args) {
        LabExer8 labExer8 = new LabExer8();
        labExer8.setSize(400, 200);
        labExer8.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            System.exit(0);
        } else if (e.getSource() == adultBday) {
            currentLabel.setText("Celebrate another year!");
            currentLabel.setBackground(Color.YELLOW);
            otherLabel.setBackground(Color.WHITE);
        } else if (e.getSource() == anniv) {
            currentLabel.setText("Look forward to golden years!");
            currentLabel.setBackground(Color.ORANGE);
            otherLabel.setBackground(Color.WHITE);
        } else if (e.getSource() == retirement) {
            currentLabel.setText("Cheers to hardwork!");
            currentLabel.setBackground(Color.GREEN);
            otherLabel.setBackground(Color.WHITE);
        } else if (e.getSource() == adultOther) {
            currentLabel.setText("");
            otherLabel.setBackground(Color.ORANGE);
        } else if (e.getSource() == childBday) {
            currentLabel.setText("Throw the best birthday party!");
            currentLabel.setBackground(Color.PINK);
            otherLabel.setBackground(Color.WHITE);
        } else if (e.getSource() == childOther) {
            currentLabel.setText("");
            otherLabel.setBackground(Color.ORANGE);
        }
    }

}
