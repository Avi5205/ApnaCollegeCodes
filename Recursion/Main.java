package Recursion;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 9, 5};
        int n = 5;
        printDec(n);
        printAsc(n);
        System.out.println("\nFactorial of " + n + " is " + findFactorial(n));
        System.out.println("Sum of Natural number:" + n + " = " + sumOfNaturalNumber(n));
        System.out.println("Fibonacci of " + n + " is " + fib(n));
        System.out.println(isSorted(arr, 0));
        System.out.println(findFirstOccurrence(arr, 5, 0));
        System.out.println(findLastOccurrence(arr, 5, 0));
    }

    public static int findLastOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = findLastOccurrence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int findFirstOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return findFirstOccurrence(arr, key, i + 1);
    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
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
