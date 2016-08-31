/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.java.concurrency;

public class ThreadExecutionWhenNullPointerExceptionOccurs {

    public static void main(String[] args) {
        String mainThreadName = Thread.currentThread().getName();
        System.out.println("Execution in the: " + mainThreadName);

        new Thread(() -> {
            while (true) {
                System.out.println("Execution in the: " + Thread.currentThread().getName());
            }
        }).start();

        throw new NullPointerException("Exception on: " + mainThreadName);
    }
}

