public class MVCTest {

    public static void main(String[] args) {

        // Model
        Student student = new Student("Ezhil", 101, "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller =
                new StudentController(student, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        System.out.println();

        // Update Model through Controller
        controller.setStudentName("Arun");
        controller.setStudentGrade("A+");

        System.out.println("Updated Student Details:");
        controller.updateView();
    }
}