package MyGenericList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());

        System.out.println("-------------------------------------------------------------------");

        MyList<Integer> list2 = new MyList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println("2. indisteki değer : " + list2.get(2));
        list2.remove(2);
        list2.add(40);
        list2.set(0, 100);
        System.out.println("2. indisteki değer : " + list2.get(2));
        System.out.println(list2.toString());

        System.out.println("-------------------------------------------------------------------");


        MyList<Integer> list3 = new MyList<>();
        System.out.println("Liste Durumu : " + (list3.isEmpty() ? "Boş" : "Dolu"));
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(20);
        list3.add(50);
        list3.add(60);
        list3.add(70);
        System.out.println("Liste Durumu : " + (list3.isEmpty() ? "Boş" : "Dolu"));
        
        System.out.println("Indeks : " + list3.indexOf(20));
        System.out.println("Indeks :" + list3.indexOf(100));
        System.out.println("Indeks : " + list3.lastIndexOf(20));

        Object[] dizi = list3.toArray();

        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);
        
        MyList<Integer> newList3 = list3.sublist(0, 3);
        System.out.println(newList3.toString());

        System.out.println("Listemde 20 değeri : " + list3.contains(20));
        System.out.println("Listemde 120 değeri : " + list3.contains(120));

        list3.clear();
        System.out.println(list3.toString());

    }
}
