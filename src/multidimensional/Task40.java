package multidimensional;

import java.util.Random;
import java.util.Scanner;

public class Task40 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input n");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        int x, y, z;
        x = (n - 1) / 2;
        y = (n + 1) / 2;
        z = 1;
        while (z < 1 + (n * n)) {
            a[y++][x++] = z++;
            if (x == n) x = 0;
            if (y == n) y = 0;
            if (a[y][x] != 0) {
                y++;
                x--;
                if (x < 0) x = n - 1;
                if (y == n) y = 0;
            }
        }

        for (int i = 0; i<n;i++){
            for (int j = 0; j <n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
