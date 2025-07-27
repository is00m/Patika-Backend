# 🎬 Film Koleksiyonu Uygulaması

Bu Java uygulaması, film koleksiyonu üzerinde çeşitli işlemler yapmanıza olanak tanır. Filmleri IMDb puanına göre, çıkış yılına göre sıralayabilir ve türüne göre filtreleyebilirsiniz.

## 📌 Özellikler

- 🎥 IMDb puanına göre **azalan** sırayla film listeleme
- 🗓️ Çıkış yılına göre **artan** sırayla film listeleme
- 🎭 Kullanıcıdan alınan film türüne göre **filtreleme**
- 📄 Nesne yönelimli programlama (OOP) prensipleriyle yazılmıştır

---

## 🛠 Kullanılan Sınıflar

### 🔹 `Movie` Sınıfı
Her film için şu özellikleri içerir:
- `title` (String): Filmin adı
- `year` (int): Çıkış yılı
- `genre` (String): Film türü (örnek: `"Drama"`, `"Crime,Drama"`)
- `imdbRating` (double): IMDb puanı

Getter metodları ile bu bilgilere erişim sağlanır.

### 🔹 `Main` Sınıfı
Programın yürütüldüğü ana sınıftır. İçerisinde:
- Film listesi oluşturulur.
- IMDb ve çıkış yılına göre sıralama yapılır.
- Kullanıcıdan tür bilgisi alınarak filtreleme yapılır.

---

## 🧪 Örnek 

    ---- KOLEKSİYONDAKİ FİLMLERİN IMDB PUANINA GÖRE SIRALAMASI ----
    The Shawshank Redemption - 9.3
    The Godfather - 9.2
    The Dark Knight - 9.1
    The Godfather Part II - 9.0
    12 Angry Men - 9.0
    
    ---- KOLEKSİYONDAKİ FİLMLERİN ÇIKIŞ YILINA GÖRE SIRALAMASI ----
    12 Angry Men - 1957
    The Godfather - 1972
    The Godfather Part II - 1974
    The Shawshank Redemption - 1994
    The Dark Knight - 2008
    
    Film türü giriniz(Drama,Crime,Action) : Crime
    The Godfather - Crime
    The Godfather Part II - Crime
    12 Angry Men - Crime,Drama

