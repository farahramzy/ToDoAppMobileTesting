package pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class TaskDetailsPage {
    private AndroidDriver driver;

    public TaskDetailsPage(AndroidDriver driver) {
        this.driver = driver;
    }
    // Actions
    public void clickEditTask() {
        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Edit Task\"]")).click();
    }

public void DeleteFirstTask() {
    driver.findElement(
            AppiumBy.xpath("//android.view.View[@content-desc='Delete task']")).click();
}

    public void confirmDeletion() {
        try {
            WebElement confirmButton = driver.findElement(
                    AppiumBy.xpath("//android.widget.Button[@text='Confirm']"));
            confirmButton.click();
        } catch (Exception e) {

        }
    }

}
