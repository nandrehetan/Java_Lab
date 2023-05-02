public class trycatch1 {
    public static void main(String[] args){
        try {
            int a = 10 / 0; //Throws an exception

            //If an exception occurs, the remaining statements will not be executed
            System.out.println("Hetan is Good Boy");
        }
        catch (Exception e){
            System.out.println(e);

            //You can display custom message as well
            //System.out.println("Can't be divided by zero");
        }


    }
}
