package RunAndJump.GameObjects;

import RunAndJump.Resources.ImageResource;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Character {

    public static final int GROUND_Y_POSITION = 100;
    public static final float GRAVITY = 0.4f;
    public GameStates.CharacterState CHARACTER_STATE = GameStates.CharacterState.RUNNING;
    public int SCORE = 0;
    private float Y_POSITION;
    private float X_POSITION;
    private float X_SPEED;
    private float Y_SPEED;
    private Rectangle hitBox;
    private BufferedImage runningCharacter;
    private BufferedImage jumpingCharacter;
    private BufferedImage deadCharacter;

    public Character() {
        X_POSITION = 50;
        Y_POSITION = GROUND_Y_POSITION;
        hitBox = new Rectangle();
        runningCharacter = ImageResource.getResouceImage("src/RunAndJump/Resources/character.png");
        jumpingCharacter = ImageResource.getResouceImage("src/RunAndJump/Resources/character.png");
        deadCharacter = ImageResource.getResouceImage("src/RunAndJump/Resources/character.png");
    }

    public float getSpeedX() {
        return X_SPEED;
    }

    public void setSpeedX(int speedX) {
        this.X_SPEED = speedX;
    }

    public void draw(Graphics g) {
        switch (CHARACTER_STATE) {
            case RUNNING:
                g.drawImage(runningCharacter, (int) X_POSITION, (int) Y_POSITION, null);
                break;
            case JUMPING:
                g.drawImage(jumpingCharacter, (int) X_POSITION, (int) Y_POSITION, null);
                break;
            case DEATH:
                g.drawImage(deadCharacter, (int) X_POSITION, (int) Y_POSITION, null);
                break;
        }
    }

    public void update() {
        if (Y_POSITION >= GROUND_Y_POSITION) {
            Y_POSITION = GROUND_Y_POSITION;
        } else {
            Y_SPEED += GRAVITY;
            Y_POSITION += Y_SPEED;
        }
    }

    public void jump() {
        if (Y_POSITION >= GROUND_Y_POSITION) {
            Y_SPEED = -7.5f;
            Y_POSITION += Y_SPEED;
            CHARACTER_STATE = GameStates.CharacterState.JUMPING;
        }
    }

    public Rectangle getBound() {
        hitBox = new Rectangle();
        hitBox.x = (int) X_POSITION + 5;
        hitBox.y = (int) Y_POSITION;
        hitBox.width = runningCharacter.getWidth() - 10;
        hitBox.height = runningCharacter.getHeight();
        return hitBox;
    }

    public void setDead(boolean isDeath) {
        if (isDeath) {
            CHARACTER_STATE = GameStates.CharacterState.DEATH;
        } else {
            CHARACTER_STATE = GameStates.CharacterState.RUNNING;
        }
    }

    public void reset() {
        Y_POSITION = GROUND_Y_POSITION;
    }

    public void upScore() {
        SCORE += 20;
    }
}
