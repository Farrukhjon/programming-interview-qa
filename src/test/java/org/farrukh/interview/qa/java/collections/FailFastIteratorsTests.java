/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.java.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class FailFastIteratorsTests {

    private ArrayList<Integer> numbers = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        for (int i = 0; i <= 9; i++) {
            numbers.add(i);
        }
    }

    @Test(expected = ConcurrentModificationException.class)
    public void failFastIteratingTest() throws Exception {
        Iterator<Integer> iterator = numbers.iterator();

        iterator.next(); // iteration over the numbers is started here.

        numbers.remove(5);

        iterator.next();

    }
}
