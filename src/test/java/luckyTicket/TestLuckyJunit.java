package luckyTicket;

import org.junit.jupiter.api.*;
import org.testng.Assert;


public class TestLuckyJunit {
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


    @BeforeAll
    public static void initialize() {
        System.out.println("Before All Tests");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After All Tests");
    }

    @BeforeEach
    public void runBeforeEachTest() {
        System.out.println("This text before each test");
    }

    @AfterEach
    public void runAfterEachTest() {
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

    @Test
    public void verifyNegativeScenario1() {
        String actualResult = Lucky.ticket(massive8);
        String expectedResult = "Try one more time";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void verifyNegativeScenario2() {
        String actualResult = Lucky.ticket(massive4);
        String expectedResult = "Try one more time";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void verifyNegativeScenario3() {
        String actualResult = Lucky.ticket(massive6);
        String expectedResult = "Try one more time";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void verifyNegativeScenario4() {
        String actualResult = Lucky.ticket(massive3);
        String expectedResult = "Try one more time";
        Assert.assertEquals(actualResult, expectedResult);

    }


}
