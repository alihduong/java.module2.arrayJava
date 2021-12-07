package com.exercise.arrayJava;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = scanner.nextLine();
        System.out.print("Characters You Find: ");
        String s = scanner.nextLine();

//        for (int i = 0; i < str.length(); i++) {
//            String characters = String.valueOf(str.charAt(i));
//            if (s.equals(characters)){
//                count++;
//            }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s.charAt(0)) {
                count++;
            }
        }
        System.out.print("Total characters "+s+" in to String = "+count);
    }

}
