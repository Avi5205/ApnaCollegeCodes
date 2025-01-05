package CommonPackage;

public class Q1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 5},
                {3, 4, 9},
                {6, 7, 10}};
        searchKey(arr, 6);
    }

    public static void searchKey(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                    System.out.print("Found the key at (" + i + "," + j + ")");
                }
            }
        }
    }
}
