import java.util.*;

public class arraylist {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Hetan");
        arr.add("Hemant");
        arr.add("Nandre");
        arr.add("Hetan");
        System.out.println(arr.size());
        System.out.println(arr);
        arr.remove("Hemant");
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.contains("Nandre"));
        
        
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(100);
        arr1.add(99);
        arr1.add(98);
        arr1.add(97);
        System.out.println(arr1.size());
        System.out.println(arr1);

        Collections.sort(arr1); //Sorting the list
        System.out.println(arr1);
        
    }
}
