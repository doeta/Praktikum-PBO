/* Nama File    : MainA.java
 * Deskripsi    : Main program untuk menguji class Anabul dan subclassnya
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 22 April 2025
 */
import java.util.ArrayList;

public class MainA {
    public static void main(String[] args) {

        Anabul Anabul1 = new Kucing("Ciko");
        Anabul Anabul2 = new Anjing("Oci");
        Anabul Anabul3 = new Burung("Jhonny");

        ArrayList<Anabul> kewn = new ArrayList<>();
        kewn.add(Anabul1);
        kewn.add(Anabul2);
        kewn.add(Anabul3);

        for (Anabul haiwan : kewn) {
            // haiwan.getNama();
            haiwan.gerak();
            haiwan.bersuara();
            System.out.println();
        }
    }
}