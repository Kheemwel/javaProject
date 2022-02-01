package ComProg2.Game;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class TaskPerf7 extends JFrame implements MouseListener, ActionListener {

    JPanel homePanel = new JPanel();
    JPanel gamePanel = new JPanel();
    JPanel matchingPanel = new JPanel();

    JLabel gameName = new JLabel("Memory Game");
    JButton btnPlay = new JButton("Play");
    JButton btnPlayAgain = new JButton("Play Again");

    JLabel lblresult = new JLabel();
    JLabel lblscore = new JLabel("Score: 0");
    JLabel lbltime = new JLabel("Time: 0s");
    JLabel lbl0 = new JLabel();
    JLabel lbl1 = new JLabel();
    JLabel lbl2 = new JLabel();
    JLabel lbl3 = new JLabel();
    JLabel lbl4 = new JLabel();
    JLabel lbl5 = new JLabel();
    JLabel lbl6 = new JLabel();
    JLabel lbl7 = new JLabel();
    JLabel lbl8 = new JLabel();
    JLabel lbl9 = new JLabel();
    JLabel lbl00 = new JLabel();
    JLabel lbl11 = new JLabel();
    JLabel lbl22 = new JLabel();
    JLabel lbl33 = new JLabel();
    JLabel lbl44 = new JLabel();
    JLabel lbl55 = new JLabel();
    JLabel lbl66 = new JLabel();
    JLabel lbl77 = new JLabel();
    JLabel lbl88 = new JLabel();
    JLabel lbl99 = new JLabel();

    ArrayList<Integer> numlist = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    ArrayList<JLabel> firstlistLabel = new ArrayList<>(Arrays.asList(lbl0, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9));
    ArrayList<JLabel> secondlistLabel = new ArrayList<>(Arrays.asList(lbl00, lbl11, lbl22, lbl33, lbl44, lbl55, lbl66, lbl77, lbl88, lbl99));
    ArrayList<JLabel> clickedLabel = new ArrayList<>();
    LinkedHashMap<JLabel, String> memories = new LinkedHashMap<>();
    int numOfMatches, score, time, numOfLabelClicked;
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            time++;
            lbltime.setText("Time: " + time + "s");
        }
    });

    public TaskPerf7() {
        setTitle("Memory Game");
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Layout();
        add(homePanel);
        setVisible(true);
    }

    private void Layout() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.VERTICAL;

        homePanel.setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        homePanel.add(gameName, gbc);
        gameName.setFont(new Font(gameName.getFont().getName(), Font.BOLD, 50));
        gameName.setBorder(new EmptyBorder(150, 0, 20, 0));
        gbc.gridx = 0;
        gbc.gridy = 1;
        homePanel.add(btnPlay, gbc);
        btnPlay.addActionListener(this);

        gamePanel.setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gamePanel.add(matchingPanel, gbc);
        matchingPanel.setLayout(new GridLayout(5, 4));
        matchingPanel.setBorder(new EmptyBorder(10, 0, 20, 0));
        for (JLabel lbl : firstlistLabel) {
            matchingPanel.add(lbl);
            lbl.setFont(new Font(gameName.getFont().getName(), Font.BOLD, 30));
            lbl.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK, 1, false), new EmptyBorder(10, 20, 10, 20)));
            lbl.addMouseListener(this);
        }
        for (JLabel lbl : secondlistLabel) {
            matchingPanel.add(lbl);
            lbl.setFont(new Font(gameName.getFont().getName(), Font.BOLD, 30));
            lbl.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK, 1, false), new EmptyBorder(10, 20, 10, 20)));
            lbl.addMouseListener(this);
        }
        shuffleContent();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gamePanel.add(lblresult, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gamePanel.add(lblscore, gbc);
        lblscore.setBorder(new EmptyBorder(10, 0, 0, 0));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gamePanel.add(lbltime, gbc);
        lbltime.setBorder(new EmptyBorder(10, 0, 20, 0));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gamePanel.add(btnPlayAgain, gbc);
        btnPlayAgain.addActionListener(this);
    }

    private void shuffleContent() {
        Collections.shuffle(numlist);
        for (int x = 0; x < numlist.size(); x++) {
            JLabel lbl = firstlistLabel.get(x);
            lbl.setText("?");
            memories.put(lbl, String.valueOf(numlist.get(x)));
        }
        Collections.shuffle(numlist);
        for (int x = 0; x < numlist.size(); x++) {
            JLabel lbl = secondlistLabel.get(x);
            lbl.setText("?");
            memories.put(lbl, String.valueOf(numlist.get(x)));
        }
    }

    public static void main(String[] args) {
        new TaskPerf7();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        JLabel lbl = (JLabel) e.getSource();
        if (lbl.isEnabled()) {
            if (clickedLabel.size() >= 1) {
                if (lbl != clickedLabel.get(0)) {
                    numOfLabelClicked++;
                    if (numOfLabelClicked < 3) {
                        String num = memories.get(lbl);
                        lbl.setText(num);
                        clickedLabel.add(lbl);
                    }
                }

            } else {
                numOfLabelClicked++;
                String num = memories.get(lbl);
                lbl.setText(num);
                clickedLabel.add(lbl);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (clickedLabel.size() == 2) {
            JLabel lbl1 = clickedLabel.get(0);
            JLabel lbl2 = clickedLabel.get(1);
            if (memories.get(clickedLabel.get(0)).equals((memories.get(clickedLabel.get(1))))) {
                lbl1.setEnabled(false);
                lbl2.setEnabled(false);
                numOfMatches++;
                score += 10;
                lblscore.setText("Score: " + score);
            } else {
                try {
                    Thread.sleep(500);
                    lbl1.setText("?");
                    lbl2.setText("?");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            clickedLabel.clear();
            numOfLabelClicked = 0;

            if (numOfMatches == 10) {
                timer.stop();
                score = ((score * 9) - time) * 11;
                if (score < 0) {
                    score = 100;
                }
                lblresult.setText("Congratulations! You get " + score + " point(s) in " + time + " seconds");
                lblresult.setFont(new Font("Century", Font.BOLD, 15));
                lblscore.setText("");
                lbltime.setText("");
                for (int x = 0; x < numlist.size(); x++) {
                    JLabel lbl = secondlistLabel.get(x);
                    lbl.setText("?");
                }
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnPlay)) {
            homePanel.setVisible(false);
            this.add(gamePanel);
            timer.start();
        } else if (e.getSource().equals(btnPlayAgain)) {
            playAgain();
        }
    }

    private void playAgain() {
        timer.stop();
        memories.clear();
        clickedLabel.clear();
        numOfMatches = 0;
        numOfLabelClicked = 0;
        shuffleContent();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int x = 0; x < numlist.size(); x++) {
            firstlistLabel.get(x).setEnabled(true);
            secondlistLabel.get(x).setEnabled(true);
        }
        lblresult.setText("");
        lblscore.setText("Score: 0");
        lbltime.setText("Time: 0s");
        score = 0;
        time = 0;
        timer.start();
    }

}
