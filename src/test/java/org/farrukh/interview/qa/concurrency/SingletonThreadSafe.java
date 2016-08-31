/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.concurrency;

/**
 * Thread Safe Singleton DP by Double Checked Lock.
 */
public class SingletonThreadSafe {

    /**
     * The volatile keyword must be applied.
     */
    private static volatile SingletonThreadSafe _instance;

    public static SingletonThreadSafe getInstance() {
        if (_instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (_instance == null) {
                    _instance = new SingletonThreadSafe();
                }
            }
        }
        return _instance;
    }

}
