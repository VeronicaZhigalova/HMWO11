package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;


public class Homework11Test {

    private final Homework11 homework11 = new Homework11();

    @Test
    void testMaxDuplicates() {
        List<Integer> numbers = List.of(1, 2, 2, 1, 1);
        int actualResult = homework11.maxDuplicate(numbers);
        assertEquals(2, actualResult);
    }

    @Test
    void testWordNumeration() {
        List<String> words = List.of("Hi", "hi", "welcome", "no", "hI", "HI");
        List<String> expectedResult = List.of("Hi#1", "hi#2", "welcome#1", "no#1", "hI#3", "HI#4");
        List<String> actualResult = homework11.wordNumeration(words);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testMakeBricks() {
        boolean bricksResult = homework11.makeBricks(3, 2, 10);
        assertEquals(true, bricksResult);

    }
}


