package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class EditTaskPage {
    private AndroidDriver driver;

    public EditTaskPage(AndroidDriver driver) {
        this.driver = driver;
    }
    // Actions
    public void UpdateTitle(String Title) {
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Buy groceries']")).sendKeys(Title);
    }
    public void UpdateDescription(String Desc) {
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Milk, Bread, Eggs']")).sendKeys(Desc);
    }
    public void Save() {
        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='Save task']")).click();
    }
}
