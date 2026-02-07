package TestCases;

import BaseClass.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddTaskPage;
import pages.TaskDetailsPage;
import pages.TaskListPage;

import java.util.List;

public class CompletedFilterTest extends BaseClass {
    @Test
    public void testtaskcompeleted() {
        AddTaskPage addTaskPage = new AddTaskPage((AndroidDriver) driver);
        TaskListPage taskListPage = new TaskListPage((AndroidDriver) driver);
        String taskTitle = "Buy groceries";
        String taskDescription = "Milk, Bread, Eggs";

        String taskTitle2 = "Buy Stationary";
        String taskDescription2 = "Notebook, pens, paint";


        // Test steps
        addTaskPage.clickAddTask();
        addTaskPage.enterTitle(taskTitle);
        addTaskPage.enterDescription(taskDescription);
        addTaskPage.clickSave();
        taskListPage.waitForTaskToAppear();
        addTaskPage.clickAddTask();
        addTaskPage.enterTitle(taskTitle2);
        addTaskPage.enterDescription(taskDescription2);
        addTaskPage.clickSave();
        taskListPage.waitForTaskToAppear();

        // Test steps
        taskListPage.clickoncheckbox();
        taskListPage.openFilterMenu();
        taskListPage.selectFilter();

        Assert.assertTrue(taskListPage.isTaskCompleted(), "Task was not marked as completed");


    }
}
