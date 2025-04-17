import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGUI {
    private static int count = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Information System");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(8, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JLabel idLabel = new JLabel("Student ID:");
        JTextField idField = new JTextField();

        JLabel thesisLabel = new JLabel("Thesis (if any):");
        JTextField thesisField = new JTextField();

        JButton submitButton = new JButton("Add Student");
        JButton countButton = new JButton("Show Total Students");

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);

        // Add components to frame
        frame.add(nameLabel); frame.add(nameField);
        frame.add(ageLabel); frame.add(ageField);
        frame.add(idLabel); frame.add(idField);
        frame.add(thesisLabel); frame.add(thesisField);
        frame.add(submitButton); frame.add(countButton);
        frame.add(new JLabel("")); frame.add(outputArea);

        // Event for Submit button
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String id = idField.getText();
            String thesis = thesisField.getText();

            count++;

            String details = "Name: " + name + "\nAge: " + age + "\nID: " + id;
            if (!thesis.isEmpty()) {
                details += "\nThesis: " + thesis;
            }
            outputArea.setText(details);
        });

        // Event for Count button
        countButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Total Students: " + count);
        });

        frame.setVisible(true);
    }
}
