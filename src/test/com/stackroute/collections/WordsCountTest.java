package com.stackroute.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class WordsCountTest {

    private WordsCount count;
    @Before
    public void setUp() throws Exception {
        count = new WordsCount();
    }

    @After
    public void tearDown() throws Exception {
        count = null;
    }

    @Test
    public void wordCount() {
        Map<String,Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one",3);
        expectedResult.put("two",2);
        assertEquals(expectedResult,count.wordCount("one*one+two/two-one"));
    }
    @Test
    public void wordCountFailure() {
        Map<String,Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one",2);
        expectedResult.put("two",3);
        assertNotEquals(expectedResult,count.wordCount("one +two/two-one"));
    }
    @Test
    public void wordCounts() {
        Map<String,Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one",3);
        expectedResult.put("two",2);
        expectedResult.put("three",3);
        expectedResult.put("four",1);
        assertEquals(expectedResult,count.wordCount("one one+two/two-one:three three]three/four"));
    }
    @Test
    public void wordCountsFailure() {
        Map<String,Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one",2);
        expectedResult.put("two",3);
        expectedResult.put("three",0);
        expectedResult.put("four",8);
        assertNotEquals(expectedResult,count.wordCount("one one+two/two-one:three three]three/four"));
    }
}