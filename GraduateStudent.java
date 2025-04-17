public class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(String name, int age, String studentId, String thesisTopic) {
        super(name, age, studentId);
        this.thesisTopic = thesisTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}
