package MJ;
//ESCALONA, MARK JOHN B.
//BSIT 2.1B

import java.util.Scanner;

public class ExecuteGame {
    static Gameplay game = new Gameplay();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to this short Dating Simulator.");
        System.out.println("Please be wary of the delays I've put to give you time reading each");
        System.out.println("paragraph. The ending varies on your choices. Choose wisely.");
        System.out.println("The story is ambiguous. There is no exact definition of the other character here except they're");
        System.out.println("an extrovert and leaves the user to visualize who is their partner, whether it's boy to girl,");
        System.out.println("girl to boy, boy to boy, or girl to girl. The main character is an introvert to fit the roles.");
        System.out.print("Enter your name: ");
        game.setPlayerName(sc.nextLine());
        System.out.print("Press P to start playing, Player " + game.getPlayerName() + ".\n");
        switch (sc.nextLine()) {
            case "p":
            case "P":
                Intro();
                System.out.println("--------------------DAY 1--------------------");
                Day1();
                System.out.println("--------------------DAY 2--------------------");
                Day2();
                System.out.println("--------------------DAY 3--------------------");
                Day3();
                break;
            default:
                System.out.println("Do you not know how to read? Press P.");
                break;
        }
    }

    static void Intro() {
        System.out.println("--------------------INTRO--------------------");
        System.out.println(game.getPlayerName() + ": (First day of school. Boring as always. Everyone is so eager to meet everybody while");
        System.out.println("I'm just here waiting for the day to end. Though, I've always wondered how people are");
        System.out.println("destined to meet. They say it's by love, chance or by coincidence, but like that'll ever");
        System.out.println("happen to me. I easily get tired around people anyway.)");
        System.out.println("---------------------------------------------");
        System.out.println();
        wait(12000);
    }

    static void Day1() {
        System.out.println("A person approaches you with a smile on their face. Despite talking about coincidences,");
        System.out.println("you are greeted with a wholesome attitude. Your social skills weren't top-notch, so they");
        System.out.println("decided to engage the conversation with you first.");
        System.out.println();
        wait(10000);
        System.out.println("???: Hi friend! Seems that you're my seatmate for the rest of the year. Tell me, what's your name?");
        wait(6000);
        System.out.println(game.getPlayerName() + ": ...");
        wait(3000);
        System.out.println("???: Not the talkative one, eh? Right, then I'll let you guess my name.");
        wait(4500);
        System.out.println(game.getPlayerName() + ": (Is this person serious? Ugh, maybe they'll go away if I play along...)");
        wait(5000);
        System.out.println();
        System.out.print("What's their name?\n==> ");
        game.setCharacterName(sc.nextLine());
        System.out.println();
        System.out.println(game.getCharacterName() + ": W-what the?! Are you a psychic or something? Nah, I'm just kidding. You probably");
        System.out.println("saw my name on the student list, right?");
        wait(5000);
        System.out.println(game.getPlayerName() + ": Y-yeah.");
        wait(2000);
        System.out.println(game.getCharacterName() + ": Haha, I knew it. So uhm, can I ask your na-");
        wait(3000);
        System.out.println(game.getPlayerName() + ": " + game.getPlayerName() + ". M-my name is " + game.getPlayerName() + ".");
        wait(3000);
        System.out.println(game.getCharacterName() + ": Woah, are you really a psychic? You're pretty suspicious for someone who's not talkative...");
        wait(5000);
        System.out.println();
        System.out.println("You can clearly see " + game.getCharacterName() + "'s eyes go squint as they ask you suspiciously.");
        System.out.println();
        wait(4000);
        System.out.println(game.getPlayerName() + ": I-I'm not really good at socializing. A-and I've been into this type of s-situations");
        System.out.println("multiple times.");
        wait(4000);
        System.out.println(game.getCharacterName() + ": Fair enough. It's not often I encounter an introvert.");
        wait(5000);
        System.out.println(game.getCharacterName() + ": But you'll need a companion if you want to survive college. Bet there's going to be a lot of");
        System.out.println("group projects. So what do you say?");
        wait(6000);
        System.out.println();
        System.out.println("As much as you hate socializing, " + game.getCharacterName() + "'s deal wasn't so bad. You'll need their help when the time comes.");
        System.out.println();
        wait(5000);
        System.out.println(game.getPlayerName() + ": F-fine. But please go easy on me...");
        wait(3000);
        System.out.println();
        System.out.println("As you glanced to " + game.getCharacterName() + ", you can see their cheeks turn red, showing a sign of being flustered as soon");
        System.out.println("as they heard your response.");
        System.out.println();
        wait(4000);
        System.out.println(game.getCharacterName() + ": A-ah... Yeah! S-sure!");
        wait(2000);
        System.out.println(game.getCharacterName() + ": It's been nice knowing you, " + game.getPlayerName() + ". Uh, take care!");
        wait(4000);
        System.out.println();
        System.out.println("As soon as " + game.getCharacterName() + " left, you can't help but feel flustered as well.");
        System.out.println("Fortunately, you're pretty good at concealing your emotions and " + game.getCharacterName() + " didn't seem to noticed it as well.");
        System.out.println();
        wait(6000);
        System.out.println(game.getPlayerName() + ": (I just hope I did the right thing... They were too close to me!...)");
        wait(3000);
        System.out.println();
        System.out.println("You spend the day about what just happened.");
        System.out.println();
        wait(3000);
        game.setLikePoints(game.getLikePoints() + 10); // + 10 LIKE POINTS
    }

    static void Day2() {
        System.out.println("As always, your eyes are heavily focused on the novel you are reading. Until someone poked");
        System.out.println("at your shoulder. With a little effort, you turned around and know who that is.");
        System.out.println();
        wait(7000);
        System.out.println(game.getCharacterName() + ": Hey " + game.getPlayerName() + "! Let's go to the cafeteria, I'm getting hungry.");
        System.out.println("A: Go with " + game.getCharacterName());
        System.out.println("B: Decline");
        boolean loop = true;
        while (loop) {
            while (true) {
                String Day2Choice = sc.nextLine();
                if (Day2Choice.equalsIgnoreCase("A")) {
                    game.setLikePoints(game.getLikePoints() + 5); // + 5 LIKE POINTS
                    System.out.println(game.getPlayerName() + ": Sure. Let me prepare myself first.");
                    wait(3000);
                    System.out.println(game.getCharacterName() + ": Alright. I'll be waiting.");
                    wait(3000);
                    System.out.println();
                    System.out.println("You headed to the cafeteria with " + game.getCharacterName() + ".");
                    System.out.println();
                    wait(3000);
                    System.out.println(game.getCharacterName() + ": Hey, I'll order us something. Why don't you go find a seat for us?");
                    wait(3000);
                    System.out.println(game.getPlayerName() + ": O-okay...");
                    wait(2000);
                    System.out.println(game.getCharacterName() + ": Uh, what do you want to order?");
                    System.out.println("A: Same as yours");
                    System.out.println("B: Sandwich");
                    boolean loopFood = true;
                    while (loopFood) {
                        while (true) {
                            String Day2ChoiceFood = sc.nextLine();
                            if (Day2ChoiceFood.equalsIgnoreCase("A")) {
                                game.setLikePoints(game.getLikePoints() + 2); // + 2 LIKE POINTS
                                System.out.println(game.getCharacterName() + ": O-oh... Okay.");
                                wait(3000);
                                System.out.println();
                                System.out.println("You could see " + game.getCharacterName() + " blushing again. How cute.");
                                System.out.println();
                                wait(3000);
                                loopFood = false;
                                break;
                            } else if (Day2ChoiceFood.equalsIgnoreCase("B")) {
                                game.setLikePoints(game.getLikePoints() + 1); // + 1 LIKE POINTS
                                System.out.println(game.getCharacterName() + ": Alright.");
                                wait(1000);
                                loopFood = false;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    System.out.println(game.getCharacterName() + ": I'll be back with the food. Wait for me here.");
                    wait(3000);
                    System.out.println();
                    System.out.println("You agreed to wait for " + game.getCharacterName() + " and took out your novel and continued reading.");
                    System.out.println();
                    wait(7000);
                    System.out.println(game.getCharacterName() + ": I'm back! Here's your food " + game.getPlayerName() + ".");
                    wait(3000);
                    System.out.println(game.getCharacterName() + ": Oh! And don't worry about the payment. My treat.");
                    wait(3000);
                    System.out.println(game.getPlayerName() + ": N-no! I have to pay... I don't want to be a burden...");
                    wait(3000);
                    System.out.println(game.getCharacterName() + ": Please, I insist. You're my friend after all.");
                    System.out.println("A: Accept the offer");
                    System.out.println("B: Decline");
                    boolean loopTreat = true;
                    while (loopTreat) {
                        while (true) {
                            String Day2ChoiceTreat = sc.nextLine();
                            if (Day2ChoiceTreat.equalsIgnoreCase("A")) {
                                game.setLikePoints(game.getLikePoints() + 2); // + 2 LIKE POINTS
                                System.out.println(game.getPlayerName() + ": O-oh... A-alright, if you say so...");
                                wait(3000);
                                System.out.println(game.getCharacterName() + ": Mhm.");
                                wait(2000);
                                loopTreat = false;
                                break;
                            } else if (Day2ChoiceTreat.equalsIgnoreCase("B")) {
                                System.out.println(game.getPlayerName() + ": No. I-I insist...");
                                wait(3000);
                                System.out.println(game.getCharacterName() + ": Alright then.");
                                wait(2000);
                                System.out.println();
                                System.out.println("You handed out the money to " + game.getCharacterName() + ".");
                                System.out.println();
                                wait(2000);
                                loopTreat = false;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("As " + game.getCharacterName() + " handed your food, you accidentally touched their hand on the process.");
                    System.out.println();
                    wait(5000);
                    game.setLikePoints(game.getLikePoints() + 2); // + 2 LIKE POINTS
                    System.out.println(game.getCharacterName() + ": O-oh! U-uh, s-sorry...");
                    wait(3000);
                    System.out.println(game.getPlayerName() + ": N-no! I-it was my fault... my hands slipped because I-I was too focused on the novel...");
                    wait(5000);
                    System.out.println(game.getCharacterName() + ": I guess we're both sorry, eh?");
                    wait(3000);
                    System.out.println(game.getPlayerName() + ": Y-yeah, let's just e-eat...!");
                    wait(3000);
                    System.out.println();
                    System.out.println("You awkwardly ate with " + game.getCharacterName() + ".");
                    System.out.println();
                    wait(3000);
                    loop = false;
                    break;
                } else if (Day2Choice.equalsIgnoreCase("B")) {
                    game.setLikePoints(game.getLikePoints() + 2); // + 2 LIKE POINTS
                    System.out.println(game.getPlayerName() + ": S-sorry. I'm busy reading this.");
                    wait(2500);
                    System.out.println(game.getCharacterName() + ": O-oh... Okay, I'll see myself out then...");
                    wait(3000);
                    System.out.println();
                    System.out.println("You spend your day reading your novel.");
                    System.out.println();
                    wait(3000);
                    loop = false;
                    break;
                } else {
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Feeling drained out after school, you waited for the bus to arrive.");
        System.out.println("As you got into a bus, you sat close to the entrance. But what are the chances?");
        System.out.println("It seems that " + game.getCharacterName() + " happened to be sitting next to you.");
        System.out.println("You can't help but feel a bit flustered sitting very close to them.");
        System.out.println();
        wait(10000);
        System.out.println(game.getCharacterName() + ": H-hey... I didn't know you take the same route as I am.");
        wait(4000);
        System.out.println(game.getPlayerName() + ": Mm...");
        wait(2000);
        if (game.getLikePoints() >= 18) {
            System.out.println();
            System.out.println("As much as tired as you are, you can't help but fall asleep.");
            System.out.println();
            wait(4000);
            System.out.println("...");
            System.out.println();
            wait(10000);
            System.out.println(game.getPlayerName() + ": (Mmm... Oh crap! I fell asleep!)");
            wait(3000);
            System.out.println();
            System.out.println("As you regained your senses, you happened to be sleeping on " + game.getCharacterName() + "'s shoulder.");
            System.out.println("This makes things much awkward, especially the time you spent with them on the cafeteria.");
            System.out.println();
            wait(7000);
            System.out.println(game.getPlayerName() + ": Oh shoot! I-I'm sorry! I didn't mean to sleep on you...!");
            wait(3000);
            System.out.println(game.getCharacterName() + ": I-It's okay... I didn't want to wake you up either...");
            wait(4000);
            game.setLikePoints(game.getLikePoints() + 5); // + 5 LIKE POINTS
            System.out.println();
            System.out.println("You glanced at " + game.getCharacterName() + ", who seems to be blushing again.");
            System.out.println();
            wait(4000);
        }
        System.out.println();
        System.out.println("Despite how awkward the situation is, you decided to not say anything for the rest of the commute.");
        System.out.println();
        wait(4000);
    }

    static void Day3() {
        System.out.println("As you are walking to school, you happened to stumble upon " + game.getCharacterName() + ".");
        System.out.println("Is this fate? You always seem to encounter this person everyday. Nonetheless,");
        System.out.println("they saw you and reach out to you, running towards you.");
        System.out.println();
        wait(7000);
        System.out.println(game.getCharacterName() + ": Hey " + game.getPlayerName() + ". I'd like to ask something...");
        wait(4000);
        if (game.getLikePoints() >= 18) {
            System.out.println(game.getCharacterName() + ": W-would you like to go out sometime with me...?");
            wait(4000);
            System.out.println();
            System.out.println("As you glanced to " + game.getCharacterName() + ", they can't help but look flustered. How cute. Out of all");
            System.out.println("possible realities, " + game.getCharacterName() + " decided to make the first move. To save both of you from\nembarrassment, you sheepishly nod.");
            System.out.println();
            wait(6000);
            System.out.println(game.getPlayerName() + ": I-I wouldn't mind... going out with you...");
            wait(3000);
            System.out.println();
            System.out.println("Their eyes perked as soon as they heard your response.");
            System.out.println();
            wait(3000);
        } else if (game.getLikePoints() >= 12) {
            System.out.println(game.getCharacterName() + ": Uh, n-nevermind...");
            wait(2000);
        }
        System.out.println(game.getCharacterName() + ": We've been assigned to a pair project and I was wondering if you would like to pair with me?");
        wait(4000);
        System.out.println(game.getPlayerName() + ": S-sure. I'd like that.");
        wait(3000);
        System.out.println(game.getCharacterName() + ": Alright! I'll see you later then!");
        wait(4000);
        if (game.getLikePoints() >= 18) {
            System.out.println();
            System.out.println(game.getCharacterName() + " thrusted their fist into the air as if they were doing a victorious pose.");
            System.out.println("Seeing them act like that had you chuckling, and you smiled back like a star-struck person.");
            System.out.println();
            wait(7000);
            System.out.println("THE END");
            System.out.println("You got the BEST ENDING.");
            System.out.println("Like points earned: " + game.getLikePoints());
        } else if (game.getLikePoints() >= 12) {
            System.out.println();
            System.out.println("Despite how awkward the previous days you've been with " + game.getCharacterName() + ",");
            System.out.println("you can't help yourself but to be glad to have a companion as an introvert.");
            System.out.println();
            wait(5000);
            System.out.println("THE END");
            System.out.println("You got the FRIEND ENDING.");
            System.out.println("Like points earned: " + game.getLikePoints());
        }
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private static class Gameplay implements Game_Interface.Character, Game_Interface.LikeSystem, Game_Interface.Player {
        private String playerName = "";
        private String CharacterName = "";
        private int point = 0;

        public Gameplay() {
            setPlayerName("Player");
            setLikePoints(0);
        }

        public void setCharacterName(String CharacterName) {
            this.CharacterName = CharacterName;
        }

        public String getCharacterName() {
            return this.CharacterName;
        }

        public void setPlayerName(String name) {
            this.playerName = name;
        }

        public String getPlayerName() {
            return this.playerName;
        }

        public void setLikePoints(int like_point) {
            this.point = like_point;
        }

        public int getLikePoints() {
            return this.point;
        }

    }
}
