package Methods;

public class Main {

    public static void main(String[] args) {
        System.out.println("Factorial: " + factorials(4));
        System.out.println("Bin Co-eff: " + binCoff(5, 2));
        System.out.println("Is Prime: " + isPrime(10));
        primeNumberRange(20);
        binaryToDecimal(1011);
        if (isPalindrome(1211)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(int n) {
        int number = n;
        int reverse = 0;

        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }

    public static void binaryToDecimal(int n) {
        int myNum = n;
        int pow = 0;
        int dec = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("Decimal of " + myNum + " is " + dec);
    }


    public static void primeNumberRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Handle numbers less than 2
        }
        if (n == 2) {
            return true; // 2 is prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Change < to <=
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int binCoff(int n, int r) {
        int a = factorials(n);
        int b = factorials(r);
        int a_b = factorials(n - r);

        int res = a / (b * a_b);
        return res;
    }

    public static int factorials(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

}
