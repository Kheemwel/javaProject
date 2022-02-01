package ComProg2;

import javax.swing.*;
import java.awt.*;

public class JavaArt extends JFrame {

    public JavaArt() {
        setTitle("Pixelated Jigglypuff");
        setSize(640, 640);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JavaArt();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        wholebody();
        bodyOutline();
        ears();
        eyes();
        hair_and_mouth();
    }

    private void wholebody() {
        Graphics g = getGraphics();
        g.setColor(new Color(252, 215, 223));
        g.fillRect(30, 370, 10, 20);
        g.fillRect(40, 360, 40, 40);
        g.fillRect(50, 400, 30, 10);
        g.fillRect(60, 410, 20, 10);
        g.fillRect(80, 290, 420, 140);
        g.fillRect(90, 260, 500, 30);
        g.fillRect(100, 240, 500, 20);
        g.fillRect(110, 220, 480, 20);
        g.fillRect(150, 70, 80, 150);
        g.fillRect(230, 120, 180, 100);
        g.fillRect(500, 290, 60, 30);
        g.fillRect(140, 430, 280, 110);
        g.fillRect(120, 210, 30, 10);
        g.fillRect(130, 140, 20, 70);
        g.fillRect(140, 100, 10, 40);
        g.fillRect(160, 60, 60, 10);
        g.fillRect(170, 50, 20, 10);
        g.fillRect(230, 80, 20, 40);
        g.fillRect(250, 90, 10, 30);
        g.fillRect(260, 100, 10, 20);
        g.fillRect(270, 110, 10, 10);
        g.fillRect(310, 110, 80, 10);
        g.fillRect(410, 130, 10, 90);
        g.fillRect(420, 140, 10, 80);
        g.fillRect(430, 160, 10, 60);
        g.fillRect(440, 180, 10, 40);
        g.fillRect(450, 190, 10, 30);
        g.fillRect(460, 200, 70, 20);
        g.fillRect(530, 210, 30, 10);
        g.fillRect(590, 260, 10, 10);
        g.fillRect(560, 290, 20, 10);
        g.fillRect(560, 300, 10, 10);
        g.fillRect(500, 320, 50, 10);
        g.fillRect(500, 330, 40, 10);
        g.fillRect(500, 340, 30, 10);
        g.fillRect(500, 350, 20, 10);
        g.fillRect(500, 360, 10, 40);
        g.fillRect(110, 430, 30, 30);
        g.fillRect(420, 430, 60, 30);
        g.fillRect(420, 460, 40, 30);
        g.fillRect(90, 430, 20, 10);
        g.fillRect(90, 540, 100, 20);
        g.fillRect(100, 440, 10, 10);
        g.fillRect(110, 510, 30, 30);
        g.fillRect(120, 460, 20, 10);
        g.fillRect(130, 470, 10, 10);
        g.fillRect(280, 540, 40, 20);
        g.fillRect(330, 540, 100, 20);
        g.fillRect(350, 560, 90, 20);
        g.fillRect(480, 430, 10, 20);
        g.fillRect(460, 460, 10, 10);
        g.fillRect(420, 490, 30, 10);
        g.fillRect(420, 500, 10, 20);
        g.fillRect(120, 500, 20, 10);
        g.fillRect(90, 530, 20, 10);
        g.fillRect(100, 520, 10, 10);
        g.fillRect(100, 560, 60, 10);
        g.fillRect(190, 540, 10, 10);
        g.fillRect(230, 540, 50, 10);
        g.fillRect(320, 540, 10, 10);
        g.fillRect(340, 560, 10, 10);
        g.fillRect(360, 580, 80, 10);
        g.fillRect(430, 550, 10, 10);
    }

    private void bodyOutline() {
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(30, 370, 10, 20);
        g.fillRect(40, 360, 40, 10);
        g.fillRect(80, 290, 10, 90);
        g.fillRect(90, 260, 10, 30);
        g.fillRect(100, 240, 10, 20);
        g.fillRect(110, 220, 10, 20);
        g.fillRect(120, 210, 10, 10);
        g.fillRect(130, 140, 10, 70);
        g.fillRect(140, 100, 10, 40);
        g.fillRect(150, 70, 10, 30);
        g.fillRect(160, 60, 10, 10);
        g.fillRect(170, 50, 20, 10);
        g.fillRect(190, 60, 30, 10);
        g.fillRect(220, 70, 10, 10);
        g.fillRect(230, 80, 20, 10);
        g.fillRect(250, 90, 10, 10);
        g.fillRect(260, 100, 10, 10);
        g.fillRect(270, 110, 10, 10);
        g.fillRect(280, 120, 30, 10);
        g.fillRect(310, 110, 80, 10);
        g.fillRect(390, 120, 20, 10);
        g.fillRect(410, 130, 10, 10);
        g.fillRect(420, 140, 10, 20);
        g.fillRect(430, 160, 10, 30);
        g.fillRect(440, 180, 10, 10);
        g.fillRect(450, 190, 10, 10);
        g.fillRect(460, 200, 70, 10);
        g.fillRect(520, 210, 40, 10);
        g.fillRect(550, 220, 40, 10);
        g.fillRect(590, 230, 10, 40);
        g.fillRect(580, 270, 10, 20);
        g.fillRect(570, 290, 10, 10);
        g.fillRect(560, 300, 10, 10);
        g.fillRect(550, 310, 10, 10);
        g.fillRect(540, 320, 10, 10);
        g.fillRect(530, 330, 10, 10);
        g.fillRect(520, 340, 10, 10);
        g.fillRect(510, 350, 10, 10);
        g.fillRect(500, 360, 10, 40);
        g.fillRect(490, 400, 10, 30);
        g.fillRect(480, 430, 10, 20);
        g.fillRect(470, 450, 10, 10);
        g.fillRect(460, 460, 10, 10);
        g.fillRect(450, 470, 10, 20);
        g.fillRect(430, 490, 20, 10);
        g.fillRect(420, 470, 10, 50);
        g.fillRect(410, 510, 10, 30);
        g.fillRect(390, 530, 20, 10);
        g.fillRect(380, 520, 10, 10);
        g.fillRect(370, 500, 10, 20);
        g.fillRect(360, 490, 10, 10);
        g.fillRect(420, 540, 10, 10);
        g.fillRect(430, 550, 10, 40);
        g.fillRect(360, 580, 70, 10);
        g.fillRect(350, 570, 20, 10);
        g.fillRect(340, 560, 10, 10);
        g.fillRect(330, 550, 10, 10);
        g.fillRect(320, 540, 10, 10);
        g.fillRect(280, 550, 40, 10);
        g.fillRect(230, 540, 50, 10);
        g.fillRect(200, 530, 30, 10);
        g.fillRect(190, 520, 10, 10);
        g.fillRect(190, 540, 10, 10);
        g.fillRect(150, 550, 40, 10);
        g.fillRect(100, 560, 60, 10);
        g.fillRect(90, 550, 20, 10);
        g.fillRect(90, 530, 10, 20);
        g.fillRect(100, 520, 10, 10);
        g.fillRect(110, 510, 10, 10);
        g.fillRect(120, 500, 20, 10);
        g.fillRect(140, 490, 20, 10);
        g.fillRect(140, 480, 10, 10);
        g.fillRect(130, 470, 10, 10);
        g.fillRect(120, 460, 10, 10);
        g.fillRect(110, 450, 10, 10);
        g.fillRect(100, 440, 10, 10);
        g.fillRect(90, 420, 10, 20);
        g.fillRect(80, 420, 10, 10);
        g.fillRect(60, 410, 20, 10);
        g.fillRect(50, 400, 10, 10);
        g.fillRect(40, 390, 10, 10);
    }

    private void ears() {
        Graphics g = getGraphics();
        //right ear
        g.setColor(new Color(67, 73, 89));
        g.fillRect(490, 250, 80, 10);
        g.fillRect(500, 260, 60, 30);
        g.fillRect(560, 260, 10, 10);
        g.fillRect(510, 290, 30, 20);
        g.fillRect(540, 290, 10, 10);
        g.fillRect(510, 310, 10, 20);
        g.fillRect(520, 310, 10, 10);
        g.setColor(Color.BLACK);
        g.fillRect(480, 240, 10, 20);
        g.fillRect(490, 260, 10, 30);
        g.fillRect(500, 290, 10, 40);
        g.fillRect(510, 330, 10, 10);
        g.fillRect(520, 320, 10, 10);
        g.fillRect(530, 310, 10, 10);
        g.fillRect(540, 300, 10, 10);
        g.fillRect(550, 290, 10, 10);
        g.fillRect(560, 270, 10, 20);
        g.fillRect(570, 240, 10, 30);
        g.fillRect(490, 240, 80, 10);

        //left ear
        g.setColor(new Color(67, 73, 89));
        g.fillRect(160, 130, 40, 20);
        g.fillRect(160, 150, 10, 20);
        g.fillRect(170, 150, 10, 10);
        g.fillRect(170, 100, 30, 30);
        g.fillRect(180, 90, 10, 10);
        g.fillRect(200, 120, 10, 20);
        g.fillRect(210, 130, 10, 10);
        g.setColor(Color.BLACK);
        g.fillRect(150, 130, 10, 60);
        g.fillRect(160, 100, 10, 30);
        g.fillRect(170, 70, 10, 30);
        g.fillRect(180, 80, 10, 10);
        g.fillRect(190, 90, 10, 10);
        g.fillRect(200, 100, 10, 20);
        g.fillRect(210, 120, 10, 10);
        g.fillRect(220, 130, 10, 10);
        g.fillRect(200, 140, 20, 10);
        g.fillRect(180, 150, 20, 10);
        g.fillRect(170, 160, 10, 10);
        g.fillRect(160, 170, 10, 10);
    }

    private void eyes() {
        Graphics g = getGraphics();
        //left eye
        g.setColor(Color.BLACK);
        g.fillRect(120, 270, 10, 70);
        g.fillRect(130, 340, 10, 10);
        g.fillRect(140, 350, 10, 10);
        g.fillRect(150, 360, 50, 10);
        g.fillRect(200, 350, 10, 10);
        g.fillRect(210, 340, 10, 10);
        g.fillRect(220, 330, 10, 10);
        g.fillRect(230, 260, 10, 70);
        g.fillRect(220, 250, 10, 10);
        g.fillRect(210, 240, 10, 10);
        g.fillRect(160, 230, 50, 10);
        g.fillRect(150, 240, 10, 10);
        g.fillRect(140, 250, 10, 10);
        g.fillRect(130, 260, 10, 10);
        g.setColor(Color.WHITE);
        g.fillRect(130, 270, 10, 70);
        g.fillRect(140, 260, 10, 20);
        g.fillRect(150, 250, 10, 20);
        g.fillRect(160, 240, 10, 20);
        g.fillRect(170, 240, 40, 10);
        g.fillRect(140, 320, 10, 30);
        g.fillRect(150, 330, 10, 30);
        g.fillRect(160, 340, 40, 20);
        g.fillRect(200, 340, 10, 10);
        g.fillRect(210, 330, 10, 10);
        g.fillRect(220, 320, 10, 10);
        g.fillRect(200, 270, 30, 10);
        g.fillRect(210, 260, 10, 30);
        g.setColor(new Color(10, 113, 142));
        g.fillRect(140, 280, 70, 40);
        g.fillRect(150, 320, 70, 10);
        g.fillRect(160, 330, 50, 10);
        g.fillRect(150, 270, 50, 10);
        g.fillRect(160, 260, 50, 10);
        g.fillRect(170, 250, 50, 10);
        g.fillRect(210, 290, 10, 40);
        g.fillRect(220, 280, 10, 40);
        g.fillRect(220, 260, 10, 10);

        //right eye
        g.setColor(Color.BLACK);
        g.fillRect(320, 340, 10, 70);
        g.fillRect(330, 410, 10, 10);
        g.fillRect(340, 420, 10, 10);
        g.fillRect(350, 430, 60, 10);
        g.fillRect(410, 410, 10, 20);
        g.fillRect(420, 400, 10, 20);
        g.fillRect(430, 380, 10, 20);
        g.fillRect(440, 350, 10, 30);
        g.fillRect(430, 320, 10, 30);
        g.fillRect(420, 310, 10, 10);
        g.fillRect(360, 300, 60, 10);
        g.fillRect(350, 310, 10, 10);
        g.fillRect(330, 320, 20, 10);
        g.fillRect(330, 330, 10, 10);
        g.setColor(Color.WHITE);
        g.fillRect(330, 340, 20, 70);
        g.fillRect(340, 400, 20, 20);
        g.fillRect(350, 410, 20, 20);
        g.fillRect(370, 420, 40, 10);
        g.fillRect(340, 330, 20, 10);
        g.fillRect(350, 320, 20, 10);
        g.fillRect(360, 310, 60, 10);
        g.fillRect(420, 320, 10, 10);
        g.fillRect(400, 330, 20, 20);
        g.setColor(new Color(10, 113, 142));
        g.fillRect(350, 340, 50, 60);
        g.fillRect(360, 400, 60, 10);
        g.fillRect(370, 410, 40, 10);
        g.fillRect(400, 350, 40, 30);
        g.fillRect(400, 380, 30, 20);
        g.fillRect(420, 330, 10, 20);
        g.fillRect(360, 330, 40, 10);
        g.fillRect(370, 320, 50, 10);
    }

    private void hair_and_mouth() {
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);
        //mouth
        g.fillRect(220, 380, 10, 20);
        g.fillRect(230, 390, 10, 20);
        g.fillRect(240, 400, 10, 20);
        g.fillRect(250, 410, 20, 10);

        //hair
        g.fillRect(420, 190, 10, 10);
        g.fillRect(350, 200, 50, 10);
        g.fillRect(330, 210, 20, 20);
        g.fillRect(350, 210, 10, 10);
        g.fillRect(320, 220, 10, 10);
        g.fillRect(310, 230, 10, 10);
        g.fillRect(340, 230, 10, 10);
        g.fillRect(350, 240, 10, 20);
        g.fillRect(340, 260, 10, 20);
        g.fillRect(280, 280, 60, 10);
        g.fillRect(270, 270, 10, 10);
        g.fillRect(250, 260, 20, 10);
        g.fillRect(250, 250, 10, 10);
        g.fillRect(240, 230, 10, 20);
        g.fillRect(230, 190, 10, 40);
        g.fillRect(240, 170, 10, 20);
        g.fillRect(250, 150, 10, 20);
        g.fillRect(260, 140, 10, 10);
        g.fillRect(270, 130, 10, 10);
    }
}
