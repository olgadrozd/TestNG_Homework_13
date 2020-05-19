package testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTests extends BaseCalcTest {


    @Test(retryAnalyzer = RetryAnalizer.class)
    public void sum() {
        int newSum = new Calculator().sum(2, 5);
        Assert.assertEquals(newSum, 7);
    }
}