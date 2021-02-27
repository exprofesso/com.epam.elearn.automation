package by.epam.automation.java.fundamentals.java.classes;

/*
Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа. Создать массив объектов.
Вывести: a) список студентов заданного факультета; b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года; d) список учебной группы.
 */

public class Student {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int birth;
    private String telefon;
    private String faculty;
    private String course;
    private String group;

    public Student() {
    }

    public Student(int id, String surname, String name, int birth) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.birth = birth;
    }

    public Student(int id, String surname, String name, String patronymic, int birth, String telefon, String faculty, String course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birth = birth;
        this.telefon = telefon;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student id = " + id + " surname = " + surname + " name = " + name + " patronymic = " + patronymic +
                " birth = " + birth + " telefon = " + telefon + " faculty = " + faculty + " course = " + course +
                " group = " + group;
    }

    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student(1, "Ivanov", "Dima", "Igorovish", 1995, "375336223344", "IF", "4", "405");
        students[1] = new Student(2, "Petrov", "Ivan", "Petrovich", 1996, "375336223349", "FF", "2", "201");
        students[2] = new Student(3, "Sidorov", "Sasha", "Kuzmich", 1997, "375336223364", "FF", "3", "303");
        students[3] = new Student(4, "Gup", "Sergey", "Petrovich", 1994, "375336223844", "MF", "1", "102");
        students[4] = new Student(5, "Tramp", "Donald", "Kuzmich", 1985, "375336229344", "MF", "5", "505");
        students[5] = new Student(6, "Tolstoy", "Lev", "Petrovich", 1989, "375336253344", "PF", "2", "201");
        students[6] = new Student(7, "Puskin", "Sasha", "Kuzmich", 1983, "375336227344", "IF", "3", "303");
        students[7] = new Student(8, "Gogol", "Nikola", "Petrovich", 2000, "375336523344", "BF", "1", "102");
        students[8] = new Student(9, "Podkolzin", "Maks", "Kuzmich", 1999, "375336763344", "MF", "5", "502");
        students[9] = new Student(10, "Goluber", "Vadim", "Petrovich", 1975, "375338223344", "MF", "2", "205");

        faculty(students, "ff");
        System.out.println("\n********\n");

        sortFaculty(students, "mf", "5");
        System.out.println("\n********\n");

        sortBirth(students, 1997);
        System.out.println("\n********\n");

        sortGroup(students, "102");
    }


    //  поиск студента по факультету
    public static void faculty(Student[] students, String faculty) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].faculty.equalsIgnoreCase(faculty)) {
                System.out.println(students[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Таких студентов нет");
        }
    }

    // поиск студентов по факультету и курсу
    public static void sortFaculty(Student[] students, String faculty, String course) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].faculty.equalsIgnoreCase(faculty) && students[i].course.equalsIgnoreCase(course)) {
                System.out.println(students[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Таких студентов нет");
        }
    }

    // поиск студентов родившиеся после заданного года
    public static void sortBirth(Student[] students, int birth) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].birth > birth) {
                System.out.println(students[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нет студенты младше " + birth + " рождения");
        }
    }

    // вывод студетоы по групе
    public static void sortGroup(Student[] students, String group) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].group.equalsIgnoreCase(group)) {
                System.out.println(students[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В данной группе нет студентов");
        }

    }


}
