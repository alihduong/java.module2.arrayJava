package com.exercise.arrayJava;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n+1];
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) +": ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Số cần chèn: ");
        int num = scanner.nextInt();
        System.out.println("Vị trí cần thêm (index): ");
        int index = scanner.nextInt();

        if (index < 0 || index > arr.length-1){
            System.out.println("Không thể thêm phần tử");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (i != index){
                    arr1[i] = arr[c];
                    c++;
                } else {
                    arr1[i] = num;
                }
            }
        }
        for (int j : arr1) {
            System.out.print(j + " ");
        }
    }
}
