import java.util.Scanner;
public class ra_string_anagrams {

    public static boolean isanagrams(String input1, String input2){
        if(input1 == null || input2 == null) return false;
        if(input1.length() != input2.length()) return false;
        int[] freq = new int[256];
        for(char c : input1.toCharArray()) freq[c]++;
        for(char c : input2.toCharArray()){
            if(--freq[c] < 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first string: ");
        String input1 = sc.nextLine();

        System.out.print("\nenter the second string: ");
        String input2 = sc.nextLine();

        if (isanagrams(input1, input2)){
            System.out.println("They are Anagrams.");
        }
        else{
            System.out.println("Not Anagrams.");
        }
    }
}
