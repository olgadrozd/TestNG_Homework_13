package testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivTests extends BaseCalcTest {

    @Test(description = "Деление с invocationCount", invocationCount = 2)
    public void divWithInvocationCount () {
        int div = calculator.div(30,6);
        Assert.assertEquals(div,5);
    }

    @Test(description = "Деление с threadPoolSize", threadPoolSize = 3)
    public void divWithThreadPoolSize() {

        int div = calculator.div(10,2);
        Assert.assertEquals(div,5);
    }
}
