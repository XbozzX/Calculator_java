import java.util.Scanner;
import java.lang.Math;

public class version1_terminal {
    
    public static void main(String[] args) {
        System.out.println("----- Welcome to the calcutor -----");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("----- Service that we provide -----");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("-- [ADD] addiction  ex: (a + b)  --");
        System.out.println("-- [MIN] minus  ex: (a - b)      --");
        System.out.println("-- [MUL] multiple  ex: (a * b)   --");
        System.out.println("-- [DIV] Divide  ex: (a / b)     --");
        System.out.println("-- [POW] POWER  ex: (a^b)        --");
        System.out.println("-----------------------------------");

        Scanner option_customer = new Scanner(System.in);
        System.out.println("Enter any option- ");

        String option = option_customer.nextLine().toUpperCase();
        
        //System.out.println("data is " + option);

        if (option.equals("ADD")) {
            Scanner num_1 = new Scanner(System.in);
            System.out.println("Enter the first number- ");
            String number1 = num_1.nextLine();

            Scanner num_2 = new Scanner(System.in);
            System.out.println("Enter the Second number- ");            
            String number2 = num_2.nextLine();

            Double total = Double.parseDouble(number1) + Double.parseDouble(number2);
            System.out.println("total"+ " " + Double.toString(total));
        } else if (option.equals("MIN")) {
            Scanner num_1 = new Scanner(System.in);
            System.out.println("Enter the first number- ");
            String number1 = num_1.nextLine();

            Scanner num_2 = new Scanner(System.in);
            System.out.println("Enter the Second number- ");            
            String number2 = num_2.nextLine();

            Double total = Double.parseDouble(number1) - Double.parseDouble(number2);
            System.out.println("total"+ " " + Double.toString(total));
        } else if (option.equals("MUL")) {
            Scanner num_1 = new Scanner(System.in);
            System.out.println("Enter the first number- ");
            String number1 = num_1.nextLine();

            Scanner num_2 = new Scanner(System.in);
            System.out.println("Enter the Second number- ");            
            String number2 = num_2.nextLine();

            Double total = Double.parseDouble(number1) * Double.parseDouble(number2);
            System.out.println("total"+ " " + Double.toString(total));
        } else if (option.equals("DIV")) {
            Scanner num_1 = new Scanner(System.in);
            System.out.println("Enter the first number- ");
            String number1 = num_1.nextLine();

            Scanner num_2 = new Scanner(System.in);
            System.out.println("Enter the Second number- ");            
            String number2 = num_2.nextLine();

            Double total = Double.parseDouble(number1) / Double.parseDouble(number2);
            System.out.println("total"+ " " + Double.toString(total));
        } else if (option.equals("POW")) {
            Scanner num_1 = new Scanner(System.in);
            System.out.println("Enter the first number- ");
            String number1 = num_1.nextLine();

            Scanner num_2 = new Scanner(System.in);
            System.out.println("Enter the Second number- ");            
            String number2 = num_2.nextLine();

            Double total = Math.pow (Double.parseDouble(number1), Double.parseDouble(number2));
            System.out.println("total"+ " " + Double.toString(total));
        }
    }
}
