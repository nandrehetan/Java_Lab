import java.util.*;


public class Prob3_Part2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        int sz = str.length();

        String reverse = "";

        for(int i=sz-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }

        System.out.println(str);
        System.out.println(reverse);

        if(reverse.equals(str)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
}
