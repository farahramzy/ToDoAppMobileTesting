package TestCases;

import BaseClass.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddTaskPage;
import pages.TaskDetailsPage;
import pages.TaskListPage;

public class CompletedTaskTest extends BaseClass {
    @Test
    public void testtaskcompeleted() {
        AddTaskPage addTaskPage = new AddTaskPage((AndroidDriver) driver);
        TaskListPage taskListPage = new TaskListPage((AndroidDriver) driver);
        TaskDetailsPage taskDetailsPage = new TaskDetailsPage((AndroidDriver) driver);
        String taskTitle = "Buy groceries";
        String taskDescription = "Milk, Bread, Eggs";


        // Test steps
        addTaskPage.clickAddTask();
        addTaskPage.enterTitle(taskTitle);
        addTaskPage.enterDescription(taskDescription);
        addTaskPage.clickSave();
        // Test steps
        Assert.assertTrue(taskListPage.isTaskPresent(), "Task was not added successfully");
      taskListPage.clickoncheckbox();
        Assert.assertTrue(taskListPage.isTaskCompleted(), "Task was not marked as completed");


    }
}
