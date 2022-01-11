package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList<Integer> grades = new ArrayList<Integer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGradeAverage() {
        int gradeAverage = 0;
        int count = 0;
        for (Integer grade : grades) {
            gradeAverage += grade;
            count++;
        }
        gradeAverage /= count;
        return gradeAverage;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public static void main(String[] args) {
        Student eloys = new Student("Eloys");
        eloys.addGrade(100);
        eloys.addGrade(1);
        eloys.addGrade(50);

        System.out.println(eloys.getGradeAverage());
    }
}
