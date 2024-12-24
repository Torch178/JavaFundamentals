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

        //Welcome user, start game
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Correctly guess the random number I've selected between 1 and 100");

        do{
            //Begin Loop, collect input
            System.out.println("Guess the number (or enter 'quit' to exit): ");
            entry = input.next();

            //Check if user wants to quit
            if(entry.equalsIgnoreCase("q") || entry.equalsIgnoreCase("quit") ){
                System.out.println("You quit, GAME OVER.");
                System.out.println("Total Guesses: " + num_guesses + "\t Correct Number: " + rand);
                break;
            }

            //Use try catch to prevent user from entering improperly formatted number
            try{
                //count guesses, pull int value from input
                num_guesses++;
                num = Integer.parseInt(entry);

                //Fail state - Too high
                if(num < rand){
                    System.out.println("Number is too low, try again.");
                }
                //Fail state - Too low
                else if (num > rand){
                    System.out.println("Number is too high, try again.");
                }
                //Success State, break from loop
                else{
                    System.out.println("Correct! You guessed the right number in " + num_guesses + " attempt(s)!");
                    break;
                }
            }

            //output error msg for incorrect input format, rerun game loop.
            catch(NumberFormatException e){
                System.out.println("Enter a valid number or 'q' to quit game. Try Again!");
            }
        }while(true);
    }
}