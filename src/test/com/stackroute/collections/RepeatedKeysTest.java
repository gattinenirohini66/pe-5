package com.stackroute.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import java.util.*;

public class RepeatedKeysTest {

    private RepeatedKeys keys;
    @Before
    public void setUp() throws Exception {
        keys = new RepeatedKeys();
    }

    @After
    public void tearDown() throws Exception {
        keys = null;
    }

    @Test
    public void repeatKeys() {
        Map array = new LinkedHashMap();
        array.put("val1", "Java");
        array.put("val2", "C++");

        Map modify = new LinkedHashMap();
        modify.put("val1", "");
        modify.put("val2", "Java");

        assertEquals(modify, keys.repeatKeys(array));

        array.clear();
        modify.clear();
    }
    @Test
    public void repeatKeysFailure() {
        Map array = new LinkedHashMap();
        array.put("val1","Java");
        array.put("val2","C++");

        Map modify = new LinkedHashMap();
        modify.put("1","");
        modify.put("2","Java");

        assertNotEquals(modify,keys.repeatKeys(array));
    }
    @Test
    public void repeatKey() {
        Map array = new LinkedHashMap();
        array.put("val1", "1234");
        array.put("val2", "4567");

        Map modify = new LinkedHashMap();
        modify.put("val1", "");
        modify.put("val2", "1234");

        assertEquals(modify, keys.repeatKeys(array));

        array.clear();
        modify.clear();
    }
    @Test
    public void repeatKeyFailure() {
        Map array = new LinkedHashMap();
        array.put("val1","1234");
        array.put("val2","4567");

        Map modify = new LinkedHashMap();
        modify.put("val2","");
        modify.put("val1","4567");

        assertNotEquals(modify,keys.repeatKeys(array));
    }
}