import com.fuge.PrintMatrix;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-7-13.
 */
public class PrintMatrixTest {
    @Test
    public void printMatrixClockWizely() throws Exception {
        PrintMatrix pm = new PrintMatrix();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix2 = {{1}};
        int[][] matrix3 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix4 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        pm.printMatrixClockWizely(matrix);
        pm.printMatrixClockWizely(matrix2);
        pm.printMatrixClockWizely(matrix3);
        pm.printMatrixClockWizely(matrix4);
    }

}