import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter attendance:");
        int attendance = scanner.nextInt();

        System.out.println("Did you complete the assignment or have a medical certificate? (true/false)");
        boolean medicalOrAssignment = scanner.nextBoolean();

        System.out.println("Are you blacklisted? (true/false)");
        boolean blacklisted = scanner.nextBoolean();

        if (attendance >= 75 && medicalOrAssignment && !blacklisted) {
            System.out.println("You are allowed to Exam");
        } else {
            System.out.println("You are not allowed to Exam");
        }

        scanner.close();
    }
              }
