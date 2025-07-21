package SalaryCalculator;

public class Employee { // Niteliklerimiz.
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) { // Kurucu metot
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() { // Ne kadar kesileceğini hesaplıyor VERGİ :))))))
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() { // Ekstra saatin ne kadar tuttuğunu hesaplıyor
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() { // Yıla göre uygulanacak zamı hesaplıyor
        int currentYear = 2021;
        int workedYear = currentYear - hireYear;

        if (workedYear < 10) {
            return salary * 0.05;
        } else if (workedYear < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }

    }

    public String toString() { // Çıktımızı oluşturan son metotumuz
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithBonusAndTax = salary - tax + bonus;
        double totalSalary = salaryWithBonusAndTax + raise;

        return "Adı: " + name + "\nMaaşı: " + salary + "\nÇalışma Saati: " + workHours + "\nBaşlangıç Yılı: " + hireYear + "\nVergi: " + tax + "\nBonus: " + bonus + "\nMaaş Artışı: " + raise + "\nVergi ve Bonuslar ile Maaş: " + salaryWithBonusAndTax + "\nToplam Maaş : " + totalSalary;
    }
}
