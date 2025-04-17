public class Course implements Grading {
    private String courseName;
    private int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    @Override
    public char calculateGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    public void showCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade(marks));
    }
}
