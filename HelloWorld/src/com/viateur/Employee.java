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
    public Employee(){};

//    public Employee(String FirstName, String lastName, int age, String institution, String position, int salary){
//        this.age = age;
//        this.FirstName = FirstName;
//        this.lastName = lastName;
//        this.institution = institution;
//        this.position = position;
//        this.salary = salary;
//    }
//
    public void MyProfile(){
        System.out.println( "I am" + this.FirstName +  "From " + this.institution);
    }
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
