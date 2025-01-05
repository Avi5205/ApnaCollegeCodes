package Recursion;

public class Main {
    public static void main(String[] args) {
        int n = 25;
        printDec(n);
        printAsc(n);
        System.out.println("\nFactorial of " + n + " is " + findFactorial(n));
        System.out.println("Sum of Natural number:" + n + " = " + sumOfNaturalNumber(n));
        System.out.println("Fibonacci of " + n + " is " + fib(n));


    }

    //  sum of N fibonacci series
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int sumOfNaturalNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumber(n - 1);
    }

    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);

    }

    public static void printAsc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printAsc(n - 1);
        System.out.print(n + " ");
    }
}
