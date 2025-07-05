import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking student details
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        String roll = input.nextLine();

        // Taking marks of 3 subjects
        System.out.print("Enter marks of Subject 1: ");
        int m1 = input.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = input.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = input.nextInt();

        // Calculating total and percentage
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;
        String grade;

        // Assigning grade
        if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Displaying result
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}
