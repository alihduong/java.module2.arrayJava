package com.exercise.arrayJava;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array [1,2,3,4,5,6,7,8,9]");
        System.out.print("Enter element you need delete: ");
        int num = scanner.nextInt();
        int[] array = {1,2,3,4,5,6,7,8,9};
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (num != array[i]) {
                array[index] = array[i];
                index ++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
