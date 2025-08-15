# Öğrenci Kayıt Sistemi (Java Record Örneği)

## Açıklama
Bu proje, Java **Record** sınıfı kullanarak basit bir öğrenci kayıt sistemini göstermektedir.
- `Student` record sınıfı, öğrencinin adı, soyadı ve öğrenci numarasını tutar.
- Record sınıflar **immutable** (değiştirilemez) yapıdadır ve `equals`, `hashCode` ile `toString` metotları otomatik olarak oluşturulur.

## Dosyalar
- **Student.java** → Öğrenci bilgilerini tutan record sınıfı.
- **StudentMain.java** → Birkaç öğrenci nesnesi oluşturan ve bilgilerini ekrana yazdıran ana sınıf.

## Nasıl Çalışır?
1. `Student` sınıfından birkaç öğrenci nesnesi oluşturulur.
2. Öğrenci bilgileri ekrana yazdırılır.
3. `equals` ve `hashCode` metotlarının doğru çalıştığı test edilir.

## Örnek Çıktı
```
Student{studentNum=32, firstName='Ismail', lastName='Kilic'}
Student{studentNum=33, firstName='Eray', lastName='Keskiner'}
Student Info: Student{studentNum=32, firstName='Ismail', lastName='Kilic'}
student1.equals(student3): true
student1.hashCode() == student3.hashCode(): true
```
