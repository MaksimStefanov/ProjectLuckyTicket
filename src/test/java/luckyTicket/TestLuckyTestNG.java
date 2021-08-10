package luckyTicket;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestLuckyTestNG {

    int[] massive1 = {1, 2, 3, 3, 2, 1};
    int[] massive2 = {1, 2, 1, 3, 2, 1};
    int[] massive9 = {0, 0, 0, 0, 0, 0};
    int[] massive4 = {-1, 1, 3, 5, 6};
    int[] massive6 = {22, 44, 66, 55, 77, 11};
    int[] massive7 = {9, 9, 9, 9, 9, 9};
    int[] massive8 = {-1, -1, -1, -1, -1, -1};
    int[] massive3 = {10, 10, 10, 10, 10, 10};
    int[] massive10 = new int[6];
    //int[] massive5 = {0.1,0.1,0.1,0.1,0.1,0.1}; - comp. error
    //int[] massive3 = {a,s,1,4,k,k}; - comp. error

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before All Tests");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After All Tests");
    }

    @BeforeMethod
    public void beforeEachTest() {
        System.out.println("This text before each test");
    }

    @AfterMethod
    public void afterEachTest() {
        System.out.println("This text after each test");
    }

    @Test
    public void verifyPositiveScenario() {
        String actualResult = Lucky.ticket(massive1);
        String expectedResult = "You are lucky";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void verifyNegativeScenario() {
        String actualResult = Lucky.ticket(massive2);
        String expectedResult = "Try one more time";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void verifyPositiveScenario1() {
        String actualResult = Lucky.ticket(massive9);
        String expectedResult = "You are lucky";
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void verifyPositiveScenario2() {
        String actualResult = Lucky.ticket(massive7);
        String expectedResult = "You are lucky";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "functionality")
    public Object[][] data() {
        return new Object[][]{{this.massive8, "Try one more time" },
                {this.massive4, "Try one more time" },
                {this.massive6, "Try one more time" },
/*
                {this.massive10, "Try one more time" }, - этот кейс работает не правильно, пробовал через try-catch словить эти нули, но не получилось т.к int[] сразу переводит в нули пустые значения
*/
                {this.massive3, "Try one more time" }};
    }

    @Test(dataProvider = "functionality")
    public void verifyNegativeScenario3(int[] initiativeMassive, String expectedResultFromData) {
        String actualResult = Lucky.ticket(initiativeMassive);
        String expectedResult = expectedResultFromData;
        Assert.assertEquals(actualResult, expectedResult);
    }


}
