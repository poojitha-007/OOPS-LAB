import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalStudents;
        int pass = 0;
        int fail = 0;
        int i = 1;

        System.out.print("Enter total number of students: ");
        totalStudents = sc.nextInt();

        do {
            System.out.print("Enter marks of student " + i + ": ");
            int marks = sc.nextInt();

            if (marks >= 35) {
                pass++;
                i++;
            } else if (marks >= 0 && marks < 35) {
                fail++;
                i++;
            } else {
                System.out.println("Invalid marks! Enter between 0 to 100.");
            }

        } while (i <= totalStudents);

        System.out.println("\n--- Result Report ---");
        System.out.println("Total Students : " + totalStudents);
        System.out.println("Passed         : " + pass);
        System.out.println("Failed         : " + fail);

        sc.close();
    }
}
