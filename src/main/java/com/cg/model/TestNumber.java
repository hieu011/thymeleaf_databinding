package com.cg.model;

import java.math.BigDecimal;

public class TestNumber {
    public static void main(String[] args) {
//        Double d1 = 0.3d;
//        Double d2 = 0.1d;
//        Double d3 = d1 + d2;
//        System.out.println("d3 = " + d3); // 0.4
//
//        Double d4 = d1 - d2;
//        System.out.println("d4 = " + d4); // 0.2 || 0.1999999999
//
//        Double d5 = d1 * d2;
//        System.out.println("d5 = " + d5); // 0.03 || 0.299999999
//
//        Double d6 = d1 / d2;
//        System.out.println("d6 = " + d6); // 3 || 2.999999999


//        Float d1 = 0.3f;
//        Float d2 = 0.1f;
//        Float d3 = d1 + d2;
//        System.out.println("d3 = " + d3); // 0.4
//
//        Float d4 = d1 - d2;
//        System.out.println("d4 = " + d4); // 0.2 || 0.1999999999
//
//        Float d5 = d1 * d2;
//        System.out.println("d5 = " + d5); // 0.03 || 0.299999999
//
//        Float d6 = d1 / d2;
//        System.out.println("d6 = " + d6); // 3 || 2.999999999

        BigDecimal d1 = BigDecimal.valueOf(0.3d);
        BigDecimal d2 = BigDecimal.valueOf(0.1d);
        BigDecimal d3 = d1.add(d2);
        System.out.println("d3 = " + d3); // 0.4

        BigDecimal d4 = d1.subtract(d2);
        System.out.println("d4 = " + d4); // 0.2 || 0.1999999999

        BigDecimal d5 = d1.multiply(d2);
        System.out.println("d5 = " + d5); // 0.03 || 0.299999999

        BigDecimal d6 = d1.divide(d2);
        System.out.println("d6 = " + d6); // 3 || 2.999999999

    }
}
