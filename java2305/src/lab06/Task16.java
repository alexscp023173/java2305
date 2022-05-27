package lab06;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (b>=a) {
            System.out.print("{" + " ");
            for (int i = 0; b + i >=a; i--) {
                System.out.print((b + i) + " ");
            }
            System.out.print("}");
        }

        if (a>b) {
            System.out.println("Значение A должно быть не больше значения B");
        }
    }
}
