// ra_array_subarray_with_largest_sum

import java.util.Scanner;

public class ra_subarray_with_largest_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements space separeated: ");
        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split("\\s+");
        int n = stringArray.length;

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }

        int currSum = arr[0];
        int maxSum = arr[0];
		
		
		/*for(int i = 0; i < n; i++){
			currSum = Math.max(arr[i], arr[i]+currSum);
			maxSum = Math.max(maxSum, currSum);
		}
		
		System.out.println("largest sum is: " + maxSum);
		*/


        int start = 0; int end = 0; int tempstart = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[i]+currSum){
                currSum = arr[i];
                tempstart =i;
            }
            else{
                currSum = arr[i] + currSum;
            }

            if(currSum > maxSum){
                maxSum = currSum;
                start = tempstart;
                end = i;
            }
        }
        System.out.print("subarray: [ ");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i]);
            if(i != end){
                System.out.print(", ");
            }

        }
        System.out.print(" ]");
        System.out.println("\nlargest sum is: " + maxSum);
    }
}