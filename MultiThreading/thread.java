import java.lang.*;
import java.util.*;

class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class thread {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);
        thr.start();
    }
}
