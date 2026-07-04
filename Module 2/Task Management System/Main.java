public class Main {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(101, "Design UI", "Pending"));
        taskList.addTask(new Task(102, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(103, "Testing", "Pending"));

        taskList.displayTasks();

        System.out.println("\nSearching Task...\n");

        Task task = taskList.searchTask(102);

        if (task != null)
            System.out.println(task);
        else
            System.out.println("Task Not Found.");

        System.out.println("\nDeleting Task...\n");

        taskList.deleteTask(101);

        taskList.displayTasks();
    }
}