package com.oocl.dojo;

public class Year {
    int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return this.year % 4 == 0;
    }
}
