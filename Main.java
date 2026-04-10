import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Studentmanager manager = new Studentmanager();
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("     STUDENT RECORD MANAGEMENT SYSTEM     ");
        System.out.println("==========================================");
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": manager.addStudent(); break;
                case "2": manager.viewStudents(); break;
                case "3": manager.updateStudent(); break;
                case "4": manager.deleteStudent(); break;
                case "5":
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
}
        }
    }
}
  