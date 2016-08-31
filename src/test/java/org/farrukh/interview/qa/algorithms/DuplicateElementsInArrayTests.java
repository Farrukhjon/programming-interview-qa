/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateElementsInArrayTests {

    @Test
    public void shouldFindADuplicateElementInTheIntegerArray() throws Exception {
        int expectedValue = 3;
        int[] numbers = {0, 1, 2, 3, 4, 5, expectedValue};
        int dupElement = DuplicateElementsInArray.duplicate(numbers);
        Assert.assertEquals(expectedValue, dupElement);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrownExceptionIfExpectedValueGreaterThenLengthMinusTwo() throws Exception {
        int expectedValue = 6;
        int[] numbers = {0, 1, 2, 3, 4, 5, expectedValue};
        int dupElement = DuplicateElementsInArray.duplicate(numbers);
        Assert.assertEquals(expectedValue, dupElement);
    }


}
