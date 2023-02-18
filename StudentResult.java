import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollNo = input.nextInt();
        input.nextLine(); // consume the newline character
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Physics Marks: ");
        int physicsMarks = input.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        int chemistryMarks = input.nextInt();
        System.out.print("Enter Maths Marks: ");
        int mathsMarks = input.nextInt();

        // calculate total marks and percentage
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (double) totalMarks / 3;

        // calculate pass/fail status
        String status = "Fail";
        if (physicsMarks >= 40 && chemistryMarks >= 40 && mathsMarks >= 40) {
            status = "Pass";
        }

        // calculate grade based on percentage
        String grade = "";
        if (percentage >= 70) {
            grade = "Distinction";
        } else if (percentage >= 60) {
            grade = "First Class";
        } else if (percentage >= 50) {
            grade = "Second Class";
        } else if (percentage >= 40) {
            grade = "Pass Class";
        }

        // print the result
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Physics Marks: " + physicsMarks);
        System.out.println("Chemistry Marks: " + chemistryMarks);
        System.out.println("Maths Marks: " + mathsMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Status: " + status);
        if (status.equals("Pass")) {
            System.out.println("Grade: " + grade);
        }
    }
}

