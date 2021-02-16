package by.epam.automation.java.fundamentals.optional.task;

/*
Задание. Ввести n чисел с консоли.
Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        String[] array = new String[10];


        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите 10 чисел");
        // заполение массива
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextLine();
        }
        // вывод массива чисел
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        // поиск самого большого по длинне числа
        int countMax = 0;
        String max = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > countMax) {
                countMax = array[i].length();
                max = array[i];
            }
        }
        System.out.println("Самое длинное число " + max);

        // поиск самого маленького по длинне числа
        int countMin = array.length;
        String min = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < countMin) {
                countMin = array[i].length();
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
