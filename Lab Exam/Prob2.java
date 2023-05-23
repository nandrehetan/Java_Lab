import java.util.*;

public class Prob2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();


        Map<String, Integer> countOfWords = new HashMap<String, Integer> ();
        String[] s  = str.split("\\s+");

        for(String ok : s){
            countOfWords.put(ok, countOfWords.getOrDefault(ok, 0)+1);
        }

        for (Map.Entry<String, Integer> entry : countOfWords.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value > 1){
                System.out.println("Key: " + key + ", Value: " + value);
            }
            
        }
    }
}
