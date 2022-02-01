package BenBen.Elementals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Main extends JFrame implements MouseListener {

    int MA;

    Font font = new Font("Arial", Font.BOLD, 30);
    String mainCharacterAttack, antagonistAttck;
    int score = 0;

    JPanel titleScreen = new JPanel();
    JPanel gameScreen = new JPanel();

    JLabel jLabelTitle;
    JLabel jLabelStart;
    JLabel jLabelExit;
    JLabel jLabelElements;
    JLabel jLabelMainCharacter;
    JLabel jLabelAntagonist;
    JLabel jLabelFire;
    JLabel jLabelWater;
    JLabel jLabelGrass;
    JLabel jLabelMainCharacterFire;
    JLabel jLabelAntagonistFire;
    JLabel jLabelMainCharacterWater;
    JLabel jLabelAntagonistWater;
    JLabel jLabelMainCharacterGrass;
    JLabel jLabelAntagonistGrass;
    JLabel jLabelScore = new JLabel();
    JLabel jLabelTBG;
    JLabel jLabelGBG;
    ImageIcon img_BG = new ImageIcon("src/BenBen/Elementals/Images/CAVEBG.jpg");

    ImageIcon img_Title = new ImageIcon("src/BenBen/Elementals/Images/TITLE.png");

    ImageIcon img_Start = new ImageIcon("src/BenBen/Elementals/Images/START.png");
    ImageIcon img_Exit = new ImageIcon("src/BenBen/Elementals/Images/EXIT.png");

    ImageIcon img_Elements = new ImageIcon("src/BenBen/Elementals/Images/ELEMENTS.png");
    ImageIcon img_MainCharacter = new ImageIcon("src/BenBen/Elementals/Images/MAINCHAR.png");
    ImageIcon img_Antagonist = new ImageIcon("src/BenBen/Elementals/Images/ANTAGO.png");
    ImageIcon img_MainCharacterFire = new ImageIcon("src/BenBen/Elementals/Images/MAINFIRE.png");
    ImageIcon img_AntagonistFire = new ImageIcon("src/BenBen/Elementals/Images/ANTAFIRE.png");
    ImageIcon img_MainCharacterWater = new ImageIcon("src/BenBen/Elementals/Images/AWATER.png");
    ImageIcon img_AntagonistWater = new ImageIcon("src/BenBen/Elementals/Images/AWATER.png");
    ImageIcon img_MainCharacterGrass = new ImageIcon("src/BenBen/Elementals/Images/MAINGRASS.png");
    ImageIcon img_AntagonistGrass = new ImageIcon("src/BenBen/Elementals/Images/ANTAGRASS.png");

    ImageIcon img_Fire = new ImageIcon("src/BenBen/Elementals/Images/FIRE.png");
    ImageIcon img_Water = new ImageIcon("src/BenBen/Elementals/Images/WATER.png");
    ImageIcon img_Grass = new ImageIcon("src/BenBen/Elementals/Images/GRASS.png");

    Main() {
        setTitle("ELEMENTAL");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(null);


        titleScreen.setLayout(null);
        gameScreen.setLayout(null);

        jLabelTitle = new JLabel("", img_Title, JLabel.CENTER);
        jLabelTitle.setBounds(50, 75, 400, 110);

        jLabelStart = new JLabel("", img_Start, JLabel.CENTER);
        jLabelStart.setBounds(130, 150, 100, 100);

        jLabelExit = new JLabel("", img_Exit, JLabel.CENTER);
        jLabelExit.setBounds(270, 150, 100, 100);

        jLabelElements = new JLabel("", img_Elements, JLabel.CENTER);
        jLabelElements.setBounds(145, 200, 200, 200);

        jLabelMainCharacter = new JLabel("", img_MainCharacter, JLabel.CENTER);
        jLabelMainCharacter.setBounds(1, 220, 200, 200);

        jLabelAntagonist = new JLabel("", img_Antagonist, JLabel.CENTER);
        jLabelAntagonist.setBounds(290, 230, 200, 200);

        jLabelFire = new JLabel("", img_Fire, JLabel.CENTER);
        jLabelFire.setBounds(125, 175, 50, 50);

        jLabelWater = new JLabel("", img_Water, JLabel.CENTER);
        jLabelWater.setBounds(225, 175, 50, 50);

        jLabelGrass = new JLabel("", img_Grass, JLabel.CENTER);
        jLabelGrass.setBounds(320, 175, 50, 50);

        jLabelMainCharacterFire = new JLabel("", img_MainCharacterFire, JLabel.CENTER);
        jLabelMainCharacterFire.setBounds(70, 230, 200, 200);

        jLabelAntagonistFire = new JLabel("", img_AntagonistFire, JLabel.CENTER);
        jLabelAntagonistFire.setBounds(225, 230, 200, 200);

        jLabelMainCharacterWater = new JLabel("", img_MainCharacterWater, JLabel.CENTER);
        jLabelMainCharacterWater.setBounds(70, 230, 200, 200);

        jLabelAntagonistWater = new JLabel("", img_AntagonistWater, JLabel.CENTER);
        jLabelAntagonistWater.setBounds(225, 230, 200, 200);

        jLabelMainCharacterGrass = new JLabel("", img_MainCharacterGrass, JLabel.CENTER);
        jLabelMainCharacterGrass.setBounds(80, 230, 200, 200);

        jLabelAntagonistGrass = new JLabel("", img_AntagonistGrass, JLabel.CENTER);
        jLabelAntagonistGrass.setBounds(215, 230, 200, 200);

        jLabelTBG = new JLabel("", img_BG, JLabel.CENTER);
        jLabelTBG.setBounds(0, 0, 500, 500);

        jLabelScore.setFont(font);
        jLabelScore.setText("Score: " + score);
        jLabelScore.setForeground(Color.DARK_GRAY.darker());
        jLabelScore.setBounds(10, 5, 300, 100);

        jLabelGBG = new JLabel("", img_BG, JLabel.CENTER);
        jLabelGBG.setBounds(0, 0, 500, 500);

        jLabelStart.addMouseListener(this);
        jLabelExit.addMouseListener(this);
        jLabelFire.addMouseListener(this);
        jLabelWater.addMouseListener(this);
        jLabelGrass.addMouseListener(this);

        titleScreen.add(jLabelTitle);
        titleScreen.add(jLabelStart);
        titleScreen.add(jLabelExit);
        titleScreen.add(jLabelElements);
        titleScreen.add(jLabelTBG);

        gameScreen.add(jLabelMainCharacter);
        gameScreen.add(jLabelAntagonist);
        gameScreen.add(jLabelFire);
        gameScreen.add(jLabelWater);
        gameScreen.add(jLabelGrass);
        gameScreen.add(jLabelMainCharacterFire);
        gameScreen.add(jLabelMainCharacterWater);
        gameScreen.add(jLabelMainCharacterGrass);
        gameScreen.add(jLabelAntagonistFire);
        gameScreen.add(jLabelAntagonistWater);
        gameScreen.add(jLabelAntagonistGrass);
        gameScreen.add(jLabelScore);
        gameScreen.add(jLabelGBG);

        jLabelMainCharacterFire.setVisible(false);
        jLabelMainCharacterWater.setVisible(false);
        jLabelMainCharacterGrass.setVisible(false);
        jLabelAntagonistFire.setVisible(false);
        jLabelAntagonistWater.setVisible(false);
        jLabelAntagonistGrass.setVisible(false);


        setContentPane(titleScreen);
        setVisible(true);

    }

    public static void main(String[] args) {
        Main main = new Main();
    }

    void AntagonistAttck() {
        Random random = new Random();
        int probability = random.nextInt(3);

        switch (probability) {
            case 0:
                jLabelAntagonistFire.setVisible(true);
                antagonistAttck = "FIRE";
                break;
            case 1:
                jLabelAntagonistWater.setVisible(true);
                antagonistAttck = "WATER";
                break;
            case 2:
                jLabelAntagonistGrass.setVisible(true);
                antagonistAttck = "GRASS";
                break;
            default:
        }
    }

    void Compare() {
        if (mainCharacterAttack.equals("FIRE") && antagonistAttck.equals("GRASS")) {
            score++;
            jLabelScore.setText("Score: " + score);
        } else if (mainCharacterAttack.equals("WATER") && antagonistAttck.equals("FIRE")) {
            score++;
            jLabelScore.setText("Score: " + score);
        } else if (mainCharacterAttack.equals("GRASS") && antagonistAttck.equals("WATER")) {
            score++;
            jLabelScore.setText("Score: " + score);
        }
    }

    void hideAttacks() {
        jLabelMainCharacterFire.setVisible(false);
        jLabelMainCharacterWater.setVisible(false);
        jLabelMainCharacterGrass.setVisible(false);
        jLabelAntagonistFire.setVisible(false);
        jLabelAntagonistWater.setVisible(false);
        jLabelAntagonistGrass.setVisible(false);
    }

    @Override
    public void mouseClicked(MouseEvent e) {


        if (e.getSource().equals(jLabelStart)) {
            setContentPane(gameScreen);
            validate();
        } else if (e.getSource().equals(jLabelExit)) {
            System.exit(0);
        }

        if (e.getSource().equals(jLabelFire)) {
            hideAttacks();
            jLabelMainCharacterFire.setVisible(true);
            mainCharacterAttack = "FIRE";
            AntagonistAttck();
            Compare();
        } else if (e.getSource().equals(jLabelWater)) {
            hideAttacks();
            jLabelMainCharacterWater.setVisible(true);
            mainCharacterAttack = "WATER";
            AntagonistAttck();
            Compare();
        } else if (e.getSource().equals(jLabelGrass)) {
            hideAttacks();
            jLabelMainCharacterGrass.setVisible(true);
            mainCharacterAttack = "GRASS";
            AntagonistAttck();
            Compare();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}