import java.util.LinkedList;

public class TaskLinkedList {
    private LinkedList<Task> taskList;

    public TaskLinkedList() {
        taskList = new LinkedList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public Task searchTask(int taskId) {
        for (Task task : taskList) {
            if (task.taskId == taskId) {
                return task;
            }
        }
        return null; 
    }

    public void traverseTasks() {
        for (Task task : taskList) {
            System.out.println("Task ID: " + task.taskId +
                    ", Name: " + task.taskName +
                    ", Status: " + task.status);
        }
    }

    public void deleteTask(int taskId) {
        taskList.removeIf(task -> task.taskId == taskId);
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Task A", false));
        taskList.addTask(new Task(2, "Task B", true));

        Task foundTask = taskList.searchTask(2);
        if (foundTask != null) {
            System.out.println("Found task: " + foundTask.taskName);
        } else {
            System.out.println("Task not found.");
        }

        taskList.traverseTasks();

        taskList.deleteTask(1);
        taskList.traverseTasks();
    }
}