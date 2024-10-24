import java.util.HashMap;

public class StudentGrades {
    public static void main(String[] args) {
        HashMap<Integer, String> studentGrades = new HashMap<>();

        studentGrades.put(1, "A");
        studentGrades.put(2, "B");
        studentGrades.put(3, "A");
        studentGrades.put(4, "C");

        int studentId = 2;
        String grade = studentGrades.get(studentId);
        System.out.println("Student with ID " + studentId + " has a grade of: " + grade);

        System.out.println("All students and their grades:");
        for (Integer id : studentGrades.keySet()) {
            System.out.println("Student ID: " + id + ", Grade: " + studentGrades.get(id));
        }
    }
}
