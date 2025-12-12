import java.util.HashMap;
import java.util.Scanner;

public class Exam {

    private Scanner sc = new Scanner(System.in);
    private HashMap<String, String> userData = new HashMap<>();
    private boolean isLoggedIn = false;
    private boolean examSubmitted = false;

    public Exam() {
        userData.put("Tejas", "1234"); // default user
    }

    public void login() {
        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (userData.containsKey(user) && userData.get(user).equals(pass)) {
            System.out.println("Login Successful!");
            isLoggedIn = true;
        } else {
            System.out.println("Invalid Username or Password!");
        }
    }

    public void updateProfile() {
        if (!isLoggedIn) {
            System.out.println("Please Login First!");
            return;
        }

        System.out.print("Enter Current Username: ");
        String oldUser = sc.nextLine();

        System.out.print("Enter Current Password: ");
        String oldPass = sc.nextLine();

        if (userData.containsKey(oldUser) && userData.get(oldUser).equals(oldPass)) {
            System.out.print("Enter New Username: ");
            String newUser = sc.nextLine();

            System.out.print("Enter New Password: ");
            String newPass = sc.nextLine();

            userData.remove(oldUser);
            userData.put(newUser, newPass);

            System.out.println("Profile Updated Successfully!");
        } else {
            System.out.println("Incorrect current details!");
        }
    }

    public void startExam() {
        if (!isLoggedIn) {
            System.out.println("Please Login First!");
            return;
        }

        examSubmitted = false;
        int timeLimit = 20; // seconds

        System.out.println("\n===== Exam Started =====");
        System.out.println("Timer: " + timeLimit + " seconds (Auto Submit Enabled)\n");

        Thread timer = new Thread(() -> {
            try {
                for (int i = timeLimit; i > 0; i--) {
                    Thread.sleep(1000);
                }
                if (!examSubmitted) {
                    System.out.println("\n⏳ Time Over! Auto-submitting exam...");
                    examSubmitted = true;
                }
            } catch (Exception e) {}
        });

        timer.start();

        int score = 0;

        if (!examSubmitted) {
            System.out.println("Q1: Java is _______ ?");
            System.out.println("1. Compiled\n2. Interpreted\n3. Both\n4. None");
            System.out.print("Your Answer: ");
            int ans = sc.nextInt();
            if (ans == 3) score++;
        }

        if (!examSubmitted) {
            System.out.println("\nQ2: Which OOP concept is used for reusability?");
            System.out.println("1. Polymorphism\n2. Inheritance\n3. Abstraction\n4. Encapsulation");
            System.out.print("Your Answer: ");
            int ans = sc.nextInt();
            if (ans == 2) score++;
        }

        if (!examSubmitted) {
            System.out.println("\nQ3: Which keyword is used to inherit?");
            System.out.println("1. extends\n2. implements\n3. import\n4. super");
            System.out.print("Your Answer: ");
            int ans = sc.nextInt();
            if (ans == 1) score++;
        }

        examSubmitted = true;
        System.out.println("\n=== Exam Submitted ===");
        System.out.println("Final Score: " + score + "/3");
    }

    public void logout() {
        if (!isLoggedIn) {
            System.out.println("You are not logged in!");
            return;
        }
        isLoggedIn = false;
        System.out.println("Logout Successful. Session Closed.");
    }
}
