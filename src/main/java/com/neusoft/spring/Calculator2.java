package com.neusoft.spring;

import java.math.BigDecimal;

public class Calculator2  implements CalculatorService{
    public double add(double x, double y) {
        BigDecimal b1 = new BigDecimal(String.valueOf(x));
        BigDecimal b2 = new BigDecimal(String.valueOf(y));
        b1 = b1.add(b2);
        return b1.doubleValue();
    }

    public double substract(double x, double y) {
        BigDecimal b1 = new BigDecimal(String.valueOf(x));
        BigDecimal b2 = new BigDecimal(String.valueOf(y));
        b1 = b1.subtract(b2);
        return b1.doubleValue();
    }

    public double multiply(double x, double y) {
        BigDecimal b1 = new BigDecimal(String.valueOf(x));
        BigDecimal b2 = new BigDecimal(String.valueOf(y));
        b1 = b1.multiply(b2);
        return b1.doubleValue();
    }

    public double divide(double x, double y) {

        BigDecimal b1 = new BigDecimal(String.valueOf(x));
        BigDecimal b2 = new BigDecimal(String.valueOf(y));
        b1 = b1.divide(b2);
        return b1.doubleValue();
    }
}
