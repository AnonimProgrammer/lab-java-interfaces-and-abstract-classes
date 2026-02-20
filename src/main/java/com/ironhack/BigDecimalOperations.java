package com.ironhack;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static void main(String[] args) {
        BigDecimal value1 = BigDecimal.valueOf(4.2545);
        double doubleValue = toDouble(value1);
        System.out.println("Double value: " + doubleValue);

        BigDecimal value2 = BigDecimal.valueOf(1.2345);
        double reversedDoubleValue = toReversedDouble(value2);
        System.out.println("Reversed value: " + reversedDoubleValue);
    }

    public static double toDouble(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double toReversedDouble(BigDecimal value) {
        return value.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}
