package com.oocl.dojo;

public class Year {
    int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if (this.year % 100 == 0) {
            return this.year % 400 == 0;
        }
        return this.year % 4 == 0;
    }
}
