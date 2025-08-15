# Çalışan ve İletişim Bilgileri (Inner Class) Örneği

## Açıklama
Bu proje, Java’da **Inner Class** kullanımını göstermektedir.
- `Employee` dış sınıfı çalışan adı ve soyadı bilgilerini tutar.
- `ContactInfo` iç sınıfı çalışanın telefon numarası ve e-posta adresini tutar.
- İç sınıf, dış sınıfın özel (`private`) alanlarına doğrudan erişebilir.

## Dosyalar
- **Employee.java** → `Employee` dış sınıfı ve `ContactInfo` iç sınıfını içerir.
- **EmployeeMain.java** → Nesnelerin oluşturulup bilgilerin ekrana yazdırıldığı ana sınıf.

## Nasıl Çalışır?
1. `Employee` sınıfından bir çalışan nesnesi oluşturulur.
2. Bu nesne üzerinden `ContactInfo` iç sınıf nesnesi oluşturulur.
3. `ContactInfo` içindeki metot ile çalışanın tüm bilgileri ekrana yazdırılır.

## Örnek Çıktı
```
Employee: Ismail Kilic
Phone: 123-456-7890
Email: iskilic@example.com
```
