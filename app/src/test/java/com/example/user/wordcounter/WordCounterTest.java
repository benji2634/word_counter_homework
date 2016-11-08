package com.example.user.wordcounter;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 * Created by user on 08/11/2016.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter("This is my entry");
    }

    @Test
    public void testCanEnterText() {
        assertEquals("This is my entry", wordCounter.getEntry());
    }

    @Test
    public void testCanCountWords() {
        assertEquals(4, wordCounter.wordCount().intValue());
    }

}
