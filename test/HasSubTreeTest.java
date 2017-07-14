import com.fuge.HasSubTree;
import com.fuge.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-7-13.
 */
public class HasSubTreeTest {
    @Test
    public void hasSubtree() throws Exception {
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(8);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(9);
        root1.left.right = new TreeNode(3);
        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(2);

        HasSubTree h = new HasSubTree();
        boolean result = h.HasSubtree(root1, root2);
        System.out.println(result);
    }

}