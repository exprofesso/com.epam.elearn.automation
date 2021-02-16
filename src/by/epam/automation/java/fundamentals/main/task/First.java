package by.epam.automation.java.fundamentals.main.task;

//Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Приветствую тебя!!!! Как тебя зовут мой дорогой друг?");

        String name = scanner.nextLine();

        System.out.println("ОХ, какое прекрасное имя " + name + " давай дружить");

    }
}