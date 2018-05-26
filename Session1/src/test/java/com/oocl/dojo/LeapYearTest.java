package com.oocl.dojo;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {
    @Test
    public void year_1996_is_a_leap_year_test() {
        Year year = new Year(1996);
        boolean isLeapYear = year.isLeapYear();

        Assert.assertTrue(isLeapYear);
    }
    @Test
    public void year_2001_is_not_a_leap_year_test() {
        Year year = new Year(2001);
        boolean isLeapYear = year.isLeapYear();
        Assert.assertFalse(isLeapYear);
    }
}
