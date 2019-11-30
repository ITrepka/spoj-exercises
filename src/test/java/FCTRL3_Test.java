import com.spoj.pl.FCTRL3.Main;
import org.junit.Assert;
import org.junit.Test;

public class FCTRL3_Test {
    @Test
    public void findTensAndUnitiesTest1() {
        String tensAndUnities = Main.findTensAndUnities(1);
        Assert.assertEquals("0 1", tensAndUnities);
    }

    @Test
    public void findTensAndUnitiesTest2() {
        String tensAndUnities = Main.findTensAndUnities(4);
        Assert.assertEquals("2 4", tensAndUnities);
    }
}
