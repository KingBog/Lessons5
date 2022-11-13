package Lessons5.hw2;

import java.util.ArrayList;

public class Student {
   private String name;
   private String surname;
   ArrayList<Subject>subjects=new ArrayList<>();

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }


    public boolean add(Subject subject){
        if (SubjectSсhool.checkSubject(subject.getName())&&
                Grade.checkGrade(subject.getMark())){
            subjects.add(subject);
            return true;
        }return false;
    }
    public void printInfo(){
        System.out.println(toString());
    }
    public double getAverageMark(){
        double sum=0;
        int subj=0;
        for (Subject subject:subjects){
            sum=sum+subject.getMark();
            subj++;
        }
        return sum/subj;

    }

    @Override
    public String toString() {
        return
                "Имя: "+getName()+"\nФамилия: "+getSurname() +"\n"+
                  subjects;
    }
}
    class SubjectSсhool{
        public static final String MATHS="Maths";
        public static final String GEOGRAPHY="Geography";
        public static final String PHYSICS= "Physics";
        public static boolean checkSubject(String subject){
            return subject.equals(SubjectSсhool.GEOGRAPHY)||
                    subject.equals(SubjectSсhool.MATHS)||
                    subject.equals(SubjectSсhool.PHYSICS);
        }


    }
    class Grade{
        public static final int ONE= 1;
        public static final int TWO= 2;
        public static final int THREE= 3;
        public static final int FOUR= 4;
        public static final int FIVE= 5;
        public static boolean checkGrade(int grade){
            return grade==Grade.ONE||
                    grade==Grade.TWO||
                    grade==Grade.THREE||
                    grade==Grade.FOUR||
                    grade==Grade.FIVE;
        }

}









