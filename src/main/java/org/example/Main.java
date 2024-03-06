package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        Add obj = new Add();
        Multiply obj = new Multiply();
        int result = obj.multiply(a,b);
        System.out.println("The final result is :- "+result);
    }

}