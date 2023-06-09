import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input statement
        System.out.println("Enter your birth month (1 - 12): ");
        int birthMonth = scanner.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12) {
            // Output statements
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            // Output statements
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}