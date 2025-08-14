package Enums;

import java.util.Scanner;

public class WorkSchedule {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDay = "";
        boolean validDay = false;

        while (!validDay) {
            System.out.println("Please enter a day (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY): ");
            inputDay = scanner.next().toUpperCase();

            try {
                Day day = Day.valueOf(inputDay);
                System.out.println("Working hours for " + day + ": " + day.getWorkHours());
                validDay = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input! Please enter a valid day.");
            }
        }

        scanner.close();
    }
}
