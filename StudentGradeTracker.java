
    import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Arrays to store student names and grades
        String[] studentNames = new String[numberOfStudents];
        double[] studentGrades = new double[numberOfStudents];

        // Collecting student information
        for (int i = 0; i < numberOfStudents; i++) {
            scanner.nextLine();  // Consume newline left by nextInt()

            // Get student name
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            // Get student grade
            System.out.print("Enter grade for " + studentNames[i] + ": ");
            studentGrades[i] = scanner.nextDouble();
        }

        // Calculating the average, highest, and lowest grades
        double total = 0;
        double highestGrade = studentGrades[0];
        double lowestGrade = studentGrades[0];

        for (double grade : studentGrades) {
            total += grade;
            if (grade > highestGrade) {
                highestGrade = grade;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }

        double averageGrade = total / numberOfStudents;

        // Displaying results
        System.out.println("\nSummary of Grades:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentNames[i] + ": " + studentGrades[i]);
        }

        System.out.println("\nAverage Grade: " + averageGrade);
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);

        scanner.close();
    }
}

    
