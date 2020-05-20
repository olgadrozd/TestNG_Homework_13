package testng;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultTests extends BaseCalcTest {

    @DataProvider(name = "Данные для умножения")
    public Object[][] dataForMult() {
        return new Object[][] {
                {0, 7, 0},
                {5, 3, 15},
                {10, 4, 40},
        };
    }
    @Test(dataProvider = "Данные для умножения")
    public void DataProviderMult (int a, int b, int c) {
        int newDataProviderMult = new Calculator().mult(a, b);
        Assert.assertEquals(newDataProviderMult, c);
    }
}
