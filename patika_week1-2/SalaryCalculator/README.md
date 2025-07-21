# SalaryCalculator

Bu proje, Java programlama dili kullanılarak geliştirilen basit bir maaş hesaplama uygulamasıdır. Proje kapsamında bir çalışanın maaşına; vergi, bonus ve zam hesaplamaları uygulanmaktadır.

## Özellikler

- Çalışan bilgilerini (ad, maaş, haftalık çalışma saati, işe giriş yılı) tutar.
- Maaşa %3 oranında vergi uygular (1000 TL altında vergi uygulanmaz).
- 40 saatin üzerindeki her saat için 30 TL bonus hesaplar.
- 2021 yılı baz alınarak çalışanlık süresine göre zam oranı belirler:
    - < 10 yıl: %5 zam
    - 10-19 yıl: %10 zam
    - ≥ 20 yıl: %15 zam

## Sınıflar

- **Employee.java**: Çalışan sınıfını tanımlar ve tüm hesaplamaları içerir.
- **SalaryCalculator.java**: Kullanıcıdan veri alır ve sonuçları ekrana yazdırır.

## Örnek Çıktı

    --- Çalışan Bilgileri ---
    Adı: İsmail
    Maaşı: 2000.0
    Çalışma Saati: 45
    Başlangıç Yılı: 1985
    Vergi: 60.0
    Bonus: 150.0
    Maaş Artışı: 300.0
    Vergi ve Bonuslar ile Maaş: 2090.0
    Toplam Maaş : 2390.0