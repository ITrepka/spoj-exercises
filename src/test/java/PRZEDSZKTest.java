import com.spoj.pl.PRZEDSZK.Main;
import org.junit.Assert;
import org.junit.Test;

public class PRZEDSZKTest {
    @Test
    public void helpNursery12_15Test() {
        int result = Main.helpNursery(12, 15);
        Assert.assertEquals(60, result);
    }

    @Test
    public void helpNursery11_22Test() {
        int result = Main.helpNursery(11, 22);
        Assert.assertEquals(22, result);
    }
}
