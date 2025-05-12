/* Nama File    : ArrayListTest.java
 * Deskripsi    : Ini merupakan class untuk menguji ArrayList
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();

        // Menambahkan elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        // Menghapus elemen
        strings.remove("praktikum");

        // Iterasi pada keseluruhan ArrayList
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}