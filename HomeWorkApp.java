package ru.geekbrains.lesson2;

public class HomeWorkApp {
    
    public static void main(String[] args) {
        checkSum(-13, 13);
        checkPositiveNum(1);
        checkNegativeNum(5);
        printReminder("Читай учебную литературу!", 3);
        checkLeapYear(2000);
    }

    private static boolean checkSum(int numOne, int numTwo) { //проверяет входит ли полученная сумма в диапозон [10;20]
        if((numOne + numTwo) >= 10 && (numOne + numTwo) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void checkPositiveNum(int num) { //проверяет положительное ли число
        if(num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean checkNegativeNum(int num) { //проверяет отрицательное ли число
        if(num < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printReminder(String reminder, int num) { //печатает указанное количество строк
        for(int i = 0; i < num; i++) {
            System.out.println(reminder);
        }
    }

    private static boolean checkLeapYear(int year) { //високосный ли год
        if (year % 400 == 0) {
            return true;
        }

        if(year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
