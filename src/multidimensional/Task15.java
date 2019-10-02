package multidimensional;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n");
        int n = in.nextInt();
        if (n % 2 != 0) n--;
        int[][] a = new int[n][n];
        int k = 0;
        for (int i = 1; i < n + 1; i++)
            a[i - 1][k] = n - k++ ;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
