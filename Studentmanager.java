import java.util.ArrayList;
import java.util.Scanner;
public class Studentmanager {
    private ArrayList<Student> students = new ArrayList<>();
    private int nextId = 1;
    private Scanner sc = new Scanner(System.in);
    // CREATE - Add a new student
    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        double marks = Double.parseDouble(sc.nextLine());
        students.add(new Student(nextId++, name, marks));
        System.out.println("✅ Student added successfully!");
    }
    // READ - View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("+-------+----------------------+--------+");
        System.out.println("|  ID   | Name                 | Marks  |");
        System.out.println("+-------+----------------------+--------+");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("+-------+----------------------+--------+");
    }
    // UPDATE - Update student by ID
    public void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = Integer.parseInt(sc.nextLine());
        Student found = findById(id);
        if (found == null) {
            System.out.println("❌ Student not found.");
            return;
        }
        System.out.print("Enter new name (or press Enter to skip): ");
        String name = sc.nextLine();
        if (!name.isEmpty()) found.setName(name);
        System.out.print("Enter new marks (or -1 to skip): ");
        double marks = Double.parseDouble(sc.nextLine());
        if (marks != -1) found.setMarks(marks);
        System.out.println("✅ Student updated successfully!");
    }
    // DELETE - Remove student by ID
    public void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = Integer.parseInt(sc.nextLine());
        Student found = findById(id);
        if (found == null) {
            System.out.println("❌ Student not found.");
            return;
        }
        students.remove(found);
        System.out.println("✅ Student deleted successfully!");
    }
    // Helper method - find student by ID
    private Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }
}