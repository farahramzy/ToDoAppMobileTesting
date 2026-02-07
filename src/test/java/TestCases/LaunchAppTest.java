package TestCases;

import BaseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchAppTest extends BaseClass {
    @Test
    public void appShouldLaunchSuccessfully() {
        Assert.assertNotNull(driver, "Driver is null, app did not launch");
    }
}
