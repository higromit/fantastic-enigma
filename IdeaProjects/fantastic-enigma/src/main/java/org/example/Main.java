package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int param = sc.nextInt();

        Calculable expression = new AdditionOperation();

        System.out.printf("my expression's result : %d \n", expression.calculate(param));
    }
}

interface Calculable {
    int calculate(int param);
}

class AdditionOperation implements Calculable {
    @Override
    public int calculate(int param) {
        return param + 9999;
    }

    class AddExpression implements Calculable {
        @Override
        public int calculate(int param) {
            return param + 10;
        }
    }
} 