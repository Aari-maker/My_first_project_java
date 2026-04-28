import java.util.Scanner;

public class StemProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age of the student:");
        int age = scanner.nextInt();

        System.out.println("Enter the GPA of the student:");
        double GPA = scanner.nextDouble();

        System.out.println("How many STEM projects they completed:");
        int projects = scanner.nextInt();

        // Check all conditions
        boolean ageOK = (age >= 14 && age <= 18);
        boolean gpaOK = (GPA >= 3.5);
        boolean projectsOK = (projects >= 2);

        if (ageOK && gpaOK && projectsOK) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        scanner.close();
    }
                         }
