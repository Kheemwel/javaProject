package RunAndJump.GameObjects;

import java.awt.*;

public abstract class Obstacle {
    public abstract void update();

    public abstract void draw(Graphics g);

    public abstract Rectangle getBound();

    public abstract boolean isOutOfScreen();
}
