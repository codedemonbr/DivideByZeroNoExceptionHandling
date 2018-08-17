package com.codedemonbr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  DivideByZeroNoExceptionHandling {

    public static int quocient(int numerator, int denominator)
        throws ArithmeticException
    {
        return numerator / denominator;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try
            {
                System.out.println("Please enter a numerator: ");
                int numerator = scanner.nextInt();
                System.out.println("Please enter a denominator: ");
                int denominator = scanner.nextInt();
                int result = quocient(numerator, denominator);
                System.out.println("Numerator: " + numerator);
                System.out.println("Denominator: " + denominator);
                System.out.println("Result: " + result);
                continueLoop = false;
            }catch (InputMismatchException inputMismatchException)
            {
                System.err.println("Exeption: " + inputMismatchException);
                scanner.nextLine();
                System.out.println("You must enter integers. Please try again.\n");
                continueLoop = true;
            }catch (ArithmeticException arithmeticExpeption)
            {
                System.err.println("Exception: " + arithmeticExpeption);
                System.out.println("Zero is a invalid denominator. Please try again. \n\n");;
                continueLoop = true;
            }
        }while (continueLoop);
    }
}
