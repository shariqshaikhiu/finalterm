package com.finalterm.exam.Question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void testReverseString() {
        Question1 question1 = new Question1();
        assertEquals("olleh", question1.reverseString("hello"));
    }
