package by.epam.automation.java.fundamentals.main.task;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Random;
import java.util.Scanner;

public class Third {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите разумное число чисел для вывода на консоль");
        int number = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int a = random.nextInt();
            System.out.println(a);
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            int a = random.nextInt();
            System.out.print(a + " ");
        }

    }

}
