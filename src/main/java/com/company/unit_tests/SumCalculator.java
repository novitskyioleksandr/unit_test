package com.company.unit_tests;

public class SumCalculator {
    public int sum(int n) {
        int count = 0;
        if (n <= 0) {
            System.out.println("Number can't be 0 or less 0.");
            throw new IllegalArgumentException("Number can't be 0 or less 0.");
        }
        else {
            for (int i = 0; i <= n; i++) {
                count += i;
            }
        }
        return count;
    }
}

