package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(in);
        int count = 0;
        System.out.print("Ismni kiriting: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));



            count++;
        }


        System.out.println(count);
    }
}
