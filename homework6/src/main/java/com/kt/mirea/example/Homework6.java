package com.kt.mirea.example;

import java.util.Scanner;

/**
 *
 * @author НР
 */
public class Homework6 {

    public static void main(String[] args) {
        System.out.println("Вариант 5, РИБО-04-21, Волженская Полина Александровна");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь к объекту для десереализации: ");
        String yourPath = scan.nextLine();
        LoaderRunnable lr = new LoaderRunnable(yourPath);
        Thread th = new Thread(lr);
        th.start();
    }
}