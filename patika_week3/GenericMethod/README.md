# Generic Metot

Bu proje, Java'da **generic metot** kullanarak farklı veri türlerinden oluşan dizileri ekrana yazdırmayı amaçlayan basit bir örnektir.

---

## 🧠 Amaç

Generic metotlar, kod tekrarını önleyerek aynı işlemleri farklı veri tipleri üzerinde çalıştırmamıza olanak tanır. Bu örnekte, `printArray` adında bir generic metot ile farklı türde diziler ekrana yazdırılmıştır.

### 🧪 Örnek Kullanım

    Integer[] intArray = {1, 2, 3, 4, 5};
    String[] strArray = {"Java", "Generics", "Ödev"};
    
    printArray(intArray);  // 1 2 3 4 5
    printArray(strArray);  // Java Generics Ödev

### ✅ Beklenen Çıktı

    1 2 3 4 5
    Java Generics Ödev
