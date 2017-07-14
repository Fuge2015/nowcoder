package com.fuge.test;

import com.fuge.MergeList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-3-26.
 */
public class MergeListTest {
    @Test
    public void mergerList() throws Exception {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i += 2) {
            a.add(i);
        }

        List<Integer> b = new ArrayList<>();
        for (int i = 1; i < 20; i += 2) {
            b.add(i);
        }

        int expected = a.size() + b.size();

        List<Integer> c = new MergeList().mergerList(a,b);
        for (int i = 0; i < c.size(); i++) {
            System.out.print(c.get(i) + " ");
        }

        assertEquals(expected, c.size());
    }

}