import java.util.*;

public class Solution {
    private static int swaps = 0;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] =  scanner.nextInt();
        }
        scanner.close();

        bubbleSort(array);

        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);
    }

    public static void bubbleSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        boolean swapped = true;
        int endOffSet = 0;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < array.length - endOffSet; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i-1, i);
                    swapped = true;
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        swaps++;
    }
}
