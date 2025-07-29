# Java HashMap Kullanımı Örneği

Bu proje, Java'da `HashMap` kullanarak anahtar-değer (key-value) yapısının nasıl çalıştığını gösteren basit bir örnektir.

## 📌 Açıklama

Program, öğrenci isimlerini ve onlara ait notları bir `HashMap` yapısında saklar. Daha sonra bu verileri `for-each` döngüsüyle ekrana yazdırır.

### Kullanılan Veriler:

- Ali = 85
- Ayşe = 92
- Mehmet = 78
- Zeynep = 90
- Burak = 88

### Örnek Çıktı:

    Ali = 85
    Ayşe = 92
    Mehmet = 78
    Zeynep = 90
    Burak = 88      
#### ⚠️ Not: HashMap sıralı değildir. Çıktıdaki sıranın karışık olması mümkündür. Eğer girdi sırasını korumak istersen, LinkedHashMap kullanmalısın.