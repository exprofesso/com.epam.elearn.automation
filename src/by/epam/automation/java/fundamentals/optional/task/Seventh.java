package by.epam.automation.java.fundamentals.optional.task;

//Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

import java.util.Scanner;

public class Seventh {
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
 //           System.out.print(array[i] + " ");
        }
        System.out.println();
            String answer = "";
        // поиск из различных чисел
        for (int z = 0; z < array.length; z++) {

            for (int i = 0; i < array[z].length(); i++) {

                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].charAt(i) != array[i].charAt(j)){
                        answer += array[i].charAt(i);
                    }
                    
                }
            }
        }
        System.out.println(answer);

    }
}
