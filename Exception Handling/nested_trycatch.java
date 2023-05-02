import jdk.jshell.spi.ExecutionControlProvider;

public class nested_trycatch {
    public static void main(String[] args){
        try {
            try {
                int a = 100 /0;
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Hello World2");
            try {
                int[] arr = new int[3];
                arr[10] = 100;
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Hello World4");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
