# 📄 Harflerin Sıklığı (Frequency Of Letters)

Bu Java programı, kullanıcıdan bir kelime (String) girişi alır ve bu kelimedeki her harfin kaç kez geçtiğini sayarak ekrana yazdırır.

## 🧠 Özellikler

- ❗ Yalnızca harf içeren kelimeleri kabul eder. (Rakam, sembol, boşluk geçersizdir.)
- 🔄 Büyük harfleri otomatik olarak küçük harfe çevirir (`MerHaBa` → `merhaba`)
- 🔢 Harflerin kaç kez geçtiğini `Map` yapısı kullanarak sayar.
- 📤 Sonuçları formatlı bir şekilde ekrana yazdırır.

##  📌 Kullanılan Yapılar
- `Scanner` → Kullanıcıdan giriş almak için
- `String.matches("[a-zA-Z]+")` → Girdinin sadece harf olup olmadığını kontrol etmek için
- `toLowerCase()` → Büyük/küçük harf farkını kaldırmak için
- `HashMap<Character, Integer>` → Harfleri ve tekrar sayılarını saklamak için
- `getOrDefault()` → Harf daha önce eklenmemişse başlangıç değeri vermek için

## 🧪 Örnek Çalışma

#### Girdi:
    Kelimenizi giriniz (Harflerden oluşacak): MerHaBa

#### Çıktı:
    a = 2
    r = 1
    b = 1
    e = 1
    h = 1
    m = 1

#### ⚠️ Not: Bu çalışmada Türkçe karakterler (ç, ğ, ş vs.) dahil değil yani şu anki haliyle sadece İngilizce harfleri kapsıyor.