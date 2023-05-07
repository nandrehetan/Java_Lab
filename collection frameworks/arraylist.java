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
        
    }
}
