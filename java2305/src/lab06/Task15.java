package lab06;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = 0; a + i <= b; i++) {
            System.out.print((a + i) + ";");
        }
        if (a>b) {
            System.out.println("Значение A должно быть не больше значения B");
        }
    }
}
