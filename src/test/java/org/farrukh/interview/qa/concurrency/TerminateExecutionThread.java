/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.concurrency;

import java.util.concurrent.TimeUnit;

public class TerminateExecutionThread {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            while (!currentThread.isInterrupted()) {
                System.out.println(currentThread.getName() + " Execution...");
            }
        });
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(thread.getName() + " is " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
