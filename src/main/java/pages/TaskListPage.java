package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TaskListPage {
    private AndroidDriver driver;
    private WebDriverWait wait;

    public TaskListPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public String getFirstTaskTitle() {

        By firstTaskTitle = AppiumBy.xpath("//android.widget.TextView[@text='Buy groceries']");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(firstTaskTitle))
                .getText();
    }
    public void clickOnTask() {
        By tasktitle = AppiumBy.xpath("//android.widget.TextView[@text='Buy groceries']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(tasktitle))
                .click();
    }
    public String getTaskTitle() {
        By locator = AppiumBy.xpath("//android.widget.TextView[@text='Buy more groceries']");
        return wait.until(ExpectedConditions
                        .visibilityOfElementLocated(locator))
                .getText();
    }
    public boolean isTaskPresent() {
        try {
            By locator = AppiumBy.xpath("//android.widget.TextView[@text='Buy groceries']");
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void clickoncheckbox() {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Buy groceries']/preceding-sibling::android.widget.CheckBox")).click();

    }
    public boolean isTaskCompleted() {
        return driver.findElement(AppiumBy.xpath("//android.widget.CheckBox")).getAttribute("checked").equals("true");
    }
    public void openFilterMenu() {
        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Filter\"]")).click(); // Replace with actual ID
    }

    public void selectFilter() {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Completed\"]")).click();
    }

    public void waitForTaskToAppear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.xpath("//android.widget.TextView[@text='Buy groceries']")
        ));
    }


}
