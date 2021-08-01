package com.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Operation operation = new Operation();
        Scanner scanner = new Scanner(System.in);
        boolean exitProgram = true;

            do {
                System.out.println("Выберите операцию введя её цифру \n 1 - Сложение" +
                        "\n 2 - Вычитание \n 3 - Умножение \n 4 - Деление \n 5 - Выход из приложения");

                String input = scanner.nextLine();
                
                try{
                    switch (input) {
                    case ("1"):
                        System.out.println("Сложение");
                        operation.plus();
                        break;
                    case ("2"):
                        System.out.println("Вычитание");
                        operation.minus();
                        break;
                    case ("3"):
                        System.out.println("Умножение");
                        operation.multiplication();
                        break;
                    case ("4"):
                        System.out.println("Деление");
                        operation.division();
                        break;
                    case ("5"):
                        System.out.println("Выход");
                        exitProgram = false;
                        break;
                    default:
                        System.out.println("Неправильный ввод.");
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Неверный ввод, введите число");
                }
            }

            while (exitProgram);

    }
}
