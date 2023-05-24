import java.util.*;

public class Prob15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer> ();
        arr.add(20);
        arr.add(30);
        arr.add(40);

        //Using for loop
        System.out.println("Using for loop");
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();


        //Using Iterator
        System.out.println("Using Iterator");
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //Using advance for loop
        System.out.println("Using advanced for loop");
        for(Integer ok : arr ){
            System.out.print(ok+" ");
        }
        System.out.println();

    }
}
