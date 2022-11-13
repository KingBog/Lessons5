package Lessons5.hw2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      Student student=new Student("Кирил","Кирилович");
      student.add(new Subject("Maths",4));
      student.add(new Subject("Geography",5));
        student.printInfo();
        System.out.println(student.getAverageMark());


    }
}
