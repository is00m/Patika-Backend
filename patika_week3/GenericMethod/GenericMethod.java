package GenericMethod;

public class GenericMethod {

    // Generic metod: <T> tür parametresidir
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Alt satıra geçmek için yazdık
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5}; // Integer dizisi
        String[] strArray = {"Java", "Generics", "Ödev"}; // String dizisi

        // Metodlarımızı çağırıyoruz
        printArray(intArray);
        printArray(strArray);
    }
}
