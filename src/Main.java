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
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Correctly guess the random number I've selected between 1 and 100");

        do{
            System.out.println("Guess the number (or enter 'quit' to exit): ");
            entry = input.next();

            if(entry.equalsIgnoreCase("q") || entry.equalsIgnoreCase("quit") ){
                System.out.println("You quit, GAME OVER.");
                System.out.println("Total Guesses: " + num_guesses + "\t Correct Number: " + rand);
                break;
            }
            try{
                num_guesses++;
                num = Integer.parseInt(entry);
                if(num < rand){
                    System.out.println("Number is too low, try again.");
                }
                else if (num > rand){
                    System.out.println("Number is too high, try again.");
                }
                else{
                    System.out.println("Correct! You guessed the right number in " + num_guesses + " attempt(s)!");
                    break;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Enter a valid number or 'q' to quit game. Try Again!");
            }


        }while(true);


    }
}