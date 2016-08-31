/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.algorithms;

public class ReverseString {

    public static void main(String[] args) {
        String greeting = "Hello world";

        String reversedIteratively = reverseIteratively(greeting);
        System.out.println(reversedIteratively);

        String reversedRecursively = reverseRecursively(greeting);
        System.out.println(reversedRecursively);
    }

    private static String reverseIteratively(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            strBuilder.append(chars[i]);
        }
        return strBuilder.toString();
    }

    private static String reverseRecursively(String str) {
        if (str.length() < 2)
            return str;
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

}
