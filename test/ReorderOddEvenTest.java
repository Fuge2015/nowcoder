import com.fuge.ReorderOddEven;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-7-14.
 */
public class ReorderOddEvenTest {
    @Test
    public void reorder() throws Exception {
        int[] array = {1,2,3,4,5};
        ReorderOddEven reorderOddEven = new ReorderOddEven();
        reorderOddEven.reorder(array);
        for (int i =  0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}