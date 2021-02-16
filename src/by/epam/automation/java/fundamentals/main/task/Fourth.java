package by.epam.automation.java.fundamentals.main.task;

//4. Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.

public class Fourth {
    public static void main(String[] args) {

        int a = 0;

        for (int i = 0; i < args.length; i++) {
            String temp = args[i];
            a += Integer.parseInt(temp);
        }
        System.out.println("Сумма чисел в авгументе будет " + a);
    }
}
