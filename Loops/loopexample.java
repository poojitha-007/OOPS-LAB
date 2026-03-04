import java.util.Scanner;

public class loopexample{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // FOR LOOP
        System.out.println("For Loop (1 to 5):");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // WHILE LOOP
        System.out.println("While Loop (1 to 5):");
        int j = 1;
        while(j <= 5) {
            System.out.println(j);
            j++;
        }

        // DO-WHILE LOOP
        System.out.println("Do-While Loop (1 to 5):");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while(k <= 5);

        sc.close();
    }
}