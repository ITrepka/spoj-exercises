import com.spoj.pl.DoingExercise;
import com.spoj.pl.PTCLTZ.Main;
import static org.junit.Assert.*;

import com.spoj.pl.Stopper;
import org.junit.Test;

public class PTCLTZ_Test {
    @Test
    public void calculate5Test() {
        int result = Main.calculate(1, 0);
        assertEquals(0, result);
    }

    @Test
    public void calculate2Test() {
        int result = Main.calculate(2, 0);
        assertEquals(1, result);
    }

    @Test
    public void calculate8Test() {
        int result = Main.calculate(8, 0);
        assertEquals(3, result);
    }

    @Test
    public void calculate3Test() {
        int result = Main.calculate(3, 0);
        assertEquals(7, result);
    }

    @Test
    public void calculate567Test() {
        int result = Main.calculate(567, 0);
        assertEquals(61, result);
    }

    @Test
    public void calculateTimeTest() {
        DoingExercise doingExercise = () -> Main.calculate(10000, 0);
        double v = Stopper.measureTimeSeconds(doingExercise);
        assertTrue(1 > v);
    }
}
