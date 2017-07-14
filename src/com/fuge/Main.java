package com.fuge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        HashMap<String, String> map = new HashMap<>();
//        Boolean flag = false;
//        while (scanner.hasNext() && m > 0) {
//            m--;
//            String first = scanner.next();
//            String second = scanner.next();
//            map.put(first, second);
//        }
//
//        Set<String> set = map.keySet();
//        Iterator it = set.iterator();
//        while (it.hasNext()) {
//            String key = (String) it.next();
//            String key2 = key;
//            while (map.get(key2) != null) {
//                if (map.get(key2).equals(key)) {
//                    flag = true;
//                    break;
//                } else {
//                    key2 = map.get(key2);
//                }
//            }
//        }
//        if (flag) {
//            System.out.println("T");
//        } else {
//            System.out.println("F");
//        }

        int[] nums = {5,4,0,3,1,6,2};
        System.out.println(arrayNesting(nums));
    }

    public static int arrayNesting(int[] nums) {
        int result = 0;
        boolean[] flag = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (!flag[i]) {
                Set<Integer> set = new HashSet<>();
                int key = i;
                set.add(key);
                while (!set.contains(key)) {
                    set.add(key);
                    flag[key] = true;
                    key = nums[key];
                }
                if (set.size() > nums.length / 2) {
                    return set.size();
                }
                if (set.size() > result) {
                    result = set.size();
                }
            }
        }
        return result;
    }
}