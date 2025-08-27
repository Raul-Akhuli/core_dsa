import java.util.Scanner;
public class ra_array_5_max_product_subarray_elements {

    public static int maxProduct(int[] num){
        int cmax = num[0];
        int cmin = num[0];
        int maxproduct = num[0];
        int start =0;
        int end = 0;
        int tempstart = 0;


        for(int i = 1; i < num.length; i++){

            if(num[i] < 0){
                int temp = cmax;
                cmax = cmin;
                cmin = temp;
            }

            if(num[i] > cmax * num[i]){
                cmax = num[i];
                tempstart = i;
            }
            else{
                cmax = cmax * num[i];
            }

            cmin = Math.min(num[i], cmin * num[i]);

            if(cmax > maxproduct){
                maxproduct = cmax;
                start = tempstart;
                end = i;
            }
        }
        System.out.print("Subarray: [");
        for(int i = start; i <= end; i++){
            System.out.print(num[i] + (i < end ? ", ": ""));
        }
        System.out.println("]");

        return maxproduct;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("enter the elements (space or enter separated ): ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("the product is: " + maxProduct(arr));
    }
}
