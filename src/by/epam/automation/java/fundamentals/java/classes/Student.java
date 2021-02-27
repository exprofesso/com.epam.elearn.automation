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
    public Student(int id, String surname, String name, int birth){
        this.id =id;
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

    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student(1, "Ivanov", "Dima", "Igorovish", 1995, "375336223344", "IF", "4", "405");
        students[1] = new Student(2, "Petrov", "Ivan", "Igorovish", 1995, "375336223344", "IF", "4", "405");
        students[2] = new Student(3, "Sidorov", "Sasha", "Igorovish", 1995, "375336223344", "IF", "4", "405");
        students[3] = new Student(4, "Gup", "Sergey", "Igorovish", 1995, "375336223344", "IF", "4", "405");
        students[4] = new Student(5, "Tramp", "Donald", "Igorovish", 1995, "375336223344", "IF", "4", "405");
        students[5] = new Student(6, "Tolstoy", "Lev", "Igorovish", 1995, "375336223344", "IF", "4", "405");
        students[6] = new Student(7, "Puskin", "Sasha", "Igorovish", 1995, "375336223344", "IF", "4", "405");
        students[7] = new Student(8, "Gogol", "Nikola", "Igorovish", 1995, "375336223344", "IF", "4", "405");
        students[8] = new Student(9, "Podkolzin", "Maks", "Igorovish", 1995, "375336223344", "IF", "4", "405");
        students[9] = new Student(10, "Goluber", "Vadim", "Igorovish", 1995, "375336223344", "IF", "4", "405");




    }



}
