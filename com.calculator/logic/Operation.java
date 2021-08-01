package com.calculator.logic;

import java.util.Scanner;

public class Operation {

    Scanner scanner = new Scanner(System.in);

    public String plus() {
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("Результат сложения = " + result);;
        return Integer.toString(result);
    }

    
    public String minus() {
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        int result = num1 - num2;
        System.out.println("Результат вычитания = " + result);;
        return Integer.toString(result);
    }

    
    public String multiplication() {
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        int result = num1 * num2;
        System.out.println("Результат умножения = " + result);;
        return Integer.toString(result);
    }

    
    public String division() {
        System.out.println("Введите первое число");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число");
        double num2 = scanner.nextInt();
        double result = num1 / num2;
        System.out.println("Результат деления = " + result);;
        return Double.toString(result);
    }

    
}

