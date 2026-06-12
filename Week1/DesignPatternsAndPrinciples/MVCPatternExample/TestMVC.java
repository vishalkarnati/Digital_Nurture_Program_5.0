package Week1.DesignPatternsAndPrinciples.MVCPatternExample;

public class TestMVC {

    public static void main(String[] args) {

        Student student = new Student("Alic", 1, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();
        System.out.println();

        controller.setStudentName("Alice");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
