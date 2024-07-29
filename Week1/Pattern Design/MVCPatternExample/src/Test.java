public class Test {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Nilabja Ghosh");
        controller.setStudentGrade("B");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        return new Student("1", "King Roy", "A");
    }
}
