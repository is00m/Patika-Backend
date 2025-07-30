# 📚 MyGenericList<T>

Bu proje, Java'da generic yapılar kullanılarak kendi **liste (list)** sınıfımızı oluşturmaya yönelik bir çalışmadır.

📌 **Not:** Java'daki hazır `ArrayList`, `LinkedList` gibi `Collection` sınıfları kullanılmamaya özen gösterilmiştir
sadece yazdırma aşamasında işimizi kolaylaştırması için `Arrays.toString` kullanılmıştır.
---

## 🎯 Projenin Amacı

Java'da generic sınıfların kullanımı ve veri yapılarının mantığını öğrenmek amacıyla, bir `MyGenericList<T>` sınıfı tasarlanmıştır. Bu sınıf ile:
- Eleman ekleme
- Eleman silme
- Liste sorgulama
- Alt liste alma
  gibi işlemler yapılabilmektedir.

---

## 🧱 Sınıf Özellikleri

### 🛠️ Constructor'lar

```java
MyGenericList()          // Varsayılan boyut 10
MyGenericList(int size)  // Başlangıç kapasitesini kullanıcı belirler
```
### 🧪 Metotlar

```java
void add(T data)     //Listeye eleman ekler
T get(int index)     //Belirtilen indisteki elemanı döner
T remove(int index)     //Belirtilen indisteki elemanı siler ve sola kaydırır
int size()     //Listede kaç eleman olduğunu verir
int getCapacity()     //Dizinin toplam kapasitesini verir
int indexOf(T data)     //İlk eşleşen elemanın indeksini döner
int lastIndexOf(T data)     //Son eşleşen elemanın indeksini döner
boolean isEmpty()     //Liste boş mu kontrol eder
boolean contains(T data)     //Eleman listede var mı kontrol eder
T[] toArray()     //Listenin dolu kısmını array olarak döner
void clear()     //Listeyi tamamen temizler
MyGenericList<T> sublist(int start, int finish)     //Belirli aralıktaki elemanlardan yeni bir liste oluşturur
String toString()     //Listeyi yazdırılabilir hale getirir
```
