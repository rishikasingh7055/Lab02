package main;

/**
 * @author rishikasingh
 * @version 1.0
 */

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + '!');
        System.out.println("done!!");

        scanner.close();
    }

}
