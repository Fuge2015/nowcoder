package com.fuge.test;

import com.fuge.FindInArray;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-3-24.
 */
public class FindInArrayTest {
    private FindInArray findInArray = new FindInArray();
    @Test
    public void find() throws Exception {
        int [][] array = {{}};
        assertEquals(false,findInArray.find(16,array));
    }

    @Test
    public void replaceSpace() throws Exception {
        String s = "hello  world";
        assertEquals("hello%20%20world", findInArray.replaceSpace(s));
    }

}