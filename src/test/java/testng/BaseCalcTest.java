package testng;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
class BaseCalcTest  {

    Calculator calculator;

    @BeforeMethod
    public  void beforeMethod() {
        System.out.println("Запуск калькулятора");
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("Закрытие калькулятора");
    }

}