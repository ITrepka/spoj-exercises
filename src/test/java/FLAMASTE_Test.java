import com.spoj.pl.FLAMASTE.Main;
import org.junit.Assert;
import org.junit.Test;

public class FLAMASTE_Test {
    @Test
    public void flamasterOPSSTest() {
        String opss = Main.flamaster("OPSS");
        Assert.assertEquals("OPSS", opss);
    }

    @Test
    public void flamasterABCDEFTest() {
        String flam = Main.flamaster("ABCDEF");
        Assert.assertEquals("ABCDEF", flam);
    }

    @Test
    public void flamasterABBCCCDDDDEEEEEFGGHIIJKKKLTest() {
        String flam = Main.flamaster("ABBCCCDDDDEEEEEFGGHIIJKKKL");
        Assert.assertEquals("ABBC3D4E5FGGHIIJK3L", flam);
    }

    @Test
    public void flamasterAAAAAAAAAABBBBBBBBBBBBBBBBTest() {
        String flam = Main.flamaster("AAAAAAAAAABBBBBBBBBBBBBBBB");
        Assert.assertEquals("A10B16", flam);
    }
}
