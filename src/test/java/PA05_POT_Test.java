import com.spoj.pl.PA05_POT.Main;
import org.junit.Assert;
import org.junit.Test;

public class PA05_POT_Test {
    @Test
    public void lastDigitOfPower2_3Test() {
        int lastDigit = Main.lastDigitOfPower(2, 3);
        Assert.assertEquals(8, lastDigit);
    }
    @Test
    public void lastDigitOfPower3_3Test() {
        int lastDigit = Main.lastDigitOfPower(3, 3);
        Assert.assertEquals(7, lastDigit);
    }
}
