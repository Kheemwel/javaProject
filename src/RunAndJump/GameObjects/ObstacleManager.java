package RunAndJump.GameObjects;

import RunAndJump.Resources.ImageResource;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObstacleManager {

    private BufferedImage cactus1;
    private BufferedImage cactus2;
    private Random random;

    private List<Obstacle> obstacles;
    private Character character;

    public ObstacleManager(Character character) {
        random = new Random();
        cactus1 = ImageResource.getResouceImage("src/RunAndJump/Resources/rock1.png");
        cactus2 = ImageResource.getResouceImage("src/RunAndJump/Resources/rock2.png");
        obstacles = new ArrayList<>();
        this.character = character;
        obstacles.add(createEnemy());
    }

    public void update() {
        for (Obstacle e : obstacles) {
            e.update();
        }
        Obstacle obstacle = obstacles.get(0);
        if (obstacle.isOutOfScreen()) {
            character.upScore();
            obstacles.clear();
            obstacles.add(createEnemy());
        }
    }

    public void draw(Graphics g) {
        for (Obstacle e : obstacles) {
            e.draw(g);
        }
    }

    private Obstacle createEnemy() {
        // if (obstacleType = getRandom)
        int type = random.nextInt(2);
        if (type == 0) {
            return new Rock(character, 800, cactus1.getWidth() - 10, cactus1.getHeight() - 10, cactus1);
        } else {
            return new Rock(character, 800, cactus2.getWidth() - 10, cactus2.getHeight() - 10, cactus2);
        }
    }

    public boolean isCollision() {
        for (Obstacle e : obstacles) {
            if (character.getBound().intersects(e.getBound())) {
                return true;
            }
        }
        return false;
    }

    public void reset() {
        obstacles.clear();
        obstacles.add(createEnemy());
    }

}
