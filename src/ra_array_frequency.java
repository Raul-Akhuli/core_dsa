import java.util.Scanner;
import java.util.LinkedHashMap;

public class ra_array_frequency {

    public static void getfreq(int[] arr){
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();   // to print the element as per teh input
        for(int num : arr){
            freq.put(num,freq.getOrDefault(num, 0) +1);
        }

        System.out.println(freq);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements: ");
        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split("\\s+");
        int n = stringArray.length;

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }

        getfreq(arr);

        sc.close();
    }
}