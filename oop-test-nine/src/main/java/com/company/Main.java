package com.company;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Shakhrisabz main street");
        System.out.println("Person: " + person);

        Student student = new Student("Mark", "Sebzar second street", "Computer science", 2024, 2000000.0);
        System.out.println("Student: " + student);

        Staff staff = new Staff("Clara Hook", "New Jersey", "Scotland", 60000.0);
        System.out.println("Staff: " + staff);

    }
}