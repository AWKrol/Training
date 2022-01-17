package trainingTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCommit2 extends CaclTest{

    @Test
    public void checkCalc() {
        Assert.assertEquals((4+2), 6);
    }
}
