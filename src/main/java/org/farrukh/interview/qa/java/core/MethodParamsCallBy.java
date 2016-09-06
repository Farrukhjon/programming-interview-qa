/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <farrukhjon.sattorov@gmail.com>, May 2016.
 */

package org.farrukh.interview.qa.java.core;

public class MethodParamsCallBy {

    public static void main(String[] args) {
        Point point = new Point(0, 0);
        System.out.println(point);

        modify(point, 1, 1);

        System.out.println(point);
    }

    private static void modify(Point point, int x, int y) {
        point.setX(x);
        point.setY(y);
        System.out.println(point);
    }

    private static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(final int x) {
            this.x = x;
        }

        public void setY(final int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

       /* @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }*/
    }

}
