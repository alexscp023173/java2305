package lab6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.print(x+" ");
        for (int i=0; i<10; i++) {
            System.out.print((x=x+3)+" ");
        }
    }
}
