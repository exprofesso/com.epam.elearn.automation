package by.epam.automation.java.fundamentals.optional.task;

//Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        int middle = 0;
        String[] array = new String[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите 5 чисел");
        // заполение массива
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        // вывод массива чисел и определение средннию длину
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            middle += array[i].length();
        }
        middle = middle / array.length;
        System.out.println();
        System.out.println(middle);

        // поиск и вывод чисел больше среднего
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > middle) {
                System.out.println("<Число больше среднего " + array[i]);
            }
        }
    }
}


