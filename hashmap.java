import java.util.HashMap;

public class StudentGrades {
    public static void main(String[] args) {
        // Create a HashMap to store student IDs and their grades
        HashMap<Integer, String> studentGrades = new HashMap<>();

        // Add students and their grades to the HashMap
        studentGrades.put(101, "A");
        studentGrades.put(102, "B");
        studentGrades.put(103, "A");
        studentGrades.put(104, "C");

        // Retrieve and display a student's grade using their ID
        int studentId = 102;
        String grade = studentGrades.get(studentId);
        System.out.println("Student with ID " + studentId + " has a grade of: " + grade);

        // Display all students and their grades
        System.out.println("All students and their grades:");
        for (Integer id : studentGrades.keySet()) {
            System.out.println("Student ID: " + id + ", Grade: " + studentGrades.get(id));
        }
    }
}
