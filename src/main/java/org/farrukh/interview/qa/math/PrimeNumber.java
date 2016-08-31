/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.math;

/**
 * A prime number (or a prime) is a Natural number greater than 1 that has no positive divisors other than 1 and itself.
 */
public class PrimeNumber {

    private final int number;

    public PrimeNumber(final int number) {
        this.number = number;
    }

    /**
     * This algorithm allows iterate only up through the square root of n
     * @return prime number if true, or composite number if false.
     */
    public boolean isPrime() {
        if (this.number < 2) {
            return false;
        }
        for (int i = 2; i < (int) Math.sqrt(number); i++) {
            if (number % i == 0) // divide
                return false;
        }
        return true;
    }

}
