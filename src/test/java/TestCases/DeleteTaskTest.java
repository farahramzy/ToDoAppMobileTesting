package TestCases;

import BaseClass.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddTaskPage;
import pages.EditTaskPage;
import pages.TaskDetailsPage;
import pages.TaskListPage;

public class DeleteTaskTest extends BaseClass {
    @Test
    public void testDeleteNewTask() {
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
        taskListPage.clickOnTask();
        taskDetailsPage.DeleteFirstTask();
        taskDetailsPage.confirmDeletion();

        Assert.assertFalse(taskListPage.isTaskPresent(), "Task was not deleted successfully");


    }
}
