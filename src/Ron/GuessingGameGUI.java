package Ron;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessingGameGUI extends JFrame {
    private JButton guessButton;
    private JButton restartButton;
    private JPanel panel;
    private JTextField tf1;
    private JLabel message;
    private int guess = 0;
    private int guessold = 0;
    private int random;

    public GuessingGameGUI() {
        setLayout(new FlowLayout());

        panel = new JPanel();
        message = new JLabel(
                "Guess the number between 1 to 100.");
        add(message);
        add(panel);

        guessButton = new JButton("Guess");
        add(guessButton);
        restartButton = new JButton("Try Again!");
        add(restartButton);

        tf1 = new JTextField(10);
        panel.add(tf1);

        ButtonHandler bhandler = new ButtonHandler();
        guessButton.addActionListener(bhandler);
        tf1.addActionListener(bhandler);

        Random generator = new Random();
        random = generator.nextInt(100) + 1;

        restartButton.addActionListener(

                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                        myGame();

                    }

                }

        );
    }

    public void myGame() {
        tf1.setText("");
        tf1.setEditable(true);

        Random generator = new Random();
        random = generator.nextInt(100) + 1;
        message.setText("Guess the number between 1 to 100.");
        guess = 0;

    }

    public static void main(String[] args) {
        GuessingGameGUI myFrame = new GuessingGameGUI();
        myFrame.setSize(300, 200);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setBackground(Color.lightGray);
    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            guess = Integer.parseInt(tf1.getText());

            if (guess == random) {
                message.setText("Guessing Solve!");
                tf1.setEditable(false);

            }

            if (Math.abs(random - guess) < Math.abs(random - guessold)) {
            }
            if (Math.abs(random - guess) > Math.abs(random - guessold)) {

            }
            guessold = guess;
            if (guess > random) {
                message.setText("You are too high!");
            }
            if (guess < random) {
                message.setText("You are too low");
            }

        }

    }

}
