import java.util.Scanner;
import java.util.Arrays;

public class ra_array_8_longest_consecutive_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("enter the elements (space or enter separated): ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // sort the array

        int bestStart = arr[0];
        int bestLength = 1;
        int currStart = arr[0];
        int currLength = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currLength++;
            } else if (arr[i] != arr[i - 1]) {
                // reset
                if (currLength > bestLength) {
                    bestLength = currLength;
                    bestStart = currStart;
                }
                currStart = arr[i];
                currLength = 1;
            }
        }

        // final check
        if (currLength > bestLength) {
            bestLength = currLength;
            bestStart = currStart;
        }

        System.out.print("Longest consecutive sequence: ");
        for (int i = 0; i < bestLength; i++) {
            System.out.print((bestStart + i) + " ");
        }
    }
}
