package testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTests extends BaseCalcTest {


    @Test(description = "Вычитание с учётом приоритета", priority = 2)
    public void sub2() {
        int sub = calculator.sub(1000, 50);
        Assert.assertEquals(sub, 950);
    }

    @Test(description = "Вычитание с учётом приоритета", priority = 1)
    public void sub1() {
        int sub = calculator.sub(10, 3);
        Assert.assertEquals(sub, 7);
    }

    @Test(description = "Вычитание с учётом приоритета", priority = 3)
    public void sub3() {
        int sub = calculator.sub(576, 1);
        Assert.assertEquals(sub, 575);
    }

    @Test(description = "Вычитание с учётом приоритета", priority = 5)
    public void sub5() {
        int sub = calculator.sub(1, 1);
        Assert.assertEquals(sub, 0);
    }

    @Test(description = "Вычитание с учётом приоритета", priority = 4)
    public void sub4() {
        int sub = calculator.sub(0, 1);
        Assert.assertEquals(sub, -1);
    }

    @Test(description = "Вычитание с учётом приоритета", priority = 6)
    public void sub6() {
        int sub = calculator.sub(-2, -8);
        Assert.assertEquals(sub, 6);
    }
}





