import java.util.*;

class Arithmetic {
    public int add(int num1, int num2){
        return num1+num2;
    }
}

class Adder extends Arithmetic {
    public Adder() {
        System.out.println("My superclass is : Arithmetic");
    }
}


public class Prob6 {
    public static void main(String[] args){
        Arithmetic obj = new Adder();

        System.out.println(obj.add(12, 30));
        System.out.println(obj.add(6,7));
        System.out.println(obj.add(17,3));
    }
}
