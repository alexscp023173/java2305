package lab06;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 0;
        for (int i = 0; i<=n; i++) {
            System.out.println(i + " - " + x);
            x++;
        }
        if (x>=3) {
            System.out.println();
        }
    }
}
