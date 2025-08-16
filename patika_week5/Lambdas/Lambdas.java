package Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        /* lambda ve Stream API kullanarak sayıları 2 ile çarpıyoruz
         map -> listedeki elemanları gezer
         collect -> sonucu yeni bir listeye dönüştürür */
        List<Integer> doubled = numbers.stream().map(num -> num * 2).collect(Collectors.toList());
/*      for-each ile yazdırma
          for(int listDoubledNumber : doubled)
            System.out.println(listDoubledNumber); */

        // forEach ile doubled listesindeki her sayıyı ekrana yazdırıyoruz
        doubled.forEach(System.out::println);


       /* yeni bir liste olşturmaya gerek yoksa, hemen ekrana yazdırabilirsiniz
       numbers.stream().map(num -> num * 2).forEach(System.out::println); */

    }
}

