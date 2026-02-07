package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class AddTaskPage {
    private AndroidDriver driver;

    public AddTaskPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickAddTask() {
        driver.findElement(AppiumBy.accessibilityId("New Task")).click();
    }

    public void enterTitle(String title) {
        driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[1]")).sendKeys(title);

    }

    public void enterDescription(String description) {
        driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]")).sendKeys(description);

    }

    public void clickSave() {
        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Save task\"]")).click();

    }

}
