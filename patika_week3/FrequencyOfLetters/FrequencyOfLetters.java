package FrequencyOfLetters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word; // Değişkenimizi oluşturuyoruz

        while (true) { // Sadece String değer almak için while ile kontrol ediyoruz
            System.out.print("Kelimenizi giriniz (Harflerden oluşacak): ");
            word = input.nextLine();
            if (word.matches("[a-zA-Z]+")) { // Burada ifademiz harflerden mi oluşuyor kontrol ediyor
                break;
            } else {
                System.out.println("Lütfen sadece harflerden oluşan bir kelime giriniz!");
            }
        }

        word = word.toLowerCase(); //Bütün harfler küçük yapılır
        char[] letters = word.toCharArray(); // Kelimeyi Harflere dönüştürüyor
        Map<Character, Integer> numberOfLetters = new HashMap<>();

        for (char letter : letters) { // Sayısını kontrol edip içine yazdırıyoruz
            numberOfLetters.put(letter, numberOfLetters.getOrDefault(letter, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : numberOfLetters.entrySet()) { // Son olarak çıktımızı aldığımız for döngüsü
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        input.close();
    }
}
