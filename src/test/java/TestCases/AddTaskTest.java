package TestCases;

import BaseClass.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddTaskPage;
import pages.TaskListPage;

public class AddTaskTest extends BaseClass {
    @Test
    public void testAddNewTask() {
        AddTaskPage addTaskPage = new AddTaskPage((AndroidDriver) driver);
        TaskListPage taskListPage = new TaskListPage((AndroidDriver) driver);

        String taskTitle = "Buy groceries";
        String taskDescription = "Milk, Bread, Eggs";

        // Test steps
        addTaskPage.clickAddTask();
        addTaskPage.enterTitle(taskTitle);
        addTaskPage.enterDescription(taskDescription);
        addTaskPage.clickSave();

        // assertion
        String displayedTitle = taskListPage.getFirstTaskTitle();
        Assert.assertEquals(displayedTitle, taskTitle, "Task title does not match!");
    }

}
