import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects:");
        int numOfSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();

            // Validate marks (assuming marks are out of 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100. Please try again.");
                i--; // Repeat the current iteration
                continue;
            }

            totalMarks += marks;
        }

        double averageMarks = (double) totalMarks / numOfSubjects;

        System.out.println("\nResults:" + "\n" +"Total Marks: " + totalMarks +"\n" +"Average Percentage: " + averageMarks );
        // System.out.println("Total Marks: " + totalMarks);
        // System.out.println("Average Percentage: " + averageMarks);

        // Grade Calculation
        String grade = calculateGrade(averageMarks);
        System.out.println("Grade: " + grade);

        

    }

    private static String calculateGrade(double averageMarks) {
        if (averageMarks >= 75) {
            return "A";
        } else if (averageMarks >= 65) {
            return "B";
        } else if (averageMarks >= 55) {
            return "C";
        } else if (averageMarks >= 35) {
            return "D";
        } else {
            return "F";
        }
    }
}
