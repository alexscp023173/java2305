package lab06;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        int x = 0;
        int a = 1;
        while (x<limit) {
            System.out.println(x);
            x = x+a;
            a = a+1;
        }
    }
}
