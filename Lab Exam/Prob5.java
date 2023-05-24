import java.util.*;

abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private int sub1;
    private int sub2;
    private int sub3;

    public A (int sub1, int sub2, int sub3){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public double getPercentage(){
        int total = sub1+sub2+sub3;
        return (total/3.0);
    }
}


class B extends Marks {
    private int sub1;
    private int sub2;
    private int sub3;
    private int sub4;

    public B(int sub1, int sub2, int sub3, int sub4){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    public double getPercentage() {
        int total = sub1+sub2+sub3+sub4;
        return (total/4.0);
    }
}

public class Prob5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of A : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Enter marks of B : ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();

        A c1 = new A(a,b,c);
        double marks_of_a = c1.getPercentage();

        B c2 = new B(p,q,r,s);
        double marks_of_b = c2.getPercentage();

        System.out.println("Percentage of A : " + marks_of_a);
        System.out.println("Percentage of B : " + marks_of_b);
        

    }
}
