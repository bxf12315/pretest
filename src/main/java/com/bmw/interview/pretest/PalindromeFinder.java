package com.bmw.interview.pretest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class PalindromeFinder {

    public String find(String s) {
        List<String> palindromeList = Arrays.asList(s.split(" "));
        final AtomicReference<String> atomicReference = new AtomicReference<>();
        palindromeList.stream().sorted(Comparator.comparing(String::length).reversed())
                .findFirst().ifPresent(result -> atomicReference.set(result));

        return atomicReference.get();
    }
}
