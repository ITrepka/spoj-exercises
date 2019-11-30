import com.spoj.pl.RNO_DOD.Main;
import org.junit.Assert;
import org.junit.Test;

public class RNO_DOD_Test {
    @Test
    public void sum3_2Test(){
        int sum = Main.sum(3, 2);
        Assert.assertEquals(5, sum);
    }
}
