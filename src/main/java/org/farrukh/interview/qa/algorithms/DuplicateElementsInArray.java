/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateElementsInArray {

    public static void main(String[] args) {
        String[] names = {"Ali", "Vali", "Sami", "Gani", "Jomi", "Vali", "Karomat", "Salomat", "Ibidat", "Karomat"};
        List<String> duplicates = findDuplicates(names);
        System.out.println("Duplicate elements: " + duplicates);

        int[] numbers = {0, 1, 2, 3, 4, 5, 3, 5, 7, 8, 9, 1};
        findDuplicateNumbers(numbers);
    }

    private static List<String> findDuplicates(final String[] names) {
        List<String> duplicates = new ArrayList<>();
        HashSet<String> helperSet = new HashSet<>();
        for (String s : names) {
            boolean contains = helperSet.add(s);
            if (!contains) {
                duplicates.add(s);
            }
        }
        return duplicates;
    }

    /**
     * Time complexity O(n)
     * Space complexity O(1)
     *
     * @param numbers
     */
    public static void findDuplicateNumbers(final int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i && numbers[numbers[i]] == numbers[i]) {
                System.out.printf("Duplicate elements: %s\n", numbers[i]);
                numbers[numbers[i]] = i;
            }
        }
    }

    public static int duplicate(int[] numbers) {
        int length = numbers.length;
        int sum1 = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] < 0 || numbers[i] > length - 2) {
                throw new IllegalArgumentException("Invalid number... " + numbers[i]);
            }
            sum1 += numbers[i];
        }
        int sum2 = ((length - 1) * (length - 2)) >> 1;
        return sum1 - sum2;

    }

    public List<String> findDuplicates2(final String[] array) {
        ArrayList<String> duplicates = new ArrayList<>();
        int size = array.length - 1;
        for (int i = 0; i < size; i++) {
            String s = array[i];
            for (int j = i; j < size; j++) {
                if (s.equals(array[j + 1])) {
                    duplicates.add(array[i]);
                }
            }
        }
        return duplicates;
    }


}
