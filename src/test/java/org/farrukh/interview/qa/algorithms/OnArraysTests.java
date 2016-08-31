/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OnArraysTests {

    /**
     * Subject under test.
     */
    private UnionTwoArrays sut;

    @Before
    public void setUp() throws Exception {
        sut = new UnionTwoArrays();
    }

    @Test
    public void shouldTestUnionTwoArrays() throws Exception {
        String[] names1 = {"A", "B", "C", "D"};
        String[] names2 = {"E", "C", "F", "A", "G"};

        String[] unionedNames = sut.union(names1, names2);

        assertThat(unionedNames)
                .contains(names1)
                .contains(names2);

    }
}
