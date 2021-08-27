package com.setenay.javaproblemsandsolutions.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void testReverseOneNull() {
        assertNull(ReverseString.reverseOne(null));
    }

    @Test
    void testReverseOneBlank() {
        assertEquals("", ReverseString.reverseOne(""));
    }

    @Test
    void testReverseOneSingleChar() {
        assertEquals("s", ReverseString.reverseOne("s"));
    }

    @Test
    void testReverseOne() {
        assertAll(() -> assertEquals("edcba", ReverseString.reverseOne("abcde")),
                () -> assertEquals("aa aaa", ReverseString.reverseOne("aaa aa")),
                () -> assertEquals("aaaaa", ReverseString.reverseOne("aaaaa")),
                () -> assertEquals("Hi, I'm Setenay", ReverseString.reverseOne("yaneteS m'I ,iH")),
                () -> assertEquals("1234#", ReverseString.reverseOne("#4321")));
    }

    @Test
    void testReverseTwoNull() {
        assertNull(ReverseString.reverseTwo(null));
    }

    @Test
    void testReverseTwoBlank() {
        assertEquals("", ReverseString.reverseTwo(""));
    }

    @Test
    void testReverseTwoSingleChar() {
        assertEquals("s", ReverseString.reverseTwo("s"));
    }

    @Test
    void testReverseTwo() {
        assertAll(() -> assertEquals("edcba", ReverseString.reverseTwo("abcde")),
                () -> assertEquals("aa aaa", ReverseString.reverseTwo("aaa aa")),
                () -> assertEquals("aaaaa", ReverseString.reverseTwo("aaaaa")),
                () -> assertEquals("Hi, I'm Setenay", ReverseString.reverseTwo("yaneteS m'I ,iH")),
                () -> assertEquals("1234#", ReverseString.reverseTwo("#4321")));
    }

    @Test
    void testReverseThreeNull() {
        assertNull(ReverseString.reverseThree(null));
    }

    @Test
    void testReverseThreeBlank() {
        assertEquals("", ReverseString.reverseThree(""));
    }

    @Test
    void testReverseThreeSingleChar() {
        assertEquals("s", ReverseString.reverseThree("s"));
    }

    @Test
    void testReverseThree() {
        assertAll(() -> assertEquals("edcba", ReverseString.reverseThree("abcde")),
                () -> assertEquals("aa aaa", ReverseString.reverseThree("aaa aa")),
                () -> assertEquals("aaaaa", ReverseString.reverseThree("aaaaa")),
                () -> assertEquals("Hi, I'm Setenay", ReverseString.reverseThree("yaneteS m'I ,iH")),
                () -> assertEquals("1234#", ReverseString.reverseThree("#4321")));
    }
}
