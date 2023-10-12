package com.viateur;

public class Employee extends Person {
    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private String institution;
    private  String position;
    private  int  salary;

    @Override
    public String toString() {
        return "Employee{" +
                "institution='" + institution + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", FirstName='" + FirstName + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
