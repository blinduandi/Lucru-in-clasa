package com.step.Main.java;
import java.time.LocalDate;
import java.util.*;
/*
        De creat o clasa Person (String name, LocalDate birthDate).
        De creat 1 clasa Main (main()). În Interiorul la main de creat un
        array list care sa păstreze 5 obiecte person. De sortat colecția
        respectivă dupa name și de explicat care sunt modificarile
        necesare pentru a sorta colecția dupa birthdate.
*/


public class Main {

    public static void main(String[] args) {
	// write your code here



        List<Person> pers = new ArrayList<Person>();

        pers.add(0, new Person("Vasile",LocalDate.of (2004,12,12)));
        pers.add(1, new Person("Ion",LocalDate.of (2000,7,12)));
        pers.add(2, new Person("Gheorghe",LocalDate.of (1999,3,21)));
        pers.add(3, new Person("Mihai",LocalDate.of (1981,8,27)));
        pers.add(4, new Person("Andi",LocalDate.of (2004,6,4)));

        Collections.sort(pers , Person.PersonNameComp);

       System.out.println( pers.get(0).name);
        System.out.println( pers.get(1).name);
        System.out.println( pers.get(2).name);
        System.out.println( pers.get(3).name);
        System.out.println( pers.get(4).name);
        
    }
}
