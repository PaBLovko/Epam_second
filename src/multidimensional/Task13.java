package multidimensional;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n");
        int n = in.nextInt();
        if (n % 2 != 0) n--;
        int[][] a = new int[n][n];

        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0)
                for (int j = 0; j < n; j++)
                    a[i - 1][j] = j + 1;
            else
                for (int j = 0; j < n; j++)
                    a[i - 1][j] = n - j;

        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
