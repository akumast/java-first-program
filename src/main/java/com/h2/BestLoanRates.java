package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {
    public static final Map<Integer, Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter the loan term (in years)");
        int loanInYears = scanner.nextInt();
        float bestRate = getRates(loanInYears);

        if (Math.abs(bestRate - 0.0f) < 0.00001) {
            System.out.println("No available rates for term: " + loanInYears + " years");
        } else {
            System.out.println("Best Available Rate: " + getRates(loanInYears) + "%");
        }
        
        scanner.close();
    }

    public static float getRates(int loanTermInYear) {
        return bestRates.getOrDefault(loanTermInYear, 0.0f);
    }
}
