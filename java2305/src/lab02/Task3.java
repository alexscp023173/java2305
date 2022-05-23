package lab02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        x = s.nextDouble();
        int a;
        a = 7;
        double b;
        b = x+a;
        System.out.printf("Округленное значение числа %.04f", b);
    }
}
