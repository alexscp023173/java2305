package lab02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a; //объявляем переменную
        a = s.nextDouble(); //получаем число от пользователя
        System.out.printf("Округленное значение числа %.04f", a); //выводим на экран
    }
}
