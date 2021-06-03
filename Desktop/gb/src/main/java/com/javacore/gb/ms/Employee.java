package com.javacore.gb.ms;

public class Employee {

    private String firstName;
    private String lastName;
    private String middleName;
    private String occupation;
    private String email;
    private String phoneNumber;
    private long salary;
    public int age;

    public Employee(String firstName, String lastName, String middleName, String occupation, String email, String phoneNumber, long salary, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.occupation = occupation;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
    }

    public void info() {
        System.out.printf(
                 "firstName = %s, lastName = %s, middleName = %s, occupation = %s, email = %s, phoneNumber = %s, salary = %d, age = %d",
                firstName , lastName, middleName, occupation, email, phoneNumber, salary, age
        );
    }

    public String getOccupation() {
        return occupation;
    }

    public void setSalary(long salary) {
        if (salary <=0 ) {
            System.out.println("Salary is not assigned");
            return;
        }
        this.salary = salary;
    }

}
