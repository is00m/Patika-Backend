## Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

## Çin Zodyağı nasıl hesaplanır?

    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun

## Seneryo
    Doğum Yılınızı Giriniz : 1990
    Çin Zodyağı Burcunuz : At

## Cevap:
    Scanner scanner = new Scanner(System.in);

    System.out.println("Doğum Yılınızı Giriniz :");
    int birthYear = scanner.nextInt();

    String[] chineseZodiac =
        {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
        "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

    int index = birthYear % 12;
    String horoscope = chineseZodiac[index];

    System.out.println("Çin Zodyağı Burcunuz : "+ horoscope);
    scanner.close();