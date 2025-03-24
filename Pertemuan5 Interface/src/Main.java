// Nama File: Main.java
// Deskripsi: Class utama untuk menguji implementasi abstract class, subclass, dan interface IResize
// Pembuat: Duta Adi Pamungkas
// Tanggal: 17-03-2025

public class Main {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(10, "Merah", "Solid");
        BangunDatar L1 = new Lingkaran(7, "Biru", "Dotted");

        System.out.println("Informasi awal Persegi:");
        P1.printInfo();
        System.out.println();

        System.out.println("Informasi awal Lingkaran:");
        L1.printInfo();
        System.out.println();

        System.out.println("Apakah luas Persegi dan Lingkaran sama? " + P1.isEqualLuas(L1));
        System.out.println("Apakah keliling Persegi dan Lingkaran sama? " + P1.isEqualKeliling(L1));
        System.out.println();

        System.out.println("=== Eksperimen Resize ===");

        System.out.println("\nMelakukan zoomIn pada Persegi:");
        ((Persegi) P1).zoomIn(); 
        P1.printInfo();

        System.out.println("\nMelakukan zoomOut pada Lingkaran:");
        ((Lingkaran) L1).zoomOut(); 
        L1.printInfo();

        System.out.println("\nMelakukan zoom 50% pada Persegi:");
        ((Persegi) P1).zoom(50); 
        P1.printInfo();

        System.out.println("\n=== Setelah Resize ===");
        System.out.println("Apakah luas Persegi dan Lingkaran sama? " + P1.isEqualLuas(L1));
        System.out.println("Apakah keliling Persegi dan Lingkaran sama? " + P1.isEqualKeliling(L1));
    }
}