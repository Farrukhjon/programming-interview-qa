/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.java.collections;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class ComparableAndComparatorTests {

    private List<String> names = null;
    private List<Person> persons = null;

    @Before
    public void setUp() throws Exception {
        names = Arrays.asList("Ali", "Vali", "Surayo", "Myhayo");
        persons = Arrays.asList(new Person("Ali", "Samizoda"), new Person("Jomi", "Ganioda"), new Person("Vali", "Hasanzoda"));
    }

    @Test
    public void shouldTestSortingStringByLengthOrderingUsingComparator() throws Exception {
        Comparator<String> stringByLengthComparator = (name1, name2) -> name2.length() - name1.length();
        Collections.sort(names, stringByLengthComparator);
        String[] expectedNames = new String[]{"Surayo", "Myhayo", "Vali", "Ali"};
        assertArrayEquals(expectedNames, names.toArray());
    }

    @Test
    public void shouldTestSortingPersonsByTheirFirstNames() throws Exception {
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);
    }

    @Getter
    @RequiredArgsConstructor
    static class Person implements Comparable<Person> {
        @NonNull
        private final String firstName;
        @NonNull
        private final String lastName;

        @Override
        public int compareTo(final Person o) {
            return o.firstName.hashCode() - this.firstName.hashCode();
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("{");
            sb.append("firstName='").append(firstName).append('\'');
            sb.append(", lastName='").append(lastName).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

}
