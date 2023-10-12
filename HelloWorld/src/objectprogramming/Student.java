package objectprogramming;

import com.viateur.Person;

public class Student extends Person {
    private String school;
    private String combination;
    private int grade;
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", combination='" + combination + '\'' +
                ", grade=" + grade +
                ", FirstName='" + FirstName + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
