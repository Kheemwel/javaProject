package TRexGame.userinterface;

import javax.swing.*;

public class GameWindow extends JFrame {

	public static final int SCREEN_WIDTH = 600;
	private GameScreen gameScreen;

	public GameWindow() {
		super("Java T-Rex game");
		setSize(SCREEN_WIDTH, 175);
		setLocation(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		gameScreen = new GameScreen();
		addKeyListener(gameScreen);
		add(gameScreen);
	}

	public static void main(String args[]) {
		(new GameWindow()).startGame();
	}

	public void startGame() {
		setVisible(true);
		gameScreen.startGame();
	}
}
