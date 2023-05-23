import java.util.*;


public class Prob16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string : ");
        String s = sc.nextLine();
        String[] str = s.split("\\s+");

        Map<String, Integer> mp = new HashMap<String, Integer> ();

        for(String ok : str){
            mp.put(ok, mp.getOrDefault(ok, 0)+1);
        }

        for(Map.Entry<String, Integer> entry : mp.entrySet()){
            String key = entry.getKey();
            Integer val = entry.getValue();

            System.out.println(key +" "+ val);
        }
    }
}
