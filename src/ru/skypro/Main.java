package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void isLeapYear(int year) {
        boolean isLeapYear = ((year % 4 == 0 || year % 400 == 0) && (year % 100 != 0));
        if (isLeapYear) {
            System.out.println("Год високосный ");
        } else {
            System.out.println("Год не високосный");
        }
    }


    public static void system(int clientOs, int clientDeviceYear) {
        boolean isLiteNeeded = (clientDeviceYear < 2015);
        if (clientOs == 1 && isLiteNeeded) {
            System.out.println("Установите облегченную версию приложения для Ios по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs == 0 && isLiteNeeded) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
// v2
    public static int card(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays++;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
        }
        return deliveryDays;
    }

    public static void findDuplicates(String duplicates) {
        char[] letters = duplicates.toCharArray();
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] == letters[i + 1]) {
                System.out.println("Найден дубль по символу " + letters[i]);
                return;
            }
        }
        System.out.println("Дублей не найдено");
    }

    public static void reverseArray(int[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex++] = arr[rightIndex];
            arr[rightIndex--] = temp;
        }
    }


    public static void main(String[] args) {
        // 1st
        int year = 2015;
        isLeapYear(year);
        //2nd
        int clientOs = 0;
        int clientDeviceYear = 2014;
        system(clientOs, clientDeviceYear);
        //3rd
        int deliveryDistance = 61;
        card(deliveryDistance);
        System.out.println("Потребуется дней " +card(deliveryDistance));
        //4th
        String signs = "abbccddeffgghiijjkk";
        findDuplicates(signs);
        //5th
        int[] arr = new int[]{3, 2, 1, 6, 5};
        reverseArray(arr);
        System.out.print("Reverse Array " + Arrays.toString(arr));

    }
}




