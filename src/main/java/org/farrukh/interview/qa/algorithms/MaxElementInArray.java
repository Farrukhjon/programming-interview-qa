/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.algorithms;

import java.util.NoSuchElementException;

public class MaxElementInArray {

    public static void main(String[] args) {
        int[] array = {1, 3, 10, 1, 7, 9};
        int maxElement = max(array);
        System.out.println("Maximal element from " + array + " is " + maxElement);

        int max2 = max2(array);
        System.out.println("Maximal element from " + array + " is " + max2);
    }

    private static int max(final int[] array) {
        checkArrayLength(array);
        return max(array, 0, array.length);
    }

    /**
     * Recursive approach.
     *
     * @param array
     * @param left
     * @param right
     * @return
     */
    private static int max(final int[] array, final int left, final int right) {
        if (right - left == 1)
            return array[left];
        int mid = (left + right) / 2;
        int maxLeft = max(array, left, mid);
        int maxRight = max(array, mid, right);

        return maxLeft > maxRight ? maxLeft : maxRight;
    }

    /**
     * Iteration approach.
     *
     * @param a an array
     * @return max value.
     */
    private static int max2(int[] a) {
        checkArrayLength(a);
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }
        return max;
    }

    private static void checkArrayLength(final int[] array) {
        if (array.length == 0) {
            throw new NoSuchElementException("An Empty array cannot hold a max element");
        }
    }

}
