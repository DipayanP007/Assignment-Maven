package com.Calculator.App;
import com.Calculator.Functions.Calculator;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        Calculator object = new Calculator();
        char choice;
        int number1, number2;
        Scanner scannerObject = new Scanner(System.in);
        while(true)
        {

            System.out.println("Press");
            System.out.println(" '+' : For Addition");
            System.out.println(" '-' : For Subtraction");
            System.out.println(" '*' : For Multiplication");
            System.out.println(" '/' : For Division");
            System.out.println(" '!' : To exit the Calculator");
            System.out.println("Enter the choice");
            choice = (scannerObject.next()).charAt(0);
            if(choice == '!') {

                System.out.println("Calculator closed");
                return;
            }
             System.out.println("Enter the first number:");
            number1 = scannerObject.nextInt();
            System.out.println("Enter the second number:");
            number2 = scannerObject.nextInt();

            switch (choice) {
                case '+':
                    System.out.println("The result of Addition is = " + object.add(number1, number2) + "\n\n");
                    break;
                case '-':
                    System.out.println("The result of Subtraction is = " + object.subtract(number1, number2) + "\n\n");
                    break;
                case '*':
                    System.out.println("The result of Multiplication is = " + object.multiply(number1, number2) + "\n\n");
                    break;
                case '/':
                    System.out.println("The result of Division is = " + object.divide((double)number1, (double)number2)+"\n\n");
                    break;
                default:
                    System.out.println("Incorrect Choice! Re-enter again\n\n");
            }
        }
    }
}
