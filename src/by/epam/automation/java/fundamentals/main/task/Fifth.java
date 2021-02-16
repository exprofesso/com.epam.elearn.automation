package by.epam.automation.java.fundamentals.main.task;

/*
Ввести число от 1 до 12. Вывести на консоль название месяца,
соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12 что бы узнать месяц");
        int month = scanner.nextInt();
        while (month < 0 || month > 12) {
            System.out.println("Увы такого месяца не существует");
            month = scanner.nextInt();

        }
        switch (month) {
            case 1:
                System.out.println("Это месяц январь");
                break;
            case 2:
                System.out.println("Это месяц февраль");
                break;
            case 3:
                System.out.println("Это месяц март");
                break;
            case 4:
                System.out.println("Это месяц апрель");
                break;
            case 5:
                System.out.println("Это месяц май");
                break;
            case 6:
                System.out.println("Это месяц июнь");
                break;
            case 7:
                System.out.println("Это месяц июль");
                break;
            case 8:
                System.out.println("Это месяц август");
                break;
            case 9:
                System.out.println("Это месяц сентярь");
                break;
            case 10:
                System.out.println("Это месяц октябрь");
                break;
            case 11:
                System.out.println("Это месяц ноябрь");
                break;
            case 12:
                System.out.println("Это месяц декабрь");
                break;
            default:
                System.out.println("Увы такого месяца не существует");
                break;
        }

    }
}
