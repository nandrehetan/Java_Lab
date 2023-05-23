import java.util.*;


public class Prob23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter array elements : ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Boolean> hmap = new HashMap<Integer, Boolean>();

        for(Integer a : arr){
            hmap.put(a, true);
        }

        for(Integer a : arr){
            if(hmap.containsKey(a-1)){
                hmap.put(a, false);
            }
        }

        int ans = 0;    
        for(Integer a : arr){
            if(hmap.get(a) == true){
                int ok1 = 1;
                int start = a;

                while(hmap.containsKey(ok1+start)){
                    ok1++;
                }

                ans = Math.max(ans, ok1);
            }
        }

        System.out.println("Maximum length of consecutive subsequence is : ");
        System.out.println(ans);







    }
}
