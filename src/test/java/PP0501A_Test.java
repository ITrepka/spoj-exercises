import com.spoj.pl.PP0501A.Main;
import org.junit.Assert;
import org.junit.Test;

public class PP0501A_Test {
    @Test
    public void NWD1_4Test() {
        int nwd = Main.NWD(1, 4);
        Assert.assertEquals(1, nwd);
    }

    @Test
    public void NWD4_1Test() {
        int nwd = Main.NWD(4, 1);
        Assert.assertEquals(1, nwd);
    }

    @Test
    public void NWD12_48Test() {
        int nwd = Main.NWD(12, 48);
        Assert.assertEquals(12, nwd);
    }

    @Test
    public void NWD48_100Test() {
        int nwd = Main.NWD(48, 100);
        Assert.assertEquals(4, nwd);
    }

    @Test
    public void NWD123456_653421Test() {
        int nwd = Main.NWD(123456, 653421);
        Assert.assertEquals(3, nwd);
    }

}
