package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej 1. číslo:");
        calc.number1 = sc.nextDouble();
        System.out.println("Zadej 2. číslo:");
        calc.number2 = sc.nextDouble();
        System.out.println("Součet: " + calc.addition());
        System.out.println("Rozdíl: " + calc.subtraction());
        System.out.println("Součin: " + calc.multiplication());
        System.out.println("Podíl: " + calc.division());
    }
}
