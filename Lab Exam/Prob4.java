import java.util.*;

abstract class Vehicle {
    public abstract void move();
}

class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train extends Vehicle {
    public void move(){
        System.out.println("The Train runs on the track.");
    }
}

public class Prob4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of vehicle " );
        String s = sc.nextLine();

        switch(s){
            case "Helicopter" :
                Helicopter ob1 = new Helicopter();
                ob1.move();
            case "Car":
                Car ob2 = new Car();
                ob2.move();
            case "Train":
                Train ob3 = new Train();
                ob3.move();
        }
    }


}
