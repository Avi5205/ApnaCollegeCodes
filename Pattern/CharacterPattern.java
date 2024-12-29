package Pattern;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines: \n");
        int n = scanner.nextInt();
        char cha = 'A';
        for (int line = 1; line <= n; line++) {
            for (int ch = 1; ch <= line; ch++) {
                System.out.print(cha);
                cha++;
            }
            System.out.println();
        }
    }
}
