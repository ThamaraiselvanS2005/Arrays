

package Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int[][] mat = new int[3][3];

        for(int row = 0 ; row < mat.length; row++)
        {
            for(int col =0 ; col< mat.length; col++)
            {
                mat[row][col] = scan.nextInt();
            }
        }

        for(int row = 0 ; row < mat.length; row++)
        {
            for(int col =0 ; col< mat.length; col++)
            {
               System.out.print(mat[row][col] + " ");
            }
            System.out.println(" ");
        }


    }
}

