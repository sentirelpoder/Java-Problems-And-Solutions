package com.setenay.javaproblemsandsolutions.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseNull() {
        assertAll(() -> assertNull(ReverseString.reverseOne(null)),
                () -> assertNull(ReverseString.reverseTwo(null)),
                () -> assertNull(ReverseString.reverseThree(null)));
    }

    @Test
    void reverseBlank() {
        assertAll(() -> assertEquals("", ReverseString.reverseOne("")),
                () -> assertEquals("", ReverseString.reverseTwo("")),
                () -> assertEquals("", ReverseString.reverseThree("")));
    }

    @Test
    void reverseSingleChar() {
        assertAll(() -> assertEquals("s", ReverseString.reverseOne("s")),
                () -> assertEquals("s", ReverseString.reverseTwo("s")),
                () -> assertEquals("s", ReverseString.reverseThree("s")));
    }

    @Test
    void reverseCaseOne() {
        assertAll(() -> assertEquals("edcba", ReverseString.reverseOne("abcde")),
                () -> assertEquals("aa aaa", ReverseString.reverseOne("aaa aa")),
                () -> assertEquals("aaaaa", ReverseString.reverseOne("aaaaa")),
                () -> assertEquals("Hi, I'm Setenay", ReverseString.reverseOne("yaneteS m'I ,iH")),
                () -> assertEquals("1234#", ReverseString.reverseOne("#4321")));
    }

    @Test
    void reverseCaseTwo() {
        assertAll(() -> assertEquals("edcba", ReverseString.reverseTwo("abcde")),
                () -> assertEquals("aa aaa", ReverseString.reverseTwo("aaa aa")),
                () -> assertEquals("aaaaa", ReverseString.reverseTwo("aaaaa")),
                () -> assertEquals("Hi, I'm Setenay", ReverseString.reverseTwo("yaneteS m'I ,iH")),
                () -> assertEquals("1234#", ReverseString.reverseTwo("#4321")));
    }

    @Test
    void reverseCaseThree() {
        assertAll(() -> assertEquals("edcba", ReverseString.reverseThree("abcde")),
                () -> assertEquals("aa aaa", ReverseString.reverseThree("aaa aa")),
                () -> assertEquals("aaaaa", ReverseString.reverseThree("aaaaa")),
                () -> assertEquals("Hi, I'm Setenay", ReverseString.reverseThree("yaneteS m'I ,iH")),
                () -> assertEquals("1234#", ReverseString.reverseThree("#4321")));
    }
}
