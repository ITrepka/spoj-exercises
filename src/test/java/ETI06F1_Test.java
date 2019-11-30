import com.spoj.pl.DoingExercise;
import com.spoj.pl.ETI06F1.Main;
import com.spoj.pl.Stopper;
import org.junit.Assert;
import org.junit.Test;

public class ETI06F1_Test {
    @Test
    public void calculateCircleField10_10Test() {
        double circleField = Main.calculateCircleField(10, 10);
        Assert.assertEquals(235.62, circleField, 0.01);
    }

    @Test
    public void calculateCircleField1000_1500Test() {
        double circleField = Main.calculateCircleField(1000, 1500);
        Assert.assertEquals(1374446.79, circleField, 0.01);
    }

    @Test
    public void calculateCircleFieldTimeTest() {
        DoingExercise doingExercise = () -> Main.calculateCircleField(999,1000);
        double v = Stopper.measureTimeSeconds(doingExercise);
        Assert.assertTrue(1 > v);
    }
}
