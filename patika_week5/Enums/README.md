# Enum

##  Proje Hakkında

Proje, kullanıcıdan bir gün adı alarak, o günün çalışma saatlerini gösteren basit bir uygulamayı içeriyor. Çalışma saatleri, Enum yapısı kullanılarak yönetilmektedir.

##  Klasör Yapısı

Proje içerisinde aşağıdaki dosyalar bulunmaktadır:

1. **Day.java**:
    - `Day` adında bir Enum sınıfı içerir. Bu sınıf, haftanın her günü için belirli çalışma saatlerini tutar (`9:00 AM - 5:00 PM`).
    - Her günün çalışma saatlerine `getWorkHours()` metodu ile ulaşılabilir.

2. **WorkSchedule.java**:
    - Kullanıcıdan bir gün adı alır ve bu günde belirtilen çalışma saatlerini ekrana yazdırır.
    - Kullanıcı, geçerli bir gün adı girene kadar uygulama sürekli çalışır.
