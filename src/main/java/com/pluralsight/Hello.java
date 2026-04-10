package com.pluralsight;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        sayHello();
        sayGoodbye();
        sayGoodMorning();

        myScanner.close();
    }

    public static void sayHello() {;
        System.out.println("Hello!");
    }

    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    public static void sayGoodMorning() {
        System.out.println("Good morning!");

    }
}
