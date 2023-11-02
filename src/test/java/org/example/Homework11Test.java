package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class Homework11Test {

    private final Homework11 homework11 = new Homework11();

    @Test
    void testMaxDuplicates() {
        List<Integer> numbers = List.of(1, 2, 2, 1, 1);
        int actualResult = homework11.maxDuplicate(numbers);
        assertEquals(2, actualResult);
    }

    @Test
    void testDuplicatesWithEmptyList() {
        List<Integer> emptyList = List.of(1, 2, 3);
        int result = homework11.maxDuplicate(emptyList);
        assertNull(null, String.valueOf(result));
    }

    @Test
    void testWordNumeration() {
        List<String> words = List.of("Hi", "hi", "welcome", "no", "hI", "HI");
        List<String> expectedResult = List.of("Hi#1", "hi#2", "welcome#1", "no#1", "hI#3", "HI#4");
        List<String> actualResult = homework11.wordNumeration(words);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    void testMakeBricksNotEnoughSmallBricks() {
        boolean brickResult = homework11.makeBricks(3, 1, 9);
        assertEquals(false, brickResult);
    }

    @Test
    void testMakeBricksWithNotEnoughBigBricks() {
        boolean bricksResult = homework11.makeBricks(3, 2, 10);
        assertEquals(true, bricksResult);
    }

    @Test
    void testMakeBricksWithNotEnoughBricks() {
        boolean bricksResult = homework11.makeBricks(3, 1, 8);
        assertEquals(true, bricksResult);
    }
}


