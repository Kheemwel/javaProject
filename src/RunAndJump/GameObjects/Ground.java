package RunAndJump.GameObjects;

import RunAndJump.Resources.ImageResource;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Ground {

    public static final int GROUND_Y_POSITION = 140;

    private List<ImageGround> listGround;
    private BufferedImage ground1;
    private BufferedImage ground2;

    private Character character;

    public Ground(int width, Character character) {
        this.character = character;
        ground1 = ImageResource.getResouceImage("src/RunAndJump/Resources/ground.png");
        ground2 = ImageResource.getResouceImage("src/RunAndJump/Resources/ground.png");
        int numberOfImageGround = width / ground1.getWidth() + 2;
        listGround = new ArrayList<>();
        for (int i = 0; i < numberOfImageGround; i++) {
            ImageGround imageGround = new ImageGround();
            imageGround.X_POSITION = i * ground1.getWidth();
            setImageGround(imageGround);
            listGround.add(imageGround);
        }
    }

    private void setImageGround(ImageGround imgGround) {
        int typeGround = getTypeOfGround();
        if (typeGround == 1) {
            imgGround.image = ground1;
        } else {
            imgGround.image = ground2;
        }
    }

    private int getTypeOfGround() {
        Random rand = new Random();
        int type = rand.nextInt(10);
        if (type == 1) {
            return 1;
        } else if (type == 9) {
            return 3;
        } else {
            return 2;
        }
    }

    public void update() {
        Iterator<ImageGround> itr = listGround.iterator();
        ImageGround firstElement = itr.next();
        firstElement.X_POSITION -= character.getSpeedX();
        float previousPosX = firstElement.X_POSITION;
        while (itr.hasNext()) {
            ImageGround element = itr.next();
            element.X_POSITION = previousPosX + ground1.getWidth();
            previousPosX = element.X_POSITION;
        }
        if (firstElement.X_POSITION < -ground1.getWidth()) {
            listGround.remove(firstElement);
            firstElement.X_POSITION = previousPosX + ground1.getWidth();
            setImageGround(firstElement);
            listGround.add(firstElement);
        }
    }

    public void draw(Graphics g) {
        for (ImageGround imgGround : listGround) {
            g.drawImage(imgGround.image, (int) imgGround.X_POSITION, GROUND_Y_POSITION, null);
        }
    }

    private class ImageGround {
        float X_POSITION;
        BufferedImage image;
    }

}
