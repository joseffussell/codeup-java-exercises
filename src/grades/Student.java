package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }


    // returns the student's name
    public String getName() {
        return name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for(int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    };

    public double getGrades() {

        for(int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
        return 0;
    };
    public static void main(String[] args) {
        Student Josef = new Student("Matt", new ArrayList<>());
        Josef.addGrade(87);
        Josef.addGrade(21);
        Josef.addGrade(89);
        Josef.getGrades();
        System.out.println(Josef.getGradeAverage());
    }
}