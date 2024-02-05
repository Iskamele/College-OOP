package practice_01;

import practice_01.Model.Bachelor;
import practice_01.Model.Master;
import practice_01.Model.Person;

public class Main {
    public static void main(String[] args) {
        Person kostyan = new Bachelor("Kostyan", 21, 1410);

        Person vova = new Master("Vova", 20, "Horror games");

        Person ivan = new Person("Ivan", 25);

        Person[] persons = new Person[]{kostyan, vova, ivan};
        for (Person person : persons) {
            printInfo(person);
        }

        System.out.println(System.lineSeparator() + "a few moments later..." + System.lineSeparator());
        ((Bachelor) kostyan).setScholarship(1500);
        vova.setName("Vladimir");
        ivan.setAge(26);

        for (Person person : persons) {
            printInfo(person);
        }
    }

    private static void printInfo(Person person) {
        System.out.println(person.getPersonalInfo());
    }
}
