import com.spoj.pl.BFN1.Main;
import org.junit.Assert;
import org.junit.Test;

public class BFN1_Test {
    @Test
    public void reverseNumber19992Test() {
        int reverseNumber = Main.reverseNumber(19992);
        Assert.assertEquals(29991, reverseNumber);
    }

    @Test
    public void isPalindrom22188Test(){
        boolean isPalindrom = Main.isPalindrom(22188);
        Assert.assertFalse(isPalindrom);
    }

    @Test
    public void isPalindrom32123Test(){
        boolean isPalindrom = Main.isPalindrom(32123);
        Assert.assertTrue(isPalindrom);
    }

    @Test
    public void peter28Test(){
        String peter = Main.peter(28);
        Assert.assertEquals("121 2", peter);
    }

    @Test
    public void peter68Test(){
        String peter = Main.peter(68);
        Assert.assertEquals("1111 3", peter);
    }

    @Test
    public void peter5Test(){
        String peter = Main.peter(5);
        Assert.assertEquals("5 0", peter);
    }
}
