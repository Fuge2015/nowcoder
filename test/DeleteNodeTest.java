import com.fuge.DeleteNode;
import com.fuge.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for DeleteNode
 * Created by dongfu on 17-7-14.
 */
public class DeleteNodeTest {
    @Test
    public void deleteNode() throws Exception {
        // 空链表
        // ListNode<Integer> list1 = null;
        // 只有一个节点的链表
        ListNode<Integer> list2 = new ListNode<>(1);
        // 有4个节点，每个节点的值分别是1,2,3,4
        ListNode<Integer> list3 = new ListNode<>(1);
        ListNode<Integer> l = list3;
        for (int i = 2; i < 5; i++) {
            l.next = new ListNode<>(i);
            l = l.next;
        }

        DeleteNode dn = new DeleteNode();
        // list1 == null
        ListNode<Integer> r1 = dn.deleteNode(null, null);
        Assert.assertEquals(null, r1);
        // delete null
        ListNode<Integer> r2 = dn.deleteNode(list2, null);
        Assert.assertEquals(list2, r2);
        // list2.next == null
        ListNode<Integer> r3 = dn.deleteNode(list2, list2);
        Assert.assertEquals(null, r3);

        // delete the last node
        ListNode<Integer> r4 = dn.deleteNode(list3, list3.next.next.next);
        while (r4 != null) {
            System.out.print(r4.val + " ");
            r4 = r4.next;
        }
        System.out.println();
        //delete the first node
        ListNode<Integer> r5 = dn.deleteNode(list3, list3);
        while (r5 != null) {
            System.out.print(r5.val + " ");
            r5 = r5.next;
        }
        System.out.println();
        //delete a middle node
        l = list3;
        list3.val = 1;
        for (int i = 2; i < 5; i++) {
            l.next = new ListNode<>(i);
            l = l.next;
        }
        ListNode<Integer> r6 = dn.deleteNode(list3, list3.next.next);
        while (r6 != null) {
            System.out.print(r6.val + " ");
            r6 = r6.next;
        }
        System.out.println();
    }
}