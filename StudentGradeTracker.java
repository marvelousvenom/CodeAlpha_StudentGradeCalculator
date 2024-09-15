import java.util.Scanner;

public class StudentGradeTracker {

    // Method to convert letter grades to numeric values
    public static int convertGrade(String grade) {
        switch (grade.toUpperCase()) {
            case "A":
                return 90;
            case "B":
                return 80;
            case "C":
                return 70;
            case "D":
                return 60;
            case "F":
                return 50;
            default:
                return 0;
        }
    }

    // Method to calculate the average grade
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Method to find the highest grade
    public static int findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static int findLowestGrade(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Array to store numeric grades
        int[] grades = new int[numStudents];

        // Get letter grades from the user and convert them to numeric values
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + " (A, B, C, D, F): ");
            String letterGrade = scanner.next();
            grades[i] = convertGrade(letterGrade);
        }

        // Calculate average, highest, and lowest grades
        double average = calculateAverage(grades);
        int highest = findHighestGrade(grades);
        int lowest = findLowestGrade(grades);

        // Display results
        System.out.println("\nAverage grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }
}
