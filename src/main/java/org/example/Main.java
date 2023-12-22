package org.example;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = {4,6,7,9};
        System.out.println("Введи число");
        System.out.println(findLess(scanner.nextInt(),mas));
    }
    public static int findLess(int number,int[] mas) {
        if (mas.length == 0){
            throw new IllegalArgumentException("Массив не иожет быть пустым");
        }
        if (number < mas[0]){
            throw new NoSuchElementException("Число меньше первого элемента массива");
        }
        for (int i = 0; i < mas.length-1; i++) {
            if (mas[i] <= number && number < mas[i+1]){
                return mas[i];
            }
        }
        return 0;
    }
}