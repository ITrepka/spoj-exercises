import com.spoj.pl.DoingExercise;
import com.spoj.pl.PP0504B.Main;
import com.spoj.pl.Stopper;
import org.junit.Assert;
import org.junit.Test;

public class PP0504B_Test {
    @Test
    public void mergeStringa_bbTest () {
        String mergeString = Main.mergeString("a", "bb");
        Assert.assertEquals("ab", mergeString);
    }

    @Test
    public void mergeStringabs_sfdTest () {
        String mergeString = Main.mergeString("abs", "sfd");
        Assert.assertEquals("asbfsd", mergeString);
    }

    @Test
    public void mergeStringewr_wTest () {
        String mergeString = Main.mergeString("ewr", "w");
        Assert.assertEquals("ew", mergeString);
    }

    @Test
    public void mergeStringwqeqweqweq_eqweqweTest () {
        String mergeString = Main.mergeString("wqeqweqweq", "eqweqwe");
        Assert.assertEquals("weqqewqewqewqe", mergeString);
    }

    @Test
    public void mergeStringTimeTest() {
        DoingExercise doingExercise = () -> Main.mergeString("weqqewqewqewqe","weqqewqewqewqe");
        double v = Stopper.measureTimeSeconds(doingExercise);
        Assert.assertTrue(1 > v);
    }
}
