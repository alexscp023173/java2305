package lab06;

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int limit = a + 10;//ограничение в цикле не меняется
        while(a < limit) {//сравниваем счетчик и ограничение
            System.out.println(a);
            System.out.println("---");
            a = a + 1;//счетчик меняется в цикле
        }
    }
}
