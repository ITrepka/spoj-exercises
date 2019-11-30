import com.spoj.pl.PRIME_T.Main;
import org.junit.Assert;
import org.junit.Test;

public class Prime_TTest {
    @Test
    public void is11PrimeTest(){
        boolean isPrime = Main.isPrime(11);
        Assert.assertTrue(isPrime);
    }

    @Test
    public void is1PrimeTest(){
        boolean isPrime = Main.isPrime(1);
        Assert.assertFalse(isPrime);
    }

    @Test
    public void is4PrimeTest(){
        boolean isPrime = Main.isPrime(4);
        Assert.assertFalse(isPrime);
    }

}
