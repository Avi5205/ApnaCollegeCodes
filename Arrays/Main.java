package Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key NOT found");
        } else {
            System.out.println("Key " + key + " is at index " + index);
        }
        int largestValue = getLargestAndSmallest(numbers);
        System.out.println("Largest value from the given array is " + largestValue);
        System.out.println("index for binary search is " + binarySearch(numbers, key));

        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        printPairs(numbers);
    }

    //    O(n2)
    public static void printPairs(int[] numbers) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
    }

    public static void reverseArray(int[] numbers) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    //O(logn)
    public static int binarySearch(int[] number, int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //O(n)
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int getLargestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is " + smallest);
        return largest;
    }
}
