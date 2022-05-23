package lab04;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int q = s.nextInt();
        int x = q - p;
        int y = p - q;

        if (q > p) {
            System.out.printf("Максимальное %d, минимальное %d. Разница %d.", q, p, x);
        }
            else {
                System.out.printf("Максимальное %d, минимальное %d. Разница %d.", p, q, y);
        }

        }
}
