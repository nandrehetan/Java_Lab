import java.lang.*;

class Myth extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            try {
                System.out.println(i);
                Myth.sleep(1000);
            }
           catch (Exception e){
               System.out.println(e);
           }
        }
    }
}

public class thread1 {
    public static void  main(String[] args){
        Myth tt = new Myth();
        tt.start();
    }
}

