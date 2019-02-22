package com.stackroute.collections;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacementTest {

    private Replacement replace;
    @Before
    public void setUp() throws Exception {
        replace = new Replacement();
    }

    @After
    public void tearDown() throws Exception {
        replace = null;
    }

    @Test
    public void replaceElements() {
        assertEquals(new ArrayList<String>(Arrays.asList("kiwi","grape","mango","berry")),replace.replaceElements(new ArrayList<String>(Arrays.asList("apple","grape","melon","berry")),new String[]{"kiwi","mango"},new int[]{0,2}));
    }
    @Test
    public void replaceElementsFailure() {
        assertNotEquals(new ArrayList<String>(Arrays.asList("kiwi","grape","melon","berry")),replace.replaceElements(new ArrayList<String>(Arrays.asList("apple","grape","melon","berry")),new String[]{"kiwi","mango"},new int[]{0,2}));
        assertNotNull(replace.replaceElements(new ArrayList<String>(Arrays.asList("apple","grape","melon","berry")),new String[]{"kiwi","mango"},new int[]{0,2}));
    }
    @Test
    public void replaceElement() {
        assertEquals(new ArrayList<String>(Arrays.asList("kho-kho","bat","throwball","play","handball")),replace.replaceElements(new ArrayList<String>(Arrays.asList("kho","bat","ball","play","balls")),new String[]{"kho-kho","throwball","handball"},new int[]{0,2,4}));
    }
    @Test
    public void replaceElementFailure() {
        assertNotEquals(new ArrayList<String>(Arrays.asList("kho-kho","bat","throwball","plays","handball")),replace.replaceElements(new ArrayList<String>(Arrays.asList("kho","bat","ball","play","balls")),new String[]{"kho-kho","throwball","handball"},new int[]{0,2,4}));
        assertNotNull(replace.replaceElements(new ArrayList<String>(Arrays.asList("kho","bat","ball","play","balls")),new String[]{"kho-kho","throwball","handball"},new int[]{0,2,4}));
    }
}