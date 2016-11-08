package com.example.user.wordcounter;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter {
    private String entry;

    public WordCounter(String entry) {
        this.entry = entry;
    }

    public String getEntry() {
        return this.entry;
    }

    public Integer wordCount() {
        int count = entry.isEmpty() ? 0 : entry.split("\\s+").length;
        return count;
    }
}

