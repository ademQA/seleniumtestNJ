package tests.day13_testNGFramework;

import org.testng.annotations.*;

public class P05 {

    @BeforeSuite
    public void setupSuite() {
        System.out.println("Before Suit calisti");
    }

    @AfterSuite
    public void teardownSuite() {
        System.out.println("After Suit calisti");
    }

    @BeforeTest
    public void setupTest() {
        System.out.println("Before Test calisti");
    }

    @AfterTest
    public void teardownTest() {
        System.out.println("After Test calisti");
    }

    @BeforeClass
    public void setupClass() {
        System.out.println("Before Class calisti");
    }

    @AfterClass
    public void teardownClass() {
        System.out.println("After Class calisti");
    }

    @BeforeMethod
    public void setupMethod() {
        System.out.println("Before Method calisti");
    }

    @AfterMethod
    public void teardownMethod() {
        System.out.println("After Method calisti");
    }
@BeforeGroups
public void groputest01(){
    System.out.println("group test calistı");
}

    @Test
    public void test01() {
        System.out.println("Test01 calisti");
    }

    @Test
    public void test02() {
        System.out.println("Test02 calisti");
    }
}