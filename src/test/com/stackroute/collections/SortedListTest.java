package com.stackroute.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class SortedListTest {

    private SortedList sort;
    @Before
    public void setUp() throws Exception {
        sort = new SortedList();
    }

    @After
    public void tearDown() throws Exception {
        sort = null;
    }

    @Test
    public void sorted() {
       assertEquals(new ArrayList<String>(Arrays.asList("Alice","Bluto","Eugene","Harry","olive")),sort.sorted(new String[]{"Harry","olive","Alice","Bluto","Eugene"}));
    }
    @Test
    public void sortedFailure() {
        assertNotEquals(new ArrayList<String>(Arrays.asList("Alice","Bluto","Harry","Eugene","olive")),sort.sorted(new String[]{"Harry","olive","Alice","Bluto","Eugene"}));
    }
    @Test
    public void sorts() {
        assertEquals(new ArrayList<String>(Arrays.asList("Ab","Bc","cd","de","ef")),sort.sorted(new String[]{"ef","cd","de","Bc","Ab"}));
    }
    @Test
    public void sortsFailure() {
        assertNotEquals(new ArrayList<String>(Arrays.asList("Ab","Bc","de","cd","ef")),sort.sorted(new String[]{"ef","cd","de","Bc","Ab"}));
    }
}