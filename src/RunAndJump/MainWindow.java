package RunAndJump;

import RunAndJump.GameObjects.GameScreen;

import javax.swing.*;

public class MainWindow extends JFrame {

    public static final int SCREEN_WIDTH = 600;
    private GameScreen gameWindow;

    public MainWindow() {
        super("Run & Jump");
        setSize(SCREEN_WIDTH, 210);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        gameWindow = new GameScreen();
        addKeyListener(gameWindow);
        addMouseListener(gameWindow);
        add(gameWindow);
    }

    public void runGame() {
        setVisible(true);
        gameWindow.startGame();
    }

    public static void main(String args[]) {
        new MainWindow().runGame();
    }
}
