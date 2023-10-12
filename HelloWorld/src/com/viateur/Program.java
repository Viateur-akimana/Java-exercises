package com.viateur;

public class Program {
    public static  void main(String[] args){
        Person p = new Person();
//        p.FirstName= "VIateur";
//        p.age = 20;
//        p.lastName = "David";
//        System.out.println(p);

        Employee employee = new Employee();
        Employee employee2 = new Employee();

        employee.setInstitution("RCa");
        employee.setPosition("Manager");
        employee.setSalary(120999);
        employee.setAge(99);
        employee.setFirstName("Viateur");
        employee.setLastName("David");
//        System.out.println(employee);
        employee.MyProfile();

    }
}
