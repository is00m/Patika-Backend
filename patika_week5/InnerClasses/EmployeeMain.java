package InnerClasses;

public class EmployeeMain {
    public static void main(String[] args) {
        // Bir Employee nesnesi oluşturur
        Employee e = new Employee("Ismail", "Kilic");
        // Employee nesnesini kullanarak bir ContactInfo nesnesi oluşturur
        Employee.ContactInfo contact = e.new ContactInfo("123-456-7890","iskilic@example.com");

        contact.displayContactDetails();
    }
}
