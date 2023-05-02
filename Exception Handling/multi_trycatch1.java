public class multi_trycatch1 {
    public static void main(String[] args){
        try {
            int[] arr = new int[5];
            int p = 10/0;
            int q = arr[45];
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Illegal accessing of array");
        }
        System.out.println("Hetan is Genius");
    }
}
