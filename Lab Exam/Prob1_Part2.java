import java.util.*;

public class Prob1_Part2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array : ");
        int sz1 = sc.nextInt();
        int arr1[] = new int[sz1];

        System.out.println("Enter elements of first array : ");
        for(int i=0; i<sz1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of Second array : ");
        int sz2 = sc.nextInt();
        int arr2[] = new int[sz2];

        System.out.println("Enter elements of second array : ");
        for(int i=0; i<sz2; i++){
            arr2[i] = sc.nextInt();
        }


        //Approach 1

        System.out.println("Common elements between given two arrays : ");
        for(int i=0; i<sz1; i++){
            for(int j=0; j<sz2; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }

        // Approach 2
        Set<Integer> common = new HashSet<Integer> ();
        for(Integer i : arr1){
            common.add(i);
        }
        System.out.println("Common elements between given two arrays : ");
        for(Integer j : arr2){
            if(common.contains(j)){
                System.out.println(j);
            }
        }

    }
}
