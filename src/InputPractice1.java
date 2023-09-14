//(c) A+ Computer Science
//www.apluscompsci.com
//NAME - Harrison Velasco
//DATE - 9/14/23
//PURPOSE - Learn how to define, input, and print some variables and their values.

import java.util.Scanner;
public class InputPractice1 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        double doubleOne, doubleTwo;
        boolean boolOne, boolTwo;


        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();
        System.out.print("Enter a float :: ");
        doubleOne = keyboard.nextFloat();
        System.out.print("Enter a float :: ");
        doubleTwo = keyboard.nextFloat();
        System.out.print("Enter a bool, (true or false) :: ");
        boolOne = keyboard.nextBoolean();
        System.out.print("Enter a bool, (true or false) :: ");
        boolTwo = keyboard.nextBoolean();



        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println("float one = " + doubleOne);
        System.out.println("float two = " + doubleTwo);
        System.out.println("boolean one = " + boolOne);
        System.out.println("boolean two = " + boolTwo);


        //add output for all variables
    }

}