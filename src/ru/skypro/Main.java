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

    public static int card(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Понадобится дней " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Понадобится дней " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Понадобится дней " + (deliveryDays + 2));
        }
        return deliveryDays;
    }


    public static String getSing(String signs) {
        return String.valueOf(signs.toCharArray());
    }

    public static void checkString(char[] signs) {
        for (int i = 0; i < signs.length; i++) {
            for (int j = 0; j < signs.length; j++) {
                if (signs[i] == signs[j]) {
                } else {
                    if (signs.equals(signs[i] == signs[j]))
                        System.out.println("Обнаружен дубль " + signs[j]);
                    break;
                }
            }
        }
    }


    // public static int reverse(int [] in) {
    //   for (int i = in.length; i >= 0; i++) {
    //     System.out.println(i);
    //}
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
             {
            }
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
        //4th Почему код не останавливается после первого дубля? Он просто производит печать каждого символа с "Обнаружен дубль"
        String signs = "abbccddeffgghiijjkk";
        checkString(signs.toCharArray());
        //5th Мне подсказали, что нужно сделать счетчик в обе стороны,а что это такое я не понял, не было времени.
        int[] arr = {3, 2, 1, 6, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}





