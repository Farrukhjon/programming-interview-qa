/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.java.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * One Writer thread and many reader threads operating over volatile data.
 * Volatile doesn't guarantees operation atomicity but guarantees proper/fresh data visibility for all threads.
 */
public class VolatileUseCaseDemo {

    static volatile int count;

    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread threadWriter = new Thread(counter);
        threadWriter.start();

        Thread tPrinter1 = new Thread(new Printer());
        Thread tPrinter2 = new Thread(new Printer());
        Thread tPrinter3 = new Thread(new Printer());
        tPrinter1.start();
        tPrinter2.start();
        tPrinter3.start();

    }

    private static class Counter implements Runnable {

        private void increment() {
            count++;
            System.out.println(Thread.currentThread().getName() + " writes: " + count);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    increment();
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static class Printer implements Runnable {

        private void print() {
            System.out.println(Thread.currentThread().getName() + " reads: " + count);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    print();
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
