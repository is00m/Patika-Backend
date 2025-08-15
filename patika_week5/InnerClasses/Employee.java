package InnerClasses;

public class Employee {
    private String firstName;
    private String lastName;

    // Employee sınıfı için yapıcı metot
    public Employee(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // İç sınıf: ContactInfo
    class ContactInfo {

        private String phoneNumber;
        private String email;

        // ContactInfo sınıfı için yapıcı metot
        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // İletişim bilgilerini göstermek için metot
        public void displayContactDetails() {
            System.out.println("Employee: " + firstName + " " + lastName);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + email);
        }
    }
}
