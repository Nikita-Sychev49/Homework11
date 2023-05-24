public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
    }

    public static void checkYearOnLeap(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача №1");
        int someYear = 2024;
        checkYearOnLeap(someYear);
    }

    public static void recomnendVersion(int clientOS, int year) {
        if (clientOS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int os = 0;
        int clientDeviceYear = 2014;
        recomnendVersion(os, clientDeviceYear);
    }

    public static int countDays(int distance) {
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
        if (countDays(deliveryDistance) != 0) {
            System.out.println("Потребуется дней для доставки: " + countDays(deliveryDistance));
        } else {
            System.out.println("Доставки нет");
        }
    }
}