package RunAndJump.GameObjects;

import RunAndJump.MainWindow;
import RunAndJump.Resources.ImageResource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class GameScreen extends JPanel implements Runnable, KeyListener, MouseListener {

    private Ground ground;
    private Character character;
    private ObstacleManager obstaclesManager;
    private Cave caves;
    private Thread thread;

    private boolean isKeyPressed, isMouseClicked;

    private GameStates.GameState GAME_STATE = GameStates.GameState.START_GAME_STATE;

    private BufferedImage replayButtonImage;

    private int HIGH_SCORE = 0;

    public GameScreen() {
        character = new Character();
        ground = new Ground(MainWindow.SCREEN_WIDTH, character);
        character.setSpeedX(4);
        replayButtonImage = ImageResource.getResouceImage("src/RunAndJump/Resources/replay_button.png");
        obstaclesManager = new ObstacleManager(character);
        caves = new Cave(MainWindow.SCREEN_WIDTH, character);
    }

    public Timer scoreCounting = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!(character.CHARACTER_STATE == GameStates.CharacterState.DEATH)) {
                character.SCORE++;
            } else {
                scoreCounting.stop();
                HIGH_SCORE = character.SCORE;
                character.SCORE = 0;
            }
        }
    });

    public void startGame() {
        thread = new Thread(this);
        thread.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.decode("#f7f7f7"));
        g.fillRect(0, 0, getWidth(), getHeight());

        switch (GAME_STATE) {
            case START_GAME_STATE:
                character.draw(g);
                break;
            case GAME_PLAYING_STATE:
            case GAME_OVER_STATE:
                caves.draw(g);
                ground.draw(g);
                obstaclesManager.draw(g);
                character.draw(g);
                g.setFont(new Font(getFont().getName(), Font.PLAIN, 15));
                g.setColor(Color.WHITE);
                g.drawString("SCORE: " + character.SCORE, 475, 20);
                if (HIGH_SCORE > 0) {
                    g.drawString("HIGH SCORE: " + HIGH_SCORE, 325, 20);
                }
                if (GAME_STATE == GameStates.GameState.GAME_OVER_STATE) {
                    g.setFont(new Font(getFont().getName(), Font.BOLD, 15));
                    g.setColor(Color.WHITE);
                    g.drawString("G  A  M  E" + "      " + "O  V  E  R", 220, 70);
                    g.drawImage(replayButtonImage, 283, 80, null);
                }
                break;
        }
    }

    @Override
    public void run() {
        int fps = 100;
        long msPerFrame = 1000 * 1000000 / fps;
        long lastTime = 0;
        long elapsed;

        int msSleep;
        int nanoSleep;

        long endProcessGame;
        long lag = 0;

        while (true) {
            gameUpdate();
            repaint();
            endProcessGame = System.nanoTime();
            elapsed = (lastTime + msPerFrame - System.nanoTime());
            msSleep = (int) (elapsed / 1000000);
            nanoSleep = (int) (elapsed % 1000000);
            if (msSleep <= 0) {
                lastTime = System.nanoTime();
                continue;
            }
            try {
                Thread.sleep(msSleep, nanoSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lastTime = System.nanoTime();
        }
    }

    public void gameUpdate() {
        if (GAME_STATE == GameStates.GameState.GAME_PLAYING_STATE) {
            caves.update();
            ground.update();
            character.update();
            obstaclesManager.update();
            if (obstaclesManager.isCollision()) {
                GAME_STATE = GameStates.GameState.GAME_OVER_STATE;
                character.setDead(true);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!isKeyPressed) {
            isKeyPressed = true;
            switch (GAME_STATE) {
                case START_GAME_STATE:
                    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                        GAME_STATE = GameStates.GameState.GAME_PLAYING_STATE;
                        scoreCounting.start();
                    }
                    break;
                case GAME_PLAYING_STATE:
                    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                        character.jump();
                    }
                    break;
                case GAME_OVER_STATE:
                    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                        GAME_STATE = GameStates.GameState.GAME_PLAYING_STATE;
                        resetGame();
                        scoreCounting.start();
                    }
                    break;

            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        isKeyPressed = false;
    }

    private void resetGame() {
        obstaclesManager.reset();
        character.setDead(false);
        character.reset();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!isMouseClicked) {
            isKeyPressed = true;
            switch (GAME_STATE) {
                case START_GAME_STATE:
                    GAME_STATE = GameStates.GameState.GAME_PLAYING_STATE;
                    scoreCounting.start();
                    break;
                case GAME_PLAYING_STATE:
                    character.jump();
                    break;
                case GAME_OVER_STATE:
                    GAME_STATE = GameStates.GameState.GAME_PLAYING_STATE;
                    resetGame();
                    scoreCounting.start();
                    break;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        isMouseClicked = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
