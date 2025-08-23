import java.util.Scanner;
public class ra_array_2_rotate_an_array_by_k_steps {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements "+ n +" (space or enter separated): ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the position for rotation: ");
        int m = sc.nextInt();

        if(m >=0 && m < n){
            for(int i = m; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i < m; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            System.out.println("Invalid rotation index");
        }
    }
}
