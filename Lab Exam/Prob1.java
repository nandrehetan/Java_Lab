import java.util.*;

public class Prob1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elemenets : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Approach 1
        Set<Integer> unique = new HashSet<Integer> ();
        for(int i=0; i<n; i++){
            unique.add(arr[i]);
        }
        
        System.out.println("Unique elements are : ");
        for(Integer ok: unique){
            System.out.println(ok);
        }
        
    }
}
