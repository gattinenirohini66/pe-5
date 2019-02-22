package com.stackroute.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RepeatedWordsTest {

    private RepeatedWords repeat;
    @Before
    public void setUp() throws Exception {
        repeat = new RepeatedWords();
    }

    @After
    public void tearDown() throws Exception {
        repeat = null;
    }

    @Test
    public void wordRepeat() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",true);
        expectedResult.put("two",false);
        assertEquals(expectedResult,repeat.wordRepeat(new String[]{"one","one","two"}));
    }
    @Test
    public void wordRepeatFailure() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",false);
        expectedResult.put("two",true);
        assertNotEquals(expectedResult,repeat.wordRepeat(new String[]{"one","one","two"}));
        assertNotNull(repeat.wordRepeat(new String[]{"one","one","two"}));
    }
    @Test
    public void wordRepeats() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",true);
        expectedResult.put("two",false);
        expectedResult.put("a",true);
        expectedResult.put("@",false);
        expectedResult.put("1",false);
        assertEquals(expectedResult,repeat.wordRepeat(new String[]{"one","one","two","a","a","@","1"}));
    }
    @Test
    public void wordRepeatsFailure() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",false);
        expectedResult.put("two",true);
        expectedResult.put("a",false);
        expectedResult.put("@",true);
        assertNotEquals(expectedResult,repeat.wordRepeat(new String[]{"one","one","two","a","a","@"}));
        assertNotNull(repeat.wordRepeat(new String[]{"one","one","two","a","a","@"}));
    }
}