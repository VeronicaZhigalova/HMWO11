package org.example;

import lombok.Data;

import java.util.*;

@Data
public class Homework11 {

    public Integer maxDuplicate(List<Integer> nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (Integer num : nums) {
            if (uniqueNumbers.contains(num)) {
                duplicates.add(num);
            } else {
                uniqueNumbers.add(num);
            }
        }
        if (duplicates.isEmpty()) {
            return null;
        }
        return (Integer) Collections.max(duplicates);
    }

    public List<String> wordNumeration(List<String> words) {
        List<String> numberedWords = new ArrayList<>();
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            String wordWord = word.toLowerCase();
            int count = (int) wordCounts.getOrDefault(wordWord, 0) + 1;
            wordCounts.put(wordWord, count);
            String numberedWord = word + "#" + count;
            numberedWords.add(numberedWord);
        }
        return numberedWords;
    }

    public boolean makeBricks(int small, int big, int goal) {
        int bigBricks = 5;
        int goalBricks = big * bigBricks + small;
        if (goalBricks >= goal && (goal % bigBricks <= small)) {
            return true;
        } else {
            return false;
        }
    }
}