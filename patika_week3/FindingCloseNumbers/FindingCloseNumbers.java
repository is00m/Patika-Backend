package FindingCloseNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindingCloseNumbers {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>(10);

        //ArrayList'in içini doldurup pozitif olup olmadığını kontrol ediyoruz
            for (int i = 1; i <= 10; i++) {
            boolean isPositive = false;
            do {
                System.out.print(i + ". Sayıyı giriniz : ");
                int num = input.nextInt();
                if (num > 0) {
                    nums.add(num);
                    isPositive = true;
                } else {
                    System.out.println("Pozitif sayı giriniz");
                }
            } while (!isPositive);
        }
        Collections.sort(nums);
        System.out.println("Sayı listesi : " + nums);

        int minGap = Integer.MAX_VALUE;
        int closeNum1 = 0;
        int closeNum2 = 0;

        //Doldurduğumuz ArrayListteki sayılarımızı indexlerine bakarak aralarındaki farkı buluyoruz
        for (int i = 1; i < nums.size(); i++) {
            int gap = nums.get(i) - nums.get(i - 1);
            if (gap < minGap) {
                minGap = gap;
                closeNum1 = nums.get(i);
                closeNum2 = nums.get(i - 1);
            }

        }
                System.out.println("Aradaki Fark : " + minGap);
                System.out.println("İlk Sayı : " + closeNum2);
                System.out.println("İkinci Sayı : " + closeNum1);
        input.close();
    }
}