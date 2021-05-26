package com.javacore.gb.ms;

public class MainClass {

    public static void main(String[] args) {

        Employee productManager = new Employee(
                "John",
                "Dow",
                "Valerievish",
                "productManager",
                "jd@email.com",
                "49566677767",
                2000,
                29);
        Employee developer = new Employee(
                "Anna",
                "Doronina",
                "Michailova",
                "developer",
                "doronina@email.com",
                "4956457767",
                3000,
                32);
        Employee qaEngineer = new Employee(
                "Ruslan",
                "Savarskiy",
                "Gregorivich",
                "qaEngineer",
                "savarskiy@email.com",
                "4957557767",
                1800,
                28
        );
        qaEngineer.info();
        System.out.println();
        productManager.info();
        System.out.println();
        developer.info();
        System.out.println();
        System.out.println(qaEngineer.getOccupation());
    }
}
