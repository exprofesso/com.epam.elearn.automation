package by.epam.automation.java.fundamentals.optional.task;

//Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите 5 чисел");
        // заполение массива
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        // вывод массива чисел
        for (int i = 0; i < array.length; i++) {
        }

        System.out.println();
            // вывод результата
        for (int i = 0; i < array.length; i++){
            if(unical(array[i])) System.out.println("Числа из уникальных цифр  " + array[i]);
        }


    }


    // поиск из различных чисел
    public static boolean unical(int array) {
        boolean answer = true;
        String s = String.valueOf(array);
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}
