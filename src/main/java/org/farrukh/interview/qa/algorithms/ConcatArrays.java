/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.algorithms;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatArrays {

    public static void main(String[] args) {
        String[] males = {"Ali", "Vali", "Sami", "Gani", "Jomi"};
        String[] females = {"Salomat", "Ibidat", "Karomat"};

        String[] names = concat(males, females);
        print(names);

        String[] concatByStream = concatByStream(males, females);
        print(concatByStream);

        String[] concatByStream2 = concatByStream2(males, females);
        print(concatByStream2);
    }

    private static void print(final String[] names) {
        System.out.println("----------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    private static String[] concat(final String[] males, final String[] females) {
        int malesLength = males.length;
        int femalesLength = females.length;
        int newArrayLength = malesLength + femalesLength;
        String[] newArray = Arrays.copyOf(males, newArrayLength);
        System.arraycopy(females, 0, newArray, malesLength, femalesLength);
        return newArray;
    }

    private static String[] concatByStream(final String[] males, final String[] females) {
        return Stream.concat(Arrays.stream(males), Arrays.stream(females))
                     .toArray(String[]::new);
    }

    private static String[] concatByStream2(final String[] males, final String[] females) {
        return Stream.of(males, females)
                     .flatMap(Stream::of)
                     .toArray(String[]::new);
    }

}
