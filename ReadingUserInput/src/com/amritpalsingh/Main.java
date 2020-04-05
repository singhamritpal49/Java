package com.amritpalsingh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Getting User Input from user Use Scanner System.in
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Your Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Your age " + name);

    }
}
