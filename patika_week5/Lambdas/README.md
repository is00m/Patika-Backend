# Lambdas

Bu proje, Java'da **lambda ifadeleri** ve **Stream API** kullanarak sayı listesini iki katına çıkarmayı gösterir.

## ✨ Özellikler
- Geleneksel for döngüsüne gerek kalmadan kısa ve okunabilir kod.
- Fonksiyonel programlama yaklaşımı ile daha modüler yapı.

## 📂 Kod Açıklaması
1. `numbers` listesi başlangıçta `[1, 2, 3, 4, 5]` değerlerini içerir.
2. `map(num -> num * 2)` ifadesi her elemanı 2 ile çarpar.
3. `collect(Collectors.toList())` sonucu yeni bir listeye dönüştürür.
4. `forEach(System.out::println)` ile sonuç ekrana yazdırılır.