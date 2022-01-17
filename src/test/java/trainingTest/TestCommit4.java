package trainingTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCommit4 {
    @Test
    public void checkCalc() {
        Assert.assertEquals((7+2), 9);
        Assert.assertEquals((4+2), 6);
    }
}
