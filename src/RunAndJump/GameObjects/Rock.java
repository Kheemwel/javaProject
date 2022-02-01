package RunAndJump.GameObjects;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Rock extends Obstacle {

    public static final int LAND_Y_POSITION = 165;

    private int X_POSITION;
    private int WIDTH;
    private int HEIGHT;

    private BufferedImage image;
    private Character character;

    private Rectangle hitBox;

    public Rock(Character character, int X_POSITION, int width, int height, BufferedImage image) {
        this.X_POSITION = X_POSITION;
        this.WIDTH = width;
        this.HEIGHT = height;
        this.image = image;
        this.character = character;
        hitBox = new Rectangle();
    }

    public void update() {
        X_POSITION -= character.getSpeedX();
    }

    public void draw(Graphics g) {
        g.drawImage(image, X_POSITION, LAND_Y_POSITION - image.getHeight(), null);
        g.setColor(Color.red);
    }

    public Rectangle getBound() {
        hitBox = new Rectangle();
        hitBox.x = X_POSITION + (image.getWidth() - WIDTH) / 2;
        hitBox.y = LAND_Y_POSITION - image.getHeight() + (image.getHeight() - HEIGHT) / 2;
        hitBox.width = WIDTH;
        hitBox.height = HEIGHT;
        return hitBox;
    }

    @Override
    public boolean isOutOfScreen() {
        if (X_POSITION < -image.getWidth()) {
            return true;
        }
        return false;
    }

}
