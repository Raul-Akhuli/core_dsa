import java.util.Scanner;
public class ra_string_upper_lower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string: ");
        char[] charArray = sc.nextLine().trim().toCharArray();
        int n = charArray.length;
        char[] changed = new char[n];

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                changed[i] = Character.toUpperCase(charArray[i]);
            }
            else{
                changed[i] = charArray[i];
            }
        }
        System.out.println("output: " + new String(changed));
    }
}
