/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.java.concurrency;

public class ShutdownHookDemo {

    public static void main(String[] args) {

        System.out.println("Execution from: " + Thread.currentThread().getName());

        // The hook initialized but not started yet.
        Thread hook = new Thread() {
            @Override
            public void run() {
                System.out.println("Execution from the shutdown hook");
            }
        };

        Runtime.getRuntime().addShutdownHook(hook);


        Thread.State state = hook.getState();
        System.out.println(state);

        //System.exit(0);
    }

}
