package com.step.Main.java;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

/*
        De creat o clasa Person (String name, LocalDate birthDate).
        De creat 1 clasa Main (main()). În Interiorul la main de creat un
        array list care sa păstreze 5 obiecte person. De sortat colecția
        respectivă dupa name și de explicat care sunt modificarile
        necesare pentru a sorta colecția dupa birthdate.
*/



public class Person {

    String name;
    LocalDate birthdate;



    Person(String _name,LocalDate _birthday)
    {
        name=_name;
        birthdate=_birthday;
    }


    public static Comparator<Person> PersonNameComp = new Comparator<Person>() {

        public int compare(Person p1, Person p2) {
            String PersonName1 = p1.name.toUpperCase();
            String PersonName2 = p2.name.toUpperCase();


            return PersonName1.compareTo(PersonName2);
        }};

}
