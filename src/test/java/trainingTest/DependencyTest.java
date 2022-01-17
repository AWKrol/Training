package trainingTest;

import org.testng.annotations.Test;

public class DependencyTest {

    @Test(dependsOnMethods = {"initTest"})
    public void dependsTest() {
        System.out.println("dependsTest() отработал");
    }

    @Test
    public void initTest() {
        System.out.println("initTest() отработал");
    }




}
