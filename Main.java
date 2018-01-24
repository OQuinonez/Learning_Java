package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner( System.in );
        System.out.print("What is your name?!\n");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.print("What unit are we starting off with? ");
        System.out.print("[C]elsius, [F]ahrenheit, or [K]elvin \n");
        String source = scanner.nextLine();
        System.out.print("What unit are we converting to? ");
        System.out.print("[C]elsius, [F]ahrenheit, or [K]elvin \n");
        String result = scanner.nextLine();
        System.out.print("What tempature would you like to convert? ");
        double temp = scanner.nextDouble();
        TempatureConverter convertTemp = new TempatureConverter(source, result);
        System.out.print("Your new tempature is ");
        System.out.print(convertTemp.convert(temp));
        }
    }