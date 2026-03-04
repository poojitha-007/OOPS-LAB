import java.util.Scanner;

public class StudentResultforloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalStudents;
        int pass = 0;
        int fail = 0;

        System.out.print("Enter total number of students: ");
        totalStudents = sc.nextInt();

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            int marks = sc.nextInt();

            if (marks >= 35 && marks <= 100) {
                pass++;
            } else if (marks >= 0 && marks < 35) {
                fail++;
            } else {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                i--;   // repeat same student
            }
        }

        System.out.println("\n--- Result Report ---");
        System.out.println("Total Students : " + totalStudents);
        System.out.println("Passed         : " + pass);
        System.out.println("Failed         : " + fail);

        sc.close();
    }
}
