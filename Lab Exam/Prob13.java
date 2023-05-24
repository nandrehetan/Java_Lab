import java.util.*;

import javax.swing.plaf.ColorUIResource;

public class Prob13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns : ");
        int coloumns = sc.nextInt();

        int [][] mat = new int[rows][coloumns];

        System.out.println("Enter the elements of matrix : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<coloumns; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<coloumns; j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
