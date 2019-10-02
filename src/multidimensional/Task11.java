package multidimensional;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input n");
        int n = in.nextInt();
        System.out.println("Input m");
        int m = in.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int k = 0; k < m; k++)
                a[i][k] = random.nextInt(100)+1;

        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 1; i < n+1; i++)
            if(i % 2 != 0) {
                for (int j = m-1; j != -1; --j){
                    System.out.print(a[i-1][j]+" ");
                }
                System.out.println();
            }
            else {
                for (int j = 0; j < m; ++j){
                    System.out.print(a[i-1][j]+" ");
                }
                System.out.println();
            }

    }
}
