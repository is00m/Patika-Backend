# Method Reference Ödevi

Bu proje, **Java'da method reference** kullanımını göstermek amacıyla hazırlanmıştır.  
Verilen örnekte, bir `List<String>` içindeki isimler ekrana yazdırılmaktadır.

## 🚀 Geleneksel Yöntem

Aşağıdaki kodda, `for` döngüsü kullanılarak listenin elemanları ekrana yazdırılır:
```
for (String name : names) {
    System.out.println(name);
}
```

## ✅ Method Reference ile Çözüm
```
names.forEach(System.out::println);
```