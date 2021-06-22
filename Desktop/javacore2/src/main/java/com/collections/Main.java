package com.collections;

import java.util.ArrayList;
import java.util.Collections;
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
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    isUnique = true;
                    break;
                }
            }
            if (!isUnique) {
                System.out.println(" Unique names are : " + arrayList.get(i));
            }

        }

    }

}
