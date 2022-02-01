package OOP.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RunTheGame {
    static Gameplay gameplay = new Gameplay();
    static Scanner input = new Scanner(System.in);
    static int gamemode;

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        gameplay.setPlayerName(input.nextLine());
        System.out.print("Press 1 or 2 to select your game mode.\n1 - Story\n2 - Survival\n:: ");
        gamemode = Integer.parseInt(input.nextLine());
        System.out.print("Press P to start playing, " + gameplay.getPlayerName() + "\n:: ");
        if (input.nextLine().equalsIgnoreCase("P")) {
            switch (gamemode) {
                case 1:
                    tellIntro();
                    storyMaze();
                    tellEnding();
                    break;
                case 2:
                    tellIntro();
                    survivalBattle();
                    break;
            }
        }
    }

    static void tellIntro() {
        for (String w : gameplay.Introduction) {
            System.out.println(w);
        }
        System.out.println();
    }

    static void storyMaze() {
        ArrayList<String> newPath = new ArrayList<>(Arrays.asList(gameplay.path));
        Collections.shuffle(newPath);
        System.out.println("Your mission is to rescue the princess at the end of the maze.");
        System.out.println();
        System.out.println("You are at the entrance of the maze.");
        int steps = 1;
        for (String d : newPath) {
            while (true) {
                System.out.print("Press R to go right or L to go left\n:: ");
                String move = input.nextLine();
                if (gameplay.playerMove(move).equals(d)) {
                    if (steps < newPath.size()) {
                        System.out.println("Go on...");
                    }
                    steps++;
                    break;
                } else if (gameplay.playerMove(move).equals(gameplay.goLeft) && gameplay.playerMove(move).equals(gameplay.goRight)) {
                    System.out.println("Just press R or L, idiot.\n");
                } else {
                    System.out.println("Oh no, it's a dead end. Come back from the last checkpoint.\n");
                }
            }
        }
        System.out.println("It seems you are now at the end of the maze. Congratulations.");
        System.out.println("You can now rescue the princess...");
        System.out.println("THE END");
    }

    static void tellEnding() {
        System.out.println();
        for (String w : gameplay.Ending) {
            System.out.println(w);
        }
    }

    static void survivalBattle() {
        int playerDamageMultiplier = 1;
        int monsterDamageMultiplier = 2;

        System.out.println("You are now at the end of the maze, but there is a huge monster blocking your way.");
        System.out.println("Your mission is to kill the monster to rescue the princess.");
        System.out.println("Tip: Keep attacking the monster to kill it");
        while ((gameplay.getPlayerHealth() > 0) && (gameplay.getMonsterHealth() > 0)) {
            System.out.print("Press x to attack: ");
            String attack = input.nextLine();
            if (attack.equalsIgnoreCase("X")) {
                gameplay.setPlayerDamage(gameplay.getPlayerDamage() * playerDamageMultiplier);
                gameplay.playerAttack(true);
                playerDamageMultiplier++;
                monsterDamageMultiplier = 1;
                if (gameplay.getMonsterHealth() > 0) {
                    System.out.println("Keep Attacking!");
                }
            } else {
                gameplay.setMonsterDamage(gameplay.getMonsterDamage() * monsterDamageMultiplier);
                gameplay.playerAttack(false);
                playerDamageMultiplier = 1;
                monsterDamageMultiplier += 2;
            }
        }

        if (gameplay.getPlayerHealth() > 0) {
            System.out.println("Congratulations! You defeat the monster.");
            System.out.println("You can now rescue the princess...");
            tellEnding();
        } else {
            System.out.println("Oh no! You are dead.");
            System.out.println("GAME OVER");
        }
    }

    private static class Gameplay extends TextBasedGame.Story implements TextBasedGame.StoryMode, TextBasedGame.SurvivalMode, TextBasedGame.Player {
        public final String[] path = {"left", "right", "left", "right"};
        public final String goLeft = "left";
        public final String goRight = "right";
        private String playerName = "";
        private int playerHealth = 0;
        private int playerDamage = 0;
        private int monsterHealth = 0;
        private int monsterDamage = 0;

        public Gameplay() {
            setPlayerName("Player");
            setPlayerHealth(100);
            setPlayerDamage(1);
            setMonsterHealth(100);
            setMonsterDamage(1);
        }

        @Override
        public String playerMove(String direction) {
            switch (direction.toUpperCase()) {
                case "R":
                    return gameplay.goRight;
                case "L":
                    return gameplay.goLeft;
                default:
                    return direction;
            }
        }

        @Override
        public void setPlayerName(String name) {
            this.playerName = name;
        }

        @Override
        public void playerAttack(boolean willAttack) {
            if (willAttack) {
                setMonsterHealth(getMonsterHealth() - getPlayerDamage());
                System.out.println("You deal " + getPlayerDamage() + " damage to the monster.");
                healthZero();
                System.out.println("Your Health: " + getPlayerHealth() + "\tMonster Health: " + getMonsterHealth());
            } else {
                setPlayerHealth(getPlayerHealth() - getMonsterDamage());
                System.out.println("The monster deal " + getMonsterDamage() + " damage to the you.");
                healthZero();
                System.out.println("Your Health: " + getPlayerHealth() + "\tMonster Health: " + getMonsterHealth());
            }
        }

        @Override
        public String getPlayerName() {
            return this.playerName;
        }

        @Override
        public void healthZero() {
            if (getPlayerHealth() <= 0) {
                setPlayerHealth(0);
            } else if (monsterHealth <= 0) {
                setMonsterHealth(0);
            }
        }

        @Override
        public void setPlayerHealth(int health) {
            this.playerHealth = health;
        }

        @Override
        public int getPlayerHealth() {
            return this.playerHealth;
        }

        @Override
        public void setPlayerDamage(int damage) {
            this.playerDamage = damage;
        }

        @Override
        public int getPlayerDamage() {
            return playerDamage;
        }

        @Override
        public void setMonsterHealth(int health) {
            this.monsterHealth = health;
        }

        @Override
        public int getMonsterHealth() {
            return monsterHealth;
        }

        @Override
        public void setMonsterDamage(int damage) {
            this.monsterDamage = damage;
        }

        @Override
        public int getMonsterDamage() {
            return monsterDamage;
        }


    }
}
