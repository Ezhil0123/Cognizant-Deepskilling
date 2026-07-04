public class TaskLinkedList {

    private Task head;

    // Add Task
    public void addTask(Task task) {

        if (head == null) {
            head = task;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = task;
        }

        System.out.println("Task Added Successfully.");
    }

    // Search Task
    public Task searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.getTaskId() == id) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    // Display Tasks
    public void displayTasks() {

        if (head == null) {
            System.out.println("Task List is Empty.");
            return;
        }

        Task temp = head;

        System.out.println("\nTask List\n");

        while (temp != null) {

            System.out.println(temp);
            System.out.println("----------------------");

            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            System.out.println("Task List is Empty.");
            return;
        }

        if (head.getTaskId() == id) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }

        Task prev = head;
        Task curr = head.next;

        while (curr != null) {

            if (curr.getTaskId() == id) {

                prev.next = curr.next;
                System.out.println("Task Deleted Successfully.");
                return;
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println("Task Not Found.");
    }
}