package MVCPattern;

class StudentView {
    public void printStudentDetails(String studentId, String studentName, String studentGrade) {
        System.out.println("Student: ");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Grade: " + studentGrade);
    }
}
