package trainingTest;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import training.Calc;

import java.util.ArrayList;
import java.util.List;

public class CaclTest {

    private Calc calc = new Calc();

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("@AfterMethod");
    }

    @BeforeGroups(groups = {"unit1"})
    public void beforeGroups() throws Exception {
        System.out.println("BeforeGroups");
    }

    @AfterGroups
    public void afterGroups() throws Exception {
        System.out.println("@AfterGroups");
    }

    @BeforeClass
    public void beforeClass() throws Exception {
        System.out.println("@BeforeClass");
    }

    @BeforeTest
    public void beforeTest() throws Exception {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() throws Exception {
        System.out.println("@AfterTest");
    }

    @AfterClass
    public void afterClass() throws Exception {
        System.out.println("@AfterClass");
    }

    @BeforeSuite
    public void beforeSuite() throws Exception {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        System.out.println("@AfterSuite");
    }

    @Test(groups = {"unit1", "integration"})
    public void testSum() {
        Assert.assertEquals(5, calc.Sum(2,3));
        //System.out.println("@Test");
    }

    @Test(expectedExceptions = NullPointerException.class, groups = {"unit2", "integration"})
    public void Exp() {
        int [] a = null;
        List list =null;
        //list.add(1);
        int size = a.length;
        int size1 = list.size();
    }

    @Test(timeOut = 1000, groups = {"unit1", "unit2"})
    public void timeOutTest() throws InterruptedException{
        //Thread.sleep(1000);
    }

    @Test(groups = {"unit1"})
    public void groups() {
        System.out.println("groups");
    }
}
