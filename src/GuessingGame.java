import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    Scanner keyboard = new Scanner(System.in);
    private int guessCount = 0;
    private final int UPPER_BOUND = 100;   // Maximum (inclusive) bound for number to be.
    int numberToGuess;


    private void createRandomNumber(){
        Random rnd = new Random();
        numberToGuess = rnd.nextInt(UPPER_BOUND);
    }

    private void greeting(){
        createRandomNumber();
        System.out.printf("Choose a number between 1 and %d.%n", UPPER_BOUND);
    }
    private int promptForGuess(){
        System.out.print("What is your guess? ");
        int userGuess = keyboard.nextInt();
        keyboard.nextLine();
        guessCount ++;
        return userGuess;
    }

    private boolean continueGuessing(int userGuess){
        if(userGuess == numberToGuess){
            System.out.println("Congratulations! You guessed the right answer which was " + numberToGuess);
            System.out.println("It took " + guessCount + " tries.");
            return false;
        }
        else if(userGuess < numberToGuess){
            System.out.println("Try again. Guess higher.");
            return true;
        }
        else if(userGuess > numberToGuess){
            System.out.println("Try again. Guess lower.");
            return true;
        }
        return true;
    }

    private void gameLoop(){
        while(continueGuessing(promptForGuess())){
        }
    }

    public void playGame(){
        greeting();
        gameLoop();
    }
}
