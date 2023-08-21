package org.example;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкти осіб
        Person person1 = new Woman("Крістіна", "Річі", 58, null);
        Person person2 = new Man("Сем", "Сміт", 63, null);
        Person person3 = new Woman("Різ", "Візерспун", 61, null);
        Person person4 = new Man("Джон", "МакКейн", 66, null);

        // Виводимо інформацію про об'єкти до реєстрації партнерства
        System.out.println("До шлюбу:");
        printPersonInfo(person1);
        printPersonInfo(person2);
        printPersonInfo(person3);
        printPersonInfo(person4);

        // Реєструємо партнерство
        person1.registerPartnership(person2);
        person3.registerPartnership(person4);

        // Виводимо інформацію про об'єкти після реєстрації партнерства
        System.out.println("\nПісля шлюбу:");
        printPersonInfo(person1);
        printPersonInfo(person2);

        // Скасовуємо партнерство та повертаємо прізвище жінки до попереднього стану
        person1.deregisterPartnership(true);

        // Виводимо інформацію про об'єкти після скасування партнерства
        System.out.println("\nПісля розлучення:");
        printPersonInfo(person1);
        printPersonInfo(person2);
    }

    public static void printPersonInfo(Person person) {
        System.out.println("Імʼя: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Вік: " + person.getAge());
        System.out.println("Стать: " + person.getGender());
        System.out.println("Партнер: " + person.getPartner());
        System.out.println("Чи пенсійного віку: " + person.isRetired());
        System.out.println("---------");
    }

}