import java.util.Scanner;

public class Activity2 {

    public static void run() {

        Scanner input = new Scanner(System.in);

        // Ticket format prices
        double basePrice = 0;
        String screeningFormat = "";

        System.out.println("=== CINEMA TICKET SYSTEM ===");

        // Select movie format
        System.out.print("Select Format (1: REGULAR, 2: 3D, 3: IMAX): ");
        int format = input.nextInt();

        if (format == 1) {
            screeningFormat = "REGULAR";
            basePrice = 350;
        } else if (format == 2) {
            screeningFormat = "3D";
            basePrice = 400;
        } else if (format == 3) {
            screeningFormat = "IMAX";
            basePrice = 450;
        } else {
            System.out.println("Invalid format selected.");
            input.close();
            return;
        }

        // Ask for screening hour
        System.out.print("Enter Screening Hour (24-Hour Format, e.g., 18): ");
        int screeningHour = input.nextInt();

        // Peak hour fee
        double peakHourFee = 0;

        // Peak hours: 5 PM to 8 PM
        if (screeningHour >= 17 && screeningHour <= 20) {
            peakHourFee = 50;
        }

        // Calculate total
        double totalTicketCost = basePrice + peakHourFee;

        // Display ticket breakdown
        System.out.println();
        System.out.println("--- TICKET BREAKDOWN ---");
        System.out.println("Screening Format: " + screeningFormat);
        System.out.printf("Base Ticket Price: PHP %.2f%n", basePrice);
        System.out.printf("Peak Hour Fee:     PHP %.2f%n", peakHourFee);
        System.out.println("------------------------------");
        System.out.printf("TOTAL TICKET COST: PHP %.2f%n", totalTicketCost);
        System.out.println("STATUS:            SEAT RESERVED");

        input.close();
    }
}