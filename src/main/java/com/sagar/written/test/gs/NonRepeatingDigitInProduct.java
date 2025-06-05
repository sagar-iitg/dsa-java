package com.sagar.written.test.gs;

/*
 * Problem: Non-Repeating Digit in Product
 *
 * Given an integer `x` and a range of integers from `y` to `z` (inclusive),
 * count how many integers `n` in this range satisfy the following condition:
 *
 * -> The product `x * n` should NOT contain any digit that exists in the number `n`.
 *
 * Example:
 * Input: x = 2, y = 10, z = 15
 *
 * We check each number n in the range [10, 15]:
 * - 10 -> 2 * 10 = 20 → Invalid (0 from 10 is in 20)
 * - 11 -> 2 * 11 = 22 → Valid
 * - 12 -> 2 * 12 = 24 → Invalid (2 from 12 is in 24)
 * - 13 -> 2 * 13 = 26 → Valid
 * - 14 -> 2 * 14 = 28 → Valid
 * - 15 -> 2 * 15 = 30 → Valid
 *
 * Valid numbers: 11, 13, 14, 15 → Count = 4
 *
 * Constraints:
 * - All numbers are positive integers below 10^5
 */

import java.util.*;

public class NonRepeatingDigitInProduct {

    public static int nonRepeatingDigitProductCount(int x, int y, int z) {
        int count = 0;

        for (int n = y; n <= z; n++) {
            if (isValid(n, x * n)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isValid(int n, int product) {
        Set<Character> nDigits = new HashSet<>();
        for (char c : String.valueOf(n).toCharArray()) {
            nDigits.add(c);
        }

        for (char c : String.valueOf(product).toCharArray()) {
            if (nDigits.contains(c)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(NonRepeatingDigitInProduct.nonRepeatingDigitProductCount(2, 10, 15)); // Output: 4
    }
}


