import com.fuge.Print1ToMaxOfNDigits;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-7-13.
 */
public class Print1ToMaxOfNDigitsTest {
    @Test(expected = Exception.class)
    public void print1ToMaxOfNDigits() throws Exception {
        Print1ToMaxOfNDigits p = new Print1ToMaxOfNDigits();
        p.print1ToMaxOfNDigits(5);
    }

}