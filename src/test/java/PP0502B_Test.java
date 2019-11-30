import com.spoj.pl.DoingExercise;
import com.spoj.pl.PP0502B.Main;
import com.spoj.pl.Stopper;
import org.junit.Assert;
import org.junit.Test;

public class PP0502B_Test {
    @Test
    public void reverseArray1234567Test() {
        String reverseArray = Main.reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertEquals("7 6 5 4 3 2 1", reverseArray);
    }

    @Test
    public void reverseArray3_2_11Test() {
        String reverseArray = Main.reverseArray(new int[]{3, 2, 11});
        Assert.assertEquals("11 2 3", reverseArray);
    }

    @Test
    public void reverseArrayTimeTest() {
        DoingExercise doingExercise = () -> Main.reverseArray(new int[100]);
        double v = Stopper.measureTimeSeconds(doingExercise);
        Assert.assertTrue(1 > v);
    }
}
