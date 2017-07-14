import com.fuge.MinNumberInRotateArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-7-11.
 */
public class MinNumberInRotateArrayTest {
    int[] array1 = {3,1,2,2,2,2};
    int[] array2 = {1,2,3,4,5};
    int[] array3 = {1,1,1,1};
    int[] array4 = {};

    @Test(expected = NoSuchElementException.class)
    public void minNumberInRotateArray() throws Exception {
        MinNumberInRotateArray minNumberInRotateArray= new MinNumberInRotateArray();
        int result = minNumberInRotateArray.minNumberInRotateArray2(array1);
        Assert.assertEquals(1, result);
        result = minNumberInRotateArray.minNumberInRotateArray2(array2);
        Assert.assertEquals(1, result);
        result = minNumberInRotateArray.minNumberInRotateArray2(array3);
        Assert.assertEquals(1, result);
        result = minNumberInRotateArray.minNumberInRotateArray2(array4);
    }

    @Test(expected = NoSuchElementException.class)
    public void minNumberInRotateArray2() throws Exception {
        MinNumberInRotateArray minNumberInRotateArray= new MinNumberInRotateArray();
        int result = minNumberInRotateArray.minNumberInRotateArray2(array1);
        Assert.assertEquals(1, result);
        result = minNumberInRotateArray.minNumberInRotateArray2(array2);
        Assert.assertEquals(1, result);
        result = minNumberInRotateArray.minNumberInRotateArray2(array3);
        Assert.assertEquals(1, result);
        result = minNumberInRotateArray.minNumberInRotateArray2(array4);
    }

}