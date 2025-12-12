import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Exam exam = new Exam();

        int choice;

        do {
            System.out.println("\n===== ONLINE EXAMINATION SYSTEM =====");
            System.out.println("1. Login");
            System.out.println("2. Update Profile & Password");
            System.out.println("3. Start Exam (Timer + Auto Submit)");
            System.out.println("4. Logout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.next();
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    exam.login();
                    break;

                case 2:
                    exam.updateProfile();
                    break;

                case 3:
                    exam.startExam();
                    break;

                case 4:
                    exam.logout();
                    break;

                case 5:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid Choice! Enter 1–5.");
            }

        } while (choice != 5);

        sc.close();
    }
}
