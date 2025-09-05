import java.util.Scanner;
import java.util.HashMap;

public class ra_array_two_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array size: ");
        int n = sc.nextInt();

        System.out.println("enter the aray element");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the target element");
        int target = sc.nextInt();
        boolean flag = false;

        HashMap<Integer,Integer> pair = new HashMap<>();
        for(int i = 0; i < n; i++){
            int baki = target - arr[i];

            if(pair.containsKey(baki)){
                System.out.println(pair.get(baki) + "," + i);
                flag = true;
            }

            pair.put(arr[i], i);
        }

        if(!flag){
            System.out.println(-1 + "," + -1);
        }
    }
}