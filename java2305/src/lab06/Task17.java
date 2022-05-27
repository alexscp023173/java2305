package lab06;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (b>a) {
            System.out.println("От A до B");
            for (int i = 0; a + i <= b; i++) {
                System.out.print((a+i) + " ");
            }
        }
        if (a>b) {
            System.out.println("От B до A");
            for (int i = 0; b + i <= a; i++) {
                System.out.print((b + i) + " ");
            }
        }
        if (a==b) {
            System.out.println("Границы равны");
            System.out.println(a);
        }
    }
}
