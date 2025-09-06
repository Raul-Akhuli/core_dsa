// ra_array_move_zeros

import java.util.Scanner;
public class ra_array_move_zeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array element: ");
        String inputLine = sc.nextLine();
        String[] stringArray = inputLine.split("\\s+");
        int n = stringArray.length;

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }


        int interPos = 0;
        for(int num : arr){
            if(num != 0){
                arr[interPos++] = num;
            }
        }
        while(interPos < arr.length){
            arr[interPos++] = 0;
        }


        System.out.print("Resultent array is: [ ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.print("]");
    }
}