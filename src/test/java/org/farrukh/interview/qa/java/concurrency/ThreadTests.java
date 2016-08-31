/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.java.concurrency;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreadTests {

    @Test
    public void testThreadProperties() throws Exception {
        Thread thread = Thread.currentThread();
        long threadId = thread.getId();
        String threadName = thread.getName();
        Thread.State threadState = thread.getState();
        ThreadGroup threadGroup = thread.getThreadGroup();
        System.out.printf(" Id: %s\n Name: %s\n State: %s\n Group: %s", threadId, threadName, threadState, threadGroup);
    }

    @Test
    public void testThreadStates() throws Exception {
        Thread thread = new Thread();

        assertEquals(Thread.State.NEW, thread.getState());

        thread.start();
        assertEquals(Thread.State.RUNNABLE, thread.getState());

        thread.join(); // Parent thread (junit runner) will wait until the thread is terminated.
        assertEquals(Thread.State.TERMINATED, thread.getState());
    }

    @Test(expected = IllegalThreadStateException.class)
    public void testStartingAThreadTwice() throws Exception {
        Thread thread = new Thread();
        thread.start();
        thread.start();
    }
}
