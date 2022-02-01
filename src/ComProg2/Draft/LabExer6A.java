package ComProg2.Draft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class LabExer6A {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //get the location of Documents folder in user's home directory
        //this code is use if the program will be run in other devices
        String location = System.getProperty("user.home") + File.separator + "Documents\\words.txt";
        Path path = Paths.get(location);
        boolean isFileExist = Files.exists(path);

        //if file does exit, the program will run
        //make sure that the word.txt file is already created in Documents folder
        if (isFileExist) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(location));
                long numberOfLines = Files.lines(path).count(); //get the number of lines in the file
                if (numberOfLines <= 1) {
                    System.out.println("The file's content is not enough/invalid.");
                } else {
                    //this randomGenerator will be error if the number of lines is less than or equal to one
                    for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, (int) numberOfLines); i++) {
                        reader.readLine();
                    }

                    //we want to make the word Capitalized, so it will be easy to compare it to the user's guess
                    String selectedWord = reader.readLine().toUpperCase();
                    Set<Integer> indexOfChangableLetters = new LinkedHashSet<>();

                    //the randomNumber() will decide how many letter will be change
                    int numOfChangableLetters = randomNumberForChanging(selectedWord.length());

                    //this while loop will make the list of random index
                    while (indexOfChangableLetters.size() < numOfChangableLetters) {
                        //the randomNumber() will decide which index will be change
                        indexOfChangableLetters.add(randomNumberForIndex(selectedWord.length()));
                    }

                    String changedWord; //variable for changed selected word

                    //this for loop will change some letters with "?" mark
                    String s = selectedWord; //temporary string variable for replacing some letters with "?"
                    for (int i : indexOfChangableLetters) {
                        //for every list of index from the set;
                        // this number will be used to select the index from the string
                        //the selected index will get the character and replace with "?" mark
                        s = s.replace(s.charAt(i), '?');
                    }

                    //pass the value of String s to the variable "changedWord"
                    //this variable will be used for the guessing game
                    changedWord = s;

                    //this while loop will run until the user guess the word
                    do {
                        System.out.println("Guess the word: " + changedWord);
                        //this while loop will give the user a chance to guess the current letter repeatedly
                        //if he/she input a wrong answer
                        while (true) {
                            System.out.print("Answer: ");
                            String input = read.nextLine();
                            char guessedLetter = input.toUpperCase().charAt(0); //only gets the first the letter of input


                            //temporarily make the changeWord to array
                            char[] checkWord = changedWord.toCharArray();

                            //the default is false because it will only become true if the guess is correct
                            boolean letterExist = false;

                            //this for loop will check if the guessed letter exist in the word
                            for (int x = 0; x < selectedWord.length(); x++) {
                                //if the guessed letter exist, then it will show where the correct spot of the letter
                                if (guessedLetter == selectedWord.charAt(x)) {
                                    checkWord[x] = guessedLetter;
                                    letterExist = true;
                                }
                            }

                            //covert the array to a string
                            changedWord = String.valueOf(checkWord);

                            if (letterExist) {
                                System.out.println("Whoa! You guess some correct letter.");
                                break;
                            } else {
                                System.out.println("Wrong! The guess letter is not in the word.");
                            }
                        }
                    } while (!changedWord.equalsIgnoreCase(selectedWord)); //if this is false then the loop will stop

                    System.out.println();
                    System.out.println("The Word: " + selectedWord);
                    System.out.println("Congratulations! You guessed the word.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static int randomNumberForChanging(int stringLength) {
        //the minimum is one because we want at least one letter is replaced with "?" mark
        int min = 1;

        //this prevents the obvious words
        if (stringLength > 3) {
            min = 3;
        }
        return ThreadLocalRandom.current().nextInt(min, stringLength);
    }

    private static int randomNumberForIndex(int stringLength) {
        //the minimum is zero because we want the randomizer to get the index of zero of string
        int min = 0;
        return ThreadLocalRandom.current().nextInt(min, stringLength);
    }
}
