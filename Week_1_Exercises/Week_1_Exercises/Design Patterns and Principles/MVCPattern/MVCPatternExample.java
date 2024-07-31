package MVCPattern;

public class MVCPatternExample {
    public static void main(String[] args) {
        Student student = new Student("12", "America", "Abi");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();
        controller.setStudentName("Americaa");
        controller.setStudentGrade("Shek");
        controller.updateView();
    }
}