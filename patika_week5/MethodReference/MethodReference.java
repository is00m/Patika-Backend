package MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep");

        // for döngüsünün method reference ile eşdeğeri:
        names.forEach(System.out::println);

        /* alternatif
        names.stream().forEach(System.out::println); */
    }
}
