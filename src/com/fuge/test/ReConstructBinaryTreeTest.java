package com.fuge.test;

import com.fuge.ReConstructBinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-3-27.
 */
public class ReConstructBinaryTreeTest {
    @Test
    public void reConstructBinaryTree() throws Exception {
//        int [] pre = {1,2,4,7,3,5,6,8};
//        int [] in = {4,7,2,1,5,3,8,6};

//        int [] pre = {1};
//        int [] in = {1};

//        int [] pre = {};
//        int [] in = {};

//        int [] pre = {1,2,3,4,5};
//        int [] in = {1,2,3,4,5};

        int [] pre = {1,2,3,4,5};
        int [] in = {5,4,3,2,1};

        ReConstructBinaryTree re = new ReConstructBinaryTree();
        re.reConstructBinaryTree(pre, in);
    }

}