import java.text.DecimalFormat;

public class Part2_Assign_Conv_RandNumGen {
    public static void main(String[] args) {
        //-------------------------------------------------------------------------------------------------------------
        //part 2 assignment and conversion
        //can assign var together
        int a,b,c,d = 4;
        //convert datatypes by casting in front of the var newVar = (datatype)var;
        int myInt = 4;
        double myDouble= (double)myInt;

        //DecimalFormat() obj which formats decimal value based on pattern
        //declare df obj with format and apply to a decimal var
        double pi = 3.1471245;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Pi_formatted -> 2 dec places: " + f.format(pi));

        //mixing diff num data types (int and double) in calc
        //int = int / int -> returns int, drops remainder
        //double = int / int -> returns double, drops remainder
        //double = (double) int / int; returns double w/ fractional remainder
        //int = int % int -> returns remainder as int
        //int i; i++ == ++i, i-- == --i (slight difference)

        //Math functions
        int num = Math.max(33,44); //num = 44
        //Random num gen
        int rand = (int) (Math.random()*100) + 1;
        //Math.random ouputs a random decimal val, must be converted to (int) to output whole num
        //Multiply to set max range (not max value,size of range), Add to set range's min val
        //random's range min and max values are inclusive (min is included in range, max range value = min+(range-1))
        //ex min = 1 (+1) range = 100 (*100), range = 1-100
        int rand1 = (int)(Math.random()*100); //0-100
        int rand2 = (int)(Math.random()*50) + 25; //25-75
        double rand3 = Math.random(); // rand decimal between 0-1
        double rand4 = Math.random()*500; //decimal 0-500
        double rand5 = Math.random() + 10; //rand decimal between 10-11
        double rand6 = (Math.random()*1) + 499; //decimal 499-500
        System.out.println("Random Num (0-100) \t" + rand1);
        System.out.println("Random Num (25-75) \t" + rand2);
        System.out.println("Random Num decimal (0-1) \t" + rand3);
        System.out.println("Random Num decimal (0-500) \t" + rand4);
        System.out.println("Random Num decimal (10-11) \t" + rand5);
        System.out.println("Random Num decimal (499-500) \t" + rand6);

    }
}
