package lab06;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        for (int i = 10; i<=20; i++) {
            System.out.println(i);
            if (i==x) {
                System.out.println(x + " Найдено");
            }
        }
    }
}
