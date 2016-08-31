/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.java.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTests {

    private Map<String, Integer> names;

    @Before
    public void setUp() throws Exception {
        names = new TreeMap<>();
    }

    @Test
    public void putMethodInActionWhenKeyIsTheSameAlways() throws Exception {
        for (int i = 20; i <= 32; i += 3) {
            String key = "Ali";
            Integer put = names.put(key, i);
            System.out.printf("\nOld value is returned: %s, and New value is passed: %s", put, names.get(key));
        }
    }
}
