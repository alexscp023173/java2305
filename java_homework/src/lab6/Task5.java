package lab6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Таблица умножения на " + n);
        for (int i=0; i<9; i++) {
            System.out.println(n + "x" + (i+1) + "=" + (n * (i+1)));
        }
    }
}
