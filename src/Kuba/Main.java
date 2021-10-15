package Kuba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean error;
        long n1 = 0;
        long n2 = 0;
        char mathSymbol='0';

            do {
                error=false;
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter first integer: ");
            if (scanner1.hasNextInt()) {
                n1 = scanner1.nextLong();

            } else {error = true;
                System.out.println("You can only enter integer");}
            }while (error);

            do {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter mathematical symbol: (+, -, /, *)");
                mathSymbol = scanner2.next().charAt(0);
                if (!isMathSymbolValid(mathSymbol)){
                        System.out.println("You can only enter +, -, / or *");
                    }
            }while (!isMathSymbolValid(mathSymbol));

            do {
                error=false;
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Enter second integer: ");
                if (scanner3.hasNextInt()) {
                    n2 = scanner3.nextLong();
                } else {error = true;
                    System.out.println("You can only enter integer");}
            }while (error);

        switch (mathSymbol) {
            case '+' -> add(n1, n2);
            case '-' -> subtract(n1, n2);
            case '*' -> multiply(n1, n2);
            case '/' -> divide(n1, n2);
        }
    }

    public static void divide(long n1, long n2)  {
        if (n2!=0){
            double result =  (double) n1 / (double) n2;
            System.out.println(result);}
        System.out.println("Can't divide by zero."); }

    public static void subtract(long n1, long n2){
        double result = n1 - n2;
        System.out.println(result); }

    public static void multiply(long n1, long n2){
        long result = n1 * n2;
        System.out.println(result); }

    public static void add(long n1, long n2){
        long result = n1 + n2;
        System.out.println(result); }

    public static boolean isMathSymbolValid(char mathSymbol){
        return mathSymbol == '+' || mathSymbol == '-' || mathSymbol == '/' || mathSymbol == '*';
    }
}
