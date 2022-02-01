package MJ;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class TP_07 extends JFrame implements MouseListener {

    JPanel homeScreen = new JPanel();
    JPanel clickingScreen = new JPanel();
    JPanel clickingPanel = new JPanel();
    JPanel belowPanel = new JPanel();

    JLabel gameTitle = new JLabel("Click The Button");
    JButton btnStartGame = new JButton("Start");
    JButton btnRetry = new JButton("Retry");

    JLabel lblresult = new JLabel();
    JLabel lblpoints = new JLabel("Points: 0");
    JLabel lbltime = new JLabel("Time: 60s");

    JLabel clickButton = new JLabel("Press Me!");

    int points;
    int time = 60;

    public TP_07() {
        setTitle("Click The Button");
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        placingComponents();
        add(homeScreen);
        setVisible(true);
    }

    Timer countdown = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            time--;
            lbltime.setText("Time: " + time + "s");
            if (time == 0) {
                countdown.stop();
                ;
                clickButton.setEnabled(false);
                lblresult.setText("You got " + points + " point(s) in " + time + " seconds");
                lblresult.setFont(new Font("Arial", Font.BOLD, 15));
                lbltime.setText("");
                time = 0;
            }
        }
    });

    private void placingComponents() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        GridBagConstraints coords = new GridBagConstraints();
        coords.fill = GridBagConstraints.VERTICAL;

        homeScreen.setLayout(new GridBagLayout());
        coords.gridx = 0;
        coords.gridy = 0;
        homeScreen.add(gameTitle, coords);
        gameTitle.setFont(new Font(gameTitle.getFont().getName(), Font.BOLD, 50));
        gameTitle.setBorder(new EmptyBorder(150, 0, 20, 0));
        coords.gridx = 0;
        coords.gridy = 1;
        homeScreen.add(btnStartGame, coords);
        btnStartGame.addMouseListener(this);

        clickingScreen.setLayout(new BoxLayout(clickingScreen, BoxLayout.Y_AXIS));
        clickingScreen.setAlignmentX(CENTER_ALIGNMENT);
        clickingScreen.add(clickingPanel);
        clickingPanel.setBorder(new LineBorder(Color.RED, 1, false));
        clickingPanel.setPreferredSize(new Dimension(400, 300));
        clickingPanel.add(clickButton);
        clickButton.setBorder(new EmptyBorder(150, 0, 0, 0));
        clickButton.setBackground(Color.white);
        clickButton.setForeground(Color.black);
        clickButton.addMouseListener(this);
        clickingScreen.add(belowPanel);
        belowPanel.setLayout(new BoxLayout(belowPanel, BoxLayout.Y_AXIS));
        belowPanel.setAlignmentX(CENTER_ALIGNMENT);
        belowPanel.add(lblresult);
        lblresult.setBorder(new EmptyBorder(10, 0, 10, 0));
        belowPanel.add(lbltime);
        lbltime.setBorder(new EmptyBorder(10, 0, 10, 0));
        belowPanel.add(lblpoints);
        lblpoints.setBorder(new EmptyBorder(10, 0, 20, 0));
        belowPanel.add(btnRetry);
        btnRetry.addMouseListener(this);
    }

    public static void main(String[] args) {
        new TP_07();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(btnStartGame)) {
            homeScreen.setVisible(false);
            this.add(clickingScreen);
            countdown.start();
        } else if (e.getSource().equals(btnRetry)) {
            restartGame();
        } else if (e.getSource().equals(clickButton)) {
            if (time != 0) {
                points++;
                lblpoints.setText("Points: " + points + " pts");
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

    private void restartGame() {
        countdown.stop();
        clickButton.setEnabled(true);
        lblresult.setText("");
        lblpoints.setText("Score: 0");
        lbltime.setText("Time: 0s");
        time = 60;
        points = 0;
        countdown.start();
    }


}