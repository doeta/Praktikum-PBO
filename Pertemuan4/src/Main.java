/* Nama File    : Main.java
* Deskripsi    : berisi aplikasi dalam class BangunDatar
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 11 Maret 2025
*/
public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi2 = new Persegi();
        System.out.println("Informasi Persegi:");
        persegi2.printInfo();
        System.out.println();

        Persegi persegi = new Persegi(5.0, "Merah", "Solid");
        System.out.println("Informasi Persegi:");
        persegi.printInfo(); 
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(7.0, "Biru", "Dashed");
        System.out.println("Informasi Lingkaran:");
        lingkaran.printInfo();
        System.out.println();
        

        

    }
}