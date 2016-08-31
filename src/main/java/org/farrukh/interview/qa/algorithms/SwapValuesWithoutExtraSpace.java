/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.algorithms;

public class SwapValuesWithoutExtraSpace {

    public static void main(String[] args) {
        swap(2, 3);
        swapWithXor(12, 15);
        swapStrings("Hello", "world!");
    }

    private static void swap(int x, int y) {
        System.out.println("X = " + x + "; Y = " + y + ";");

        x = x + y;

        y = x - y;
        x = x - y;

        System.out.println("X = " + x + "; Y = " + y + ";");
    }

    /**
     *
     * @param x
     * @param y
     */
    private static void swapWithXor(int x, int y) {
        System.out.println("X = " + x + "; Y = " + y + ";");

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("X = " + x + "; Y = " + y + ";");
    }

    private static void swapStrings(String str1, String str2) {
        System.out.println("str1 = " + str1 + "; str2 = " + str2 + ";");

        int length1 = str1.length();
        str1 = str1 + str2;
        str2 = str1.substring(0, length1);
        str1 = str1.substring(length1);

        System.out.println("str1 = " + str1 + "; str2 = " + str2 + ";");
    }


}
