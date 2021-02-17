package by.epam.automation.java.fundamentals.optional.task;

import java.util.Scanner;

/*
Вывести числа в порядке возрастания (убывания) значений их длины.
 */
public class Second {

    public static void main(String[] args) {

        String[] array = new String[5];


        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите 5 чисел");
        // заполение массива
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        // вывод массива чисел
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        //сортировака по длине

        for (int i = 0; i < array.length; i++) {
            String temp = "";
            for (int j = array.length - 1; j > i; j--) {
                if (array[j].length() < array[j - 1].length()) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            System.out.println("Отсортированые числа согласно их длины" + array[i]);
        }


    }
}
