package OOP.Game;

public class TextBasedGame {

    protected interface StoryMode {
        String playerMove(String direction);
    }

    protected interface SurvivalMode {
        void playerAttack(boolean willAttack);

        void healthZero();
    }

    protected interface Player {
        String getPlayerName();

        void setPlayerName(String name);

        int getPlayerHealth();

        void setPlayerHealth(int health);

        int getPlayerDamage();

        void setPlayerDamage(int damage);

        int getMonsterHealth();

        void setMonsterHealth(int health);

        int getMonsterDamage();

        void setMonsterDamage(int damage);
    }

    protected static class Story {
        protected String[] Introduction = {
                "There is a princess who enjoys roaming the forest. ",
                "She entered a maze in the middle of the forest a year ago after seeing it. ",
                "The princess made it all the way to the end, but there was a trap. ",
                "The princess is now trapped at the end of the maze and unable to escape."
        };

        protected String[] Ending = {
                "You saved the princess's life. ",
                "You have done everything possible to complete your mission. ",
                "A month has passed. ",
                "You married the princess and led a happy life together.",
        };
    }
}
