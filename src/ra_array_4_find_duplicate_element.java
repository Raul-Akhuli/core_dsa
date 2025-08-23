// Example: Input: [1,3,4,2,2] Output: 2

import java.util.Scanner;
import java.util.HashSet;
public class ra_array_4_find_duplicate_element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        /*
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.print("Repeating elements: ");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
         */
                                                            // alternative solutions this have time and space complexity O(n)

        /*
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;

        for (int num : arr) {
            if (!set.add(num)) {   // if already present
                duplicate = num;
                break;             // stop at first duplicate
            }
        }

         */
        HashSet<Integer> check = new HashSet<>();
        HashSet<Integer> repeating = new HashSet<>();
        for(int num : arr){
            if(!check.add(num)){
                repeating.add(num);
            }
        }


        /*
        Negative technique --------------------------------

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);   // take absolute (in case already marked)
            if (nums[index] < 0) {
                return index;  // found duplicate
            }
            nums[index] = -nums[index]; // mark as visited
        }
        return -1;

                                                               // these methods have time and space complexity O(n) , O(1)
        /*
        int slow = nums[0];
        int fast = nums[0];

        // Step 1: Detect cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Step 2: Find entry point (duplicate)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
         */

        System.out.println("Repeating element: " + repeating);
    }
}
