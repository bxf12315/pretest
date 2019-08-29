package com.bmw.interview.pretest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeFinderTest {

    @Test
    public void testFind() {
        String testString1 = "This is racecar and madam, but the number is 121";
        PalindromeFinder palindromeFinder = new PalindromeFinder();
        assertEquals("racecar", palindromeFinder.find(testString1));

        String testString2 = "This is racecar and madam, but the number is 1rrrrrr21";
        assertEquals("1rrrrrr21", palindromeFinder.find(testString2));

        String testString3 = "ThisBMWGood is racecar and madam, but the number is 121";
        assertEquals("ThisBMWGood", palindromeFinder.find(testString3));
    }
}
