package com.epam.impl;

import com.epam.Calculator;

/**
 * Created by Yauheni_Sidarenka on 9/5/2014.
 */
public class IntegerCalculator implements Calculator<Integer> {


    @Override
    public Long add(Long first, Long second) {
        return first + second;
    }

    public Integer add(Integer first, Integer second) {
        return first + second;
    }

    @Override
    public Long diff(Long first, Long second) {
        return first - second;
    }

    public Integer diff(Integer first, Integer second) {
        return first - second;
    }

    @Override
    public Integer multiple(Integer first, Integer second) {
        return new Integer(first.intValue() * second.intValue());
    }

    @Override
    public Integer divide(Integer first, Integer second) {
        return new Integer(first.intValue() / second.intValue());
    }
}
