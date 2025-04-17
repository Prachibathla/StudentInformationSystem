public class Student extends Person {
    protected String studentId;
    protected static int studentCount = 0;

    public Student() {
        super();
        this.studentId = "N/A";
        studentCount++;
    }

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
        studentCount++;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }

    public void displayInfo(boolean showCount) {
        displayInfo();
        if (showCount) {
            System.out.println("Total Students: " + studentCount);
        }
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
