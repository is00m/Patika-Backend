package SalaryCalculator;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String name = scanner.nextLine();

        System.out.print("Maaşınızı giriniz: ");
        double salary = scanner.nextDouble();

        System.out.print("Çalışma saatinizi giriniz(Haftalık): ");
        int workHours = scanner.nextInt();

        System.out.print("İşe başlama yılınızı giriniz: ");
        int hireYear = scanner.nextInt();

        Employee employee = new Employee(name, salary, workHours, hireYear);

        System.out.println("\n--- Çalışan Bilgileri ---");
        System.out.println(employee.toString());
    }
}
