import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;       // Get last digit
            sum += digit * digit * digit;  // Cube and add
            number /= 10;                  // Remove last digit
        }

        if (sum == original) {
            System.out.println(original + " is  Armstrong number.");
        } else {
            System.out.println(original + " is not  Armstrong number.");
        }

        sc.close();
    }
}

