package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        List <String> names = new ArrayList(100);
        names.add("Max");
        names.add("Diana");
        names.add("Ruslan");
        names.add("Karina");
        names.add("Karina");
        names.add("Roman");
        names.add("Alexander");
        names.add("Jonathan");
        names.add("Anna");
        names.add("Karina");
        names.add("Marina");
        names.add("Ekaterina");

        printArrayList(names);

        System.out.println("*****************Unique user's names******************");
        printUniqueUserNames(names);

        System.out.println("*****************Unique user's  No HashMap names******************");
        printUniqueUserNamesNoHashSet(names);


        System.out.println("****************Phone Book******************");

        List <PhoneBookUser> phones = new ArrayList();

        PhoneBookUser phoneBookUser1 = new PhoneBookUser("Kovalenko", "347886837788");
        PhoneBookUser phoneBookUser2 = new PhoneBookUser("Ivanova", "34788688838");
        PhoneBookUser phoneBookUser3 = new PhoneBookUser("Dubova", "34788642344");
        PhoneBookUser phoneBookUser4 = new PhoneBookUser("Mazura", "01234423888");
        PhoneBookUser phoneBookUser5 = new PhoneBookUser("Mazura", "45934998989");

        phones.add(phoneBookUser1);
        phones.add(phoneBookUser2);
        phones.add(phoneBookUser3);
        phones.add(phoneBookUser4);
        phones.add(phoneBookUser5);


        findUserPhoneByName(phones, "Mazura");

    }



    static void findUserPhoneByName(List<PhoneBookUser> phoneBookUsers, String lastname) {
        for (int i = 0; i < phoneBookUsers.size(); i++) {
            if (lastname == phoneBookUsers.get(i).lastName) {
                System.out.println( "Last name :" + phoneBookUsers.get(i).lastName + " phone number is :" +
                        phoneBookUsers.get(i).phoneNumber);
            }

        }

    }

    static void printArrayList(List<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(" Index " + i  +  " " +  arrayList.get(i));
            System.out.println();
        }
    }

    static void printUniqueUserNames(List<String> arrayList) {

        HashSet<String> hset = new HashSet<String>(arrayList);
        System.out.println("ArrayList Unique names are : "
                + hset);
    }

    static void printUniqueUserNamesNoHashSet(List<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            int count = 0;
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    isUnique = true;
                    break;
                }
            }
            if (!isUnique) {
                count++;
                System.out.println(" Unique names are : " + arrayList.get(i));

            }

        }

    }

}
