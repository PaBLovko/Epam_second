package multidimensional;

import java.util.Random;
import java.util.Scanner;

public class Task38 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input n");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int k = 0; k < n; k++) {
                a[i][k] = random.nextInt(100)+1;
                b[i][k] = random.nextInt(100)+1;
            }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(b[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print((c[i][k] = b[i][k] + a[i][k])+" ");
            }
            System.out.println();
        }

    }
}
