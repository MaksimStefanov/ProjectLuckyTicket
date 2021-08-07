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
    //int[] massive5 = { , , , , , }; - comp. error
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
    public void verifyNegativeScenario1() {
        String actualResult = Lucky.ticket(massive4);
        String expectedResult = "Try one more time";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void verifyNegativeScenario2() {
        String actualResult = Lucky.ticket(massive6);
        String expectedResult = "Try one more time";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void verifyPositiveScenario2() {
        String actualResult = Lucky.ticket(massive7);
        String expectedResult = "You are lucky";
        Assert.assertEquals(actualResult, expectedResult);
    }


}
