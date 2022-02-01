package Ron;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TaskPerf10F extends JFrame implements KeyListener, ActionListener {

    Image image;
    Graphics graphics;
    Box player;
    Box goal, enemy, enemy1, enemy2, enemy3, enemy4, enemy5;
    boolean gameOver, winNer;

    Timer gameRunning = new Timer(1, this);

    TaskPerf10F() {
        player = new Box(100, 300, 20, 20, Color.blue);
        goal = new Box(400, 300, 50, 50, Color.green);
        enemy = new Box(140, 320, 50, 50, Color.red);
        enemy1 = new Box(300, 200, 50, 50, Color.red);
        enemy2 = new Box(250, 400, 50, 50, Color.red);
        enemy3 = new Box(350, 350, 50, 50, Color.red);
        enemy4 = new Box(220, 260, 50, 50, Color.red);
        enemy5 = new Box(320, 290, 50, 50, Color.red);
        gameOver = false;
        winNer = false;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.addKeyListener(this);
        gameRunning.start();
    }

    public static void main(String[] args) {
        new TaskPerf10F();
    }

    public void paint(Graphics g) {
//        image = createImage(this.getWidth(), this.getHeight());
//        graphics = image.getGraphics();
//        g.drawImage(image, 0, 0, this);

        goal.draw(g);
        enemy.draw(g);
        enemy1.draw(g);
        enemy2.draw(g);
        enemy3.draw(g);
        enemy4.draw(g);
        enemy5.draw(g);
        player.draw(g);


        if (winNer) {
            g.setColor(Color.green);
            g.setFont(new Font("MV Boli", Font.PLAIN, 45));
            g.drawString("WINNER!", 150, 100);
            gameRunning.stop();
        }
        if (gameOver) {
            g.setColor(Color.RED);
            g.setFont(new Font("MV Boli", Font.PLAIN, 45));
            g.drawString("GAME OVER!", 150, 100);
            gameRunning.stop();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        player.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        checkCollision();
        repaint();
    }

    public void checkCollision() {
        if (player.intersects(goal)) {
            winNer = true;
            System.out.println("Winner!");
            gameRunning.stop();
        } else if (player.intersects(enemy) || player.intersects(enemy1) || player.intersects(enemy2) || player.intersects(enemy3) || player.intersects(enemy4) || player.intersects(enemy5)) {
            gameOver = true;
            System.out.println("GAME OVER!");
            gameRunning.stop();
        }
    }

    public class Box extends Rectangle {

        Color color;

        Box(int x, int y, int width, int height, Color color) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public void keyPressed(KeyEvent e) {
            Graphics g = getGraphics();
            if (!gameOver && !winNer) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    g.setColor(this.color);
                    g.clearRect(this.x, this.y, this.width, this.height);
                    this.y -= 10;
                    g.fillRect(this.x, this.y, this.width, this.height);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    g.setColor(this.color);
                    g.clearRect(this.x, this.y, this.width, this.height);
                    this.y = y + 10;
                    g.fillRect(this.x, this.y, this.width, this.height);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    g.setColor(this.color);
                    g.clearRect(this.x, this.y, this.width, this.height);
                    this.x = x - 10;
                    g.fillRect(this.x, this.y, this.width, this.height);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    g.setColor(this.color);
                    g.clearRect(this.x, this.y, this.width, this.height);
                    this.x = x + 10;
                    g.fillRect(this.x, this.y, this.width, this.height);
                }
            }
        }

        public void draw(Graphics g) {
            g.setColor(this.color);
            g.fillRect(this.x, this.y, this.width, this.height);
        }
    }
}
