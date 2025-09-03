import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class ra_array_remove_duplicate_return_consecutively{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array elements (separated by comma and space): ");
        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split("[, ]+");
        int n = stringArray.length;

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }
        Set<Integer> seen = new LinkedHashSet<>();          // to print the element as per teh input

        for(int num : arr){
            seen.add(num);
        }

        int count = 0;

        for(int num : seen){
            if(count > 0) System.out.print(",");

            System.out.print(num);
            count ++;
        }

        sc.close();
    }
}
