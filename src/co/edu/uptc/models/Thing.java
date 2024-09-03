package co.edu.uptc.models;

import java.util.Comparator;

public class Thing {
    private String name;
    private int age;
    private String lastName;

    public Thing(String name, String lastName, int age) {
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Last Name: " + lastName + ", Age: " + age;
    }

    public static class NameComparator implements Comparator<Thing> {
        @Override
        public int compare(Thing t1, Thing t2) {
            return t1.getName().compareTo(t2.getName());
        }
    }

    public static class AgeComparator implements Comparator<Thing> {
        @Override
        public int compare(Thing t1, Thing t2) {
            return t1.getAge() - t2.getAge();
        }
    }

    public static class LastNameComparator implements Comparator<Thing> {
        @Override
        public int compare(Thing t1, Thing t2) {
            return t1.getLastName().compareTo(t2.getLastName());
        }
    }
}
