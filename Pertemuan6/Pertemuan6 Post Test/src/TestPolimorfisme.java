/* Nama File    : TestPolimorfisme.java
 * Deskripsi    : ini merupakan class untuk menguji polimorfisme
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}
