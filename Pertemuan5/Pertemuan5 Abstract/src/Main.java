// Nama File: Main.java
// Deskripsi: Class utama untuk menguji implementasi abstract class, subclass, dan interface IResize
// Pembuat: Duta Adi Pamungkas
// Tanggal: 17-03-2025
public class Main {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(10, "Merah", "Solid");
        Lingkaran L1 = new Lingkaran(7, "Biru", "Dotted");
        Persegi P2 = new Persegi(10, "Hijau", "Striped"); // Objek tambahan

        System.out.println("Informasi awal Persegi:");
        P1.printInfo();
        System.out.println();

        System.out.println("Informasi awal Lingkaran:");
        L1.printInfo();
        System.out.println();

        // Perbandingan Persegi vs Lingkaran
        System.out.println("Apakah luas Persegi dan Lingkaran sama? " + P1.isEqualLuas(L1));
        System.out.println("Apakah keliling Persegi dan Lingkaran sama? " + P1.isEqualKeliling(L1));
        System.out.println();

        // Perbandingan Persegi vs Persegi
        System.out.println("Apakah P1 dan P2 sama luasnya? " + P1.isEqualLuas(P2));

        // Uji setter
        P1.setSisi(5);
        L1.setJariJari(3);      
        System.out.println("\nInformasi setelah diubah:");
        P1.printInfo();
        L1.printInfo();
    }
}