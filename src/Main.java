import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //declare and initialize variables for the game
        int rand = (int)(Math.random()*100) + 1;
        int num_guesses = 0;
        int num;
        String entry;
        Scanner user_input = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Correctly guess the random number I've selected between 1 and 100");
        System.out.println("Number is too low, try again.");
        System.out.println("Number is too high, try again.");
        System.out.println("Guess the number (or enter 'quit' to exit): ");
        System.out.println("Correct! You guessed the right number in " + num_guesses + " attempts!");
        do{

        }while(true);


    }
}