public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
    }
    public static void isItLeap(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task1() {
        System.out.println("Задача №1");
        int someYear = 2024;
        isItLeap(someYear);
    }
    public static void recommendationVersion(int clientOS, int year) {
        if (clientOS == 0 && year >= 2023) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year < 2024) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int os = 0;
        int clientDeviceYear = 2024;
        recommendationVersion(os, clientDeviceYear);
    }
    public static int countingDays(int distance) {
        int day = 0;
        if (distance <= 20) {
            day++;
        } else if (distance <= 60) {
            day = day + 2;
        } else if (distance <= 100) {
            day = day + 3;
        }
        return day;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 30;
        if (countingDays(deliveryDistance) != 0) {
            System.out.println("Потребуется дней для доставки: " + countingDays(deliveryDistance));
        } else {
            System.out.println("Доставки нет");
        }
    }
}