package Recursion;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printAsc(n);
        System.out.println("\nFactorial of " + n + " is " + findFactorial(n));
    }


    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = findFactorial(n - 1);
        int fn = n * fnm1;
        return fn;
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
