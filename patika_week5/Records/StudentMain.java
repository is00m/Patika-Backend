package Records;

public class StudentMain {
    public static void main(String[] args) {
        // Birkaç öğrenci nesnesi oluşturma
        Student student1 = new Student("Ismail", "Kilic", 32);
        Student student2 = new Student("Eray", "Keskiner", 33);
        Student student3 = new Student("Ismail", "Kilic", 32);

        // Öğrenci bilgilerini ekrana yazdırma
        System.out.println(student1);
        System.out.println(student2);

        // toString() metodunu kullanma
        System.out.println("Student Info: " + student1.toString());

        // equals ve hashCode testi
        System.out.println("student1.equals(student3): " + student1.equals(student3));
        System.out.println("student1.hashCode() == student3.hashCode(): " + (student1.hashCode() == student3.hashCode()));
    }
}
