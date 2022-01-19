package com.company;
import java.util.ArrayList;
import java.util.List;

public class Students {
    private static Object Students;

    public static void main(String[] args) {
	Student student1 = new Student(1, "Алексей", "Петренко", "Психология", 4.4, 2020);
    Student student2 = new Student(2, "Сергей", "Драгунов", "Физическая культура", 5.0, 2019);
    Student student3 = new Student(3, "Алиса", "Босконович", "Информационные технологии", 5.0, 2019);
    Student student4 = new Student(4, "Виктор", "Резнов", "Музыка", 4.2, 2018);
    Student student5 = new Student(5, "Дмитрий", "Петренко", "Физическая культура", 4.0, 2020);
    Student student6 = new Student(6, "Иван", "Чернов", "Психология", 4.3, 2018);
    Student student7 = new Student(7, "Лилия", "Ковальская", "Иностранные языки", 5.0, 2021);
    Student student8 = new Student(8, "Елена", "Сабурова", "Коммерческая деятельность", 4.2, 2020);
    Student student9 = new Student(9, "Моника", "Ковачич", "Информационные технологии", 5.0, 2019);
    Student student10 = new Student(10, "Ярослав", "Вихарев", "Психология", 4.2, 2020);
    System.out.println(student1.toString());
    }
}

class Student{
    int ID;
    String FirstName;
    String LastName;
    String Faculty;
    double Rate;
    int Year;

    public Student(int ID, String FirstName, String LastName, String Faculty, double Rate, int Year) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Faculty = Faculty;
        this.Rate = Rate;
        this.Year = Year;
    }

    public String toString() {
        return FirstName + " " + LastName+ " " + Rate;
    }
}

class Group{
    private List<Student> list = new ArrayList<Student>();

    public Group() {}

    public void setStudent(Student student) {
        list.add(student);
    }

    public void getStudentByLastName(String LastName) {
        list.get(Integer.parseInt(LastName));
    }

    public void delStudentByLastName(String LastName) {
        list.remove(LastName);
    }
}