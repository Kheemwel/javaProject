package RunAndJump.GameObjects;

import RunAndJump.MainWindow;
import RunAndJump.Resources.ImageResource;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cave {
    private List<ImageCave> listCave;
    private BufferedImage cave;

    private Character character;

    public Cave(int width, Character character) {
        this.character = character;
        cave = ImageResource.getResouceImage("src/RunAndJump/Resources/cave.png");
        listCave = new ArrayList<>();

        ImageCave imageCave = new ImageCave();
        imageCave.X_POSITION = 0;
        imageCave.Y_POSITION = 0;
        listCave.add(imageCave);

        imageCave = new ImageCave();
        imageCave.X_POSITION = 600;
        imageCave.Y_POSITION = 0;
        listCave.add(imageCave);
    }

    public void update() {
        Iterator<ImageCave> itr = listCave.iterator();
        ImageCave firstElement = itr.next();
        firstElement.X_POSITION -= character.getSpeedX() / 8;
        while (itr.hasNext()) {
            ImageCave element = itr.next();
            element.X_POSITION -= character.getSpeedX() / 8;
        }
        if (firstElement.X_POSITION < -cave.getWidth()) {
            listCave.remove(firstElement);
            firstElement.X_POSITION = MainWindow.SCREEN_WIDTH;
            listCave.add(firstElement);
        }
    }

    public void draw(Graphics g) {
        for (ImageCave imgGround : listCave) {
            g.drawImage(cave, (int) imgGround.X_POSITION, imgGround.Y_POSITION, null);
        }
    }

    private class ImageCave {
        float X_POSITION;
        int Y_POSITION;
    }
}
