import java.util.Scanner;
public class ra_array_5_max_product_subarray {

    public static int maxProduct(int[] num){
        int cmax = num[0];
        int cmin = num[0];
        int maxproduct = num[0];

        for(int i = 1; i < num.length; i++){
            if(num[i] < 0){
                int temp = cmax;
                cmax = cmin;
                cmin = temp;
            }
            cmax = Math.max(num[i], cmax * num[i]);
            cmin = Math.min(num[i], cmin * num[i]);

            maxproduct = Math.max(maxproduct, cmax);
        }
        return maxproduct;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element (space or enter whatever): ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum product subarray: " + maxProduct(arr));
    }
}
