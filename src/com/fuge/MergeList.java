package com.fuge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongfu on 17-3-26.
 */
public class MergeList {
    public List<Integer> mergerList(List<Integer> a, List<Integer> b) {
        List<Integer> c = new ArrayList<>();
        while (!a.isEmpty() && !b.isEmpty()) {
            if (a.get(0) < b.get(0)) {
                c.add(a.remove(0));
            } else {
                c.add(b.remove(0));
            }
        }
        while(!a.isEmpty()) {
            c.add(a.remove(0));
        }
        while (!b.isEmpty()) {
            c.add(b.remove(0));
        }
        return c;
    }
}
