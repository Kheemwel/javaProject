package BenBen;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SHUFFLER extends JFrame implements ActionListener, MouseListener {
    JFrame jFrame = new JFrame("Shuffler");

    Font fontTitle = new Font("Arial", Font.ITALIC, 20);
    Font fontResult = new Font("Arial", Font.BOLD, 20);

    JPanel jPanelTitle = new JPanel();
    JPanel jPanelHint = new JPanel();
    JPanel jPanelResult = new JPanel();


    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();

    JLabel jLabelTitle = new JLabel("SHUFFLER");
    JLabel jLabelHint = new JLabel("Find The Check (✓) Mark!");
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabelResult = new JLabel("");

    JButton jButtonPlay = new JButton("Play");
    JButton jButtonExit = new JButton("Exit");

    ArrayList<JLabel> labels = new ArrayList<>(Arrays.asList(jLabel1, jLabel2, jLabel3));

    Border blackline = BorderFactory.createLineBorder(Color.black);

    SHUFFLER() {
        jFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 2;
        jPanel1.setBorder(blackline);
        jPanel1.add(jLabel1);
        jFrame.add(jPanel1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        jPanel2.setBorder(blackline);
        jPanel2.add(jLabel2);
        jFrame.add(jPanel2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        jPanel3.setBorder(blackline);
        jPanel3.add(jLabel3);
        jFrame.add(jPanel3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        jFrame.add(jButtonPlay, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        jFrame.add(jButtonExit, gbc);

        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 0;
        jPanelTitle.add(jLabelTitle);
        jFrame.add(jPanelTitle, gbc);

        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 1;
        jPanelHint.add(jLabelHint);
        jFrame.add(jPanelHint, gbc);

        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 4;
        jLabelResult.setText(" ");
        jPanelResult.add(jLabelResult);
        jFrame.add(jPanelResult, gbc);

        jLabelTitle.setFont(fontTitle);
        jLabelTitle.setForeground(Color.blue);

        jLabelResult.setFont(fontResult);

        jPanel1.setPreferredSize(new Dimension(100, 30));
        jPanel2.setPreferredSize(new Dimension(100, 30));
        jPanel3.setPreferredSize(new Dimension(100, 30));
        jButtonExit.setPreferredSize(new Dimension(100, 30));
        jButtonPlay.setPreferredSize(new Dimension(100, 30));

        jButtonPlay.addActionListener(this);
        jButtonExit.addActionListener(this);

        jPanel1.addMouseListener(this);
        jPanel2.addMouseListener(this);
        jPanel3.addMouseListener(this);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SHUFFLER shuffler = new SHUFFLER();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(jButtonPlay)) {
            Shuffle();
            jPanel1.setBackground(Color.BLACK);
            jPanel2.setBackground(Color.BLACK);
            jPanel3.setBackground(Color.BLACK);
            jLabelResult.setText(" ");
        } else if (e.getSource().equals(jButtonExit)) {
            System.exit(0);
        }
    }

    private void Shuffle() {
        Collections.shuffle(labels);
        for (int x = 0; x < labels.size(); x++) {
            jLabel1.setForeground(Color.BLACK);
            jLabel2.setForeground(Color.BLACK);
            jLabel3.setForeground(Color.BLACK);
            JLabel label = labels.get(x);
            label.setText(String.valueOf(x));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(jPanel1)) {
            jButtonPlay.setText("Play Again");
            jLabel1.setForeground(Color.WHITE);
            jLabel2.setForeground(Color.WHITE);
            jLabel3.setForeground(Color.WHITE);
            String label1 = jLabel1.getText();
            if (label1.equals("2")) {
                jLabel1.setText("✓");
                jLabel2.setText("X");
                jLabel3.setText("X");
                jLabelResult.setForeground(Color.GREEN);
                jLabelResult.setText("Correct!");
            } else {
                jLabel1.setText("X");
                jLabelResult.setForeground(Color.RED);
                jLabelResult.setText("Wrong!");
                String label2 = jLabel2.getText();
                String label3 = jLabel3.getText();
                if (label2.equals("2")) {
                    jLabel2.setText("✓");
                    jLabel3.setText("X");
                } else if (label3.equals("2")) {
                    jLabel3.setText("✓");
                    jLabel2.setText("X");
                }
            }
        } else if (e.getSource().equals(jPanel2)) {
            jButtonPlay.setText("Play Again");
            jLabel1.setForeground(Color.WHITE);
            jLabel2.setForeground(Color.WHITE);
            jLabel3.setForeground(Color.WHITE);
            String label2 = jLabel2.getText();
            if (label2.equals("2")) {
                jLabel2.setText("✓");
                jLabel1.setText("X");
                jLabel3.setText("X");
                jLabelResult.setForeground(Color.GREEN);
                jLabelResult.setText("Correct!");
            } else {
                jLabel2.setText("X");
                jLabelResult.setForeground(Color.RED);
                jLabelResult.setText("Wrong!");
                String label1 = jLabel1.getText();
                String label3 = jLabel3.getText();
                if (label1.equals("2")) {
                    jLabel1.setText("✓");
                    jLabel3.setText("X");
                } else if (label3.equals("2")) {
                    jLabel3.setText("✓");
                    jLabel1.setText("X");
                }
            }
        } else if (e.getSource().equals(jPanel3)) {
            jButtonPlay.setText("Play Again");
            jLabel1.setForeground(Color.WHITE);
            jLabel2.setForeground(Color.WHITE);
            jLabel3.setForeground(Color.WHITE);
            String label3 = jLabel3.getText();
            if (label3.equals("2")) {
                jLabel3.setText("✓");
                jLabel1.setText("X");
                jLabel2.setText("X");
                jLabelResult.setForeground(Color.GREEN);
                jLabelResult.setText("Correct!");
            } else {
                jLabel3.setText("X");
                jLabelResult.setForeground(Color.RED);
                jLabelResult.setText("Wrong!");
                String label1 = jLabel1.getText();
                String label2 = jLabel2.getText();
                if (label1.equals("2")) {
                    jLabel1.setText("✓");
                    jLabel2.setText("X");
                } else if (label2.equals("2")) {
                    jLabel2.setText("✓");
                    jLabel1.setText("X");
                }
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
}