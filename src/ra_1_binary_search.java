import java.util.Scanner;
import java.util.Arrays;
public class ra_1_binary_search {
    public static int binarySearch(int[] arr,int n,int find){
        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = (low+high) / 2;
            if(find == arr[mid]){
                return mid;
            }
            else if(find > arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array element space separated: ");
        String[] stringArray = sc.nextLine().trim().split("\\s+");
        int n = stringArray.length;
        int[] intArray = new int[n];
        for(int i = 0; i < n; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        System.out.println("Ignore ths part if your array is already sorted 😊");
        Arrays.sort(intArray);
        for(int i = 0; i < n; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();


        System.out.print("enter the element to search: ");
        int find = sc.nextInt();
        int index = binarySearch(intArray,n,find);
        if(index < 0){
            System.out.println("element not present.");
        }
        else{
            System.out.println("element present at index " + index);
        }
    }
}
