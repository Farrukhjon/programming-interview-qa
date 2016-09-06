/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.java.concurrency;

/**
 * Data Race (race condition) example.
 */
public class DataRaceDemo {

    public static void main(String[] args) {
        int count = 0;
        Counter counter = new Counter(count);

        for (int i = 0; i < 100; i++) {
            new Thread(counter).start();
        }

    }

    private static class Counter implements Runnable {

        /*volatile*/ int count; // Even volatile modifier cannot help to avoid the race condition effect.
                                // Because volatile does not guarantee atomicity. But it guarantees pepper visibility.

        public Counter(final int count) {
            this.count = count;
        }

        private void increment() {
            count++;
        }

        private void print() {
            System.out.println(count);
        }

        @Override
        public void run() {
            increment();
            print();
        }

    }

}
