/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.exceptions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConcurrentModificationExceptionTests {

    @Test(expected = ConcurrentModificationException.class)
    public void shouldThrowConcurrentModificationException() throws Exception {
        String nameToRemove = "Gani";
        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Vali");
        names.add("Sami");
        names.add("Gani");
        for (String name : names) {
            if (name.equals(nameToRemove)) {
                names.remove(name);
            }
        }

    }

    @Test
    public void shouldNotThrowConcurrentModificationException() throws Exception {
        String phoneToRemove = "iPhone 5";

        int expectedSizeBefore = 5;
        int expectedSizeAfter = 4;

        List<String> listOfPhones = new ArrayList<>();
        listOfPhones.add("iPhone 6S");
        listOfPhones.add("iPhone 6");
        listOfPhones.add("iPhone 5");
        listOfPhones.add("Samsung Galaxy 4");
        listOfPhones.add("Lumia Nokia");

        assertEquals(expectedSizeBefore, listOfPhones.size());

        for (Iterator<String> itr = listOfPhones.iterator(); itr.hasNext(); ) {
            String phone = itr.next();
            if (phone.equals(phoneToRemove)) {
                itr.remove();
            }
        }

        assertEquals(expectedSizeAfter, listOfPhones.size());
    }
}
