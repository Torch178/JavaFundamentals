public class Part1_Variables_Datatypes {
    public static void main(String[] args) {
        //part1
        int my_age = 30;// Java int range -> -2b(billion) to 2b
        byte var_byte = 23; //-128 to 127
        short my_monthly_pay = 12345; //-32768 to 32768
        long num_ants = 98_459_389_345_345L; //-9,223,372,036,854,775,808

        float my_pay = 3456.789f; //decimal data type. 4 bytes. fractions
        double total_area = 4085334234.234; //8 bytes, no suffix (L,f,etc.) required

        char my_initial = 'R';
        boolean is_payday = true;
        String my_city = "Auckland";


        //assignment
        int month = 10;
        int day = 12;
        final int MON_AVG = 30; //final == constant other languages
        //write constants (final var) in UPPERCASE - BEST PRACTICES
        int total_days = (month * MON_AVG) + day;

        System.out.println("=====================");
        System.out.printf("Month to Date: %d\t Days: %d\t Total Days: %d \n", month, day, total_days);
        //printf allows for variable formatting ("%datatype", var_name)

        //sout = shortcut in IDE for print statement
        double pi = 3.1471245;
        System.out.printf("My city: %12s\t Pi: %.2f", my_city, pi);
        //number before datatype in %d stipulates the num of characters to be output, .2 sets num of decimal places

        System.out.print("=====================\n");
    }

}
