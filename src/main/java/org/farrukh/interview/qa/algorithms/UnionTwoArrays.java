/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.algorithms;

public class UnionTwoArrays {

    String[] union(final String[] a1, final String[] a2) {
        int size1 = a1.length;
        int size2 = a2.length;
        String[] union = new String[size1 + size2];
        System.arraycopy(a1, 0, union, 0, size1);
        System.arraycopy(a2, 0, union, size1, size2);
        return union;
    }

    public static void main(String[] args) {
        String[] a1 = {"C", "F", "D", "E", "F", "C", "C", "D", "E"};
        String[] a2 = {"A", "X"};
        UnionTwoArrays unionTwoArrays = new UnionTwoArrays();
        String[] union = unionTwoArrays.union(a1, a2);
        for (String s : union) {
            System.out.println(s);
        }
    }

}
