package Pattern;

public class PrintHalfPyramidPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int line = 1; line <= n; line++) {
            //calculate the number of lines
            for (int num = 1; num <= line; num++) {
                //Print the number as per line number
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
