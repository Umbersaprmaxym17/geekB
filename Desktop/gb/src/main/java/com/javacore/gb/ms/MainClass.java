package com.javacore.gb.ms;

import java.util.Arrays;

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
        System.out.println();


        Employee[] developmentTeam = new Employee[5];
        developmentTeam[0] = new Employee("John",
                "Dow",
                "Valerievish",
                "productManager",
                "jd@space.com",
                "49566677767",
                2000,
                29);
        developmentTeam[1] = new Employee("Anna",
                "Doronina",
                "Michailova",
                "developer",
                "doronina@space.com",
                "4956457767",
                3000,
                32);
        developmentTeam[2] = new Employee("Ruslan",
                "Savarskiy",
                "Gregorivich",
                "qaEngineer",
                "savarskiy@space.com",
                "4957557767",
                1800,
                28);
        developmentTeam[3] = new Employee("Lara",
                "Croft",
                "Stiler",
                "ReleaseManager",
                "Stiler@space.com",
                "495653477767",
                2800,
                41);
        developmentTeam[4] = new Employee("Lea",
                "Morgana",
                "Rebelovich",
                "Princess",
                "Morgana@space.com",
                "49566677767",
                2000,
                40);

        for (int i = 0; i < developmentTeam.length; i++) {
            if (developmentTeam[i].age >= 40) {
                developmentTeam[i].info();
                System.out.println();
            }
        }
    }
}
