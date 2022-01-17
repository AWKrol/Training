package trainingTest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCommit4 {

    @Test
    public void checkCalc() {
        Assert.assertEquals((4 + 2), 6);
        Assert.assertEquals((8 + 2), 10);
        Assert.assertEquals((6 + 2), 8);
    }
}
