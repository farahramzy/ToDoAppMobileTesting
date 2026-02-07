package TestCases;

import BaseClass.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddTaskPage;
import pages.EditTaskPage;
import pages.TaskDetailsPage;
import pages.TaskListPage;

public class EditTaskTest extends BaseClass {
    @Test
    public void testEditNewTask() {
        AddTaskPage addTaskPage = new AddTaskPage((AndroidDriver) driver);
        TaskListPage taskListPage = new TaskListPage((AndroidDriver) driver);
        TaskDetailsPage taskDetailsPage = new TaskDetailsPage((AndroidDriver) driver);
        EditTaskPage editTaskPage = new EditTaskPage((AndroidDriver) driver);
        String taskTitle = "Buy groceries";
        String taskDescription = "Milk, Bread, Eggs";
        String updatedtaskTitle = "Buy more groceries";
        String updatedtaskDescription = "Milk, Bread, Eggs, flour";
        String newTaskTitle = "Buy more groceries";

        // Test steps
        addTaskPage.clickAddTask();
        addTaskPage.enterTitle(taskTitle);
        addTaskPage.enterDescription(taskDescription);
        addTaskPage.clickSave();
        // Test steps
        taskListPage.clickOnTask();
        taskDetailsPage.clickEditTask();
        editTaskPage.UpdateTitle(updatedtaskTitle);
        editTaskPage.UpdateDescription(updatedtaskDescription);
        editTaskPage.Save();

        // assertion
        String displayedTitle = taskListPage.getTaskTitle();
        Assert.assertEquals(displayedTitle, newTaskTitle, "Task title was not updated");
    }
}
