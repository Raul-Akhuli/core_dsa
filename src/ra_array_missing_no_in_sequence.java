import java.util.Scanner;
import java.util.Arrays;

public class ra_array_missing_no_in_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by space:");
        String[] input = sc.nextLine().trim().split("\\s+");

        int n = input.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        int bestMissing = -1;
        int bestLength = 0;

        for (int i = 0; i < n; ) {
            int start = arr[i];
            int prev = arr[i];
            int count = 1;
            int missing = -1;
            boolean validRun = true;

            i++;
            while (i < n) {
                if (arr[i] == prev) {
                    i++; // skip duplicates
                    continue;
                }
                if (arr[i] == prev + 1) {
                    count++;
                    prev = arr[i];
                } else if (arr[i] == prev + 2 && missing == -1) {
                    // exactly one missing candidate
                    missing = prev + 1;
                    count += 2; // count the missing as part of sequence
                    prev = arr[i];
                } else {
                    break; // gap > 2 or second missing → stop this run
                }
                i++;
            }

            // Choose the best (longest) run
            if (count > bestLength) {
                bestLength = count;
                if (missing != -1) {
                    bestMissing = missing;
                } else {
                    bestMissing = prev + 1; // next after last if no missing inside
                }
            }
        }

        System.out.println("Missing number: " + bestMissing);
    }
}
