/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.algorithms;

import java.util.Arrays;

public class RemoveElementInArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 1};
        int num = 1;
        int newArray[] = removeElement(numbers, num);
        print(newArray);
    }

    private static void print(final int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    private static int[] removeElement(final int[] numbers, final int num) {
        int newLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != num) {
                numbers[newLength] = numbers[i];
                newLength++;
            }
        }
        return Arrays.copyOf(numbers, newLength);
    }

}
