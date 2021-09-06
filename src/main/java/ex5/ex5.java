package ex5;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int num1 = scanner.nextInt();

        System.out.print("What is the second number? ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " + " + num2 +" = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 +" = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 +" = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 +" = " + (num1 / num2));
    }
}

