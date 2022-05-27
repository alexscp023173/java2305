package lab6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.next();
        String i = x.repeat(7);
        System.out.printf("\"%s\"", i);
    }
}
