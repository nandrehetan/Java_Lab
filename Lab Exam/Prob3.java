import java.util.*;

public class Prob3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();


        String ok = "";
        int sz = s.length();
        
        for(int i=sz-1; i>=0 ;i--){
            char ch = s.charAt(i);
            ok = ok + ch;
        }
        System.out.println("Reversed String is : " + ok);
    }
}
