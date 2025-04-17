public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20, "S101");
        s1.displayInfo(true);

        GraduateStudent g1 = new GraduateStudent("Sneha", 24, "G201", "AI in Education");
        g1.displayInfo();

        Course c1 = new Course("Mathematics", 85);
        c1.showCourseInfo();

        System.out.println("Current Student Count: " + Student.getStudentCount());
    }
}
