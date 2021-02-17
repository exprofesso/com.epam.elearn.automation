package by.epam.automation.java.fundamentals.optional.task;

// Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {

        int [] array = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите 5 чисел");
        // заполение массива
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        // вывод массива чисел
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++){
            int [] temp = new int[10];
            while (array[i] > 0){
                temp[array[i] % 10] = 1;
                array[i]/=10;
            }
            System.out.println(temp[i]);
        }

    }
}
