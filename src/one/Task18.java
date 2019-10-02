package one;

import java.util.Scanner;

public class Task18 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int i;
        boolean fl = false;
        System.out.println("Первый кубик:");
        a[1] = in.nextInt();
        System.out.println("Второй кубик:");
        a[2] = in.nextInt();
        for(i = 3; i<10;i++){
            if ((10-a[i-1]-a[i-2]>6) || (10-a[i-1]-a[i-2]<1)) fl=true;
            else
                a[i]=10-a[i-1]-a[i-2];
        }
        if (fl) System.out.println("Решений нет");
        else
        for (i=1; i<10;i++)
            System.out.println(a[i]);
    }
}
