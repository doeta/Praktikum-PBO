/* Nama File    : MainDatum.java
 * Deskripsi    : Ini merupakan class untuk menguji Datum dan metode generik
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public class MainDatum {
    public static void main(String[] args) {
        System.out.println("=== Demo Kelas Datum (Bagian A) ===");
        
        // Membuat objek Datum untuk setiap hewan
        Datum<Anabul> datum1 = new Datum<>();
        datum1.setIsi(new Kucing("Ciko"));
        
        Datum<Anabul> datum2 = new Datum<>();
        datum2.setIsi(new Anjing("Oci"));
        
        Datum<Anabul> datum3 = new Datum<>();
        datum3.setIsi(new Burung("Jhonny"));

        // Menyimpan semua Datum dalam list
        Datum<?>[] dataHewan = {datum1, datum2, datum3};

        for (Datum<?> d : dataHewan) {
            Anabul hewan = (Anabul) d.getIsi(); 
            hewan.getNama();
            hewan.gerak();
            hewan.bersuara();
            System.out.println();
        }

        System.out.println("\n=== Demo Metode Generik (Bagian B) ===");
        
        // Membuat objek Datum baru
        Datum<Anabul> datum4 = new Datum<>();
        datum4.setIsi(new Kucing("Milo"));
        
        Datum<Anabul> datum5 = new Datum<>();
        datum5.setIsi(new Anjing("Buddy"));
        
        Datum<Anabul> datum6 = new Datum<>();
        datum6.setIsi(new Burung("Tweety"));

        // Memanggil metode generik
        ContohMetodeGenerik.kendalikanDatum(datum4);
        ContohMetodeGenerik.kendalikanDatum(datum5);
        ContohMetodeGenerik.kendalikanDatum(datum6);
    }
}