import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    Scanner keyboard = new Scanner(System.in);
    private int guessCount = 0;
    private int upperBound = 100;   // Maximum (inclusive) bound for number to be.
    int numberToGuess;


    private void createRandomNumber(){
        Random rnd = new Random();
        numberToGuess = rnd.nextInt(upperBound);
    }

    private void greeting(){
        System.out.printf("Choose a number between 1 and %d.", upperBound);
    }
    private int promptForGuess(){
        System.out.print("What is your guess? ");
        int userGuess = keyboard.nextInt();
        keyboard.nextLine();
        guessCount ++;
        return userGuess;
    }

    private boolean checkGuess(int userGuess){
        if(userGuess == numberToGuess){
            System.out.println("Congratulations! You guessed the right answer which was " + numberToGuess);
            return true;
        }
        else if(userGuess < numberToGuess){
            System.out.println("Try again. Guess higher.");

        }
        else if(userGuess > numberToGuess){
            System.out.println("Try again. Guess lower.");

        }
        return false;
    }

    
}
