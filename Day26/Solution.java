import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the actual return date.
        int returnDay = scanner.nextInt();
        int returnMonth = scanner.nextInt();
        int returnYear = scanner.nextInt();

        // Read the due date.
        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();

        scanner.close();

        int fine = 0;  // Initialize the fine to 0.

        if (returnYear > dueYear) {
            // Book is returned after the expected year, so fixed fine.
            fine = 10000;
        } else if (returnYear == dueYear) {
            // Same year, check for the month.
            if (returnMonth > dueMonth) {
                // Book is returned after the expected month but in the same year.
                fine = (returnMonth - dueMonth) * 500;
            } else if (returnMonth == dueMonth && returnDay > dueDay) {
                // Book is returned after the expected day in the same month and year.
                fine = (returnDay - dueDay) * 15;
            }
        }

        System.out.println(fine);
    }
}
