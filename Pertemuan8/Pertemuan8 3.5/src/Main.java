/* Nama File    : Main.java
 * Deskripsi    : Ini merupakan Main untuk menjalankan program koleksi
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Membuat objek koleksi dengan kapasitas 10
            Koleksi k = new Koleksi(10);

            // Menambahkan data ke dalam koleksi
            k.add("Asep");
            k.add("jamal");
            k.add("Udin");
            k.add("Prabowo");
            k.add("Gibran");

            // Menampilkan seluruh isi koleksi
            System.out.println("Isi koleksi:");
            k.showAll();
            System.out.println("Jumlah elemen: " + k.getSize());
            
            System.out.println();

            // Menghapus salah satu data
            System.out.println("Hapus 'Gibran'");
            String dihapus = k.delete("Gibran");
            if (dihapus != null) {
                System.out.println("Yang dihapus: " + dihapus);
            }

            // Menampilkan ulang isi koleksi
            System.out.println("\nSetelah penghapusan:");
            k.showAll();
            System.out.println("Jumlah elemen: " + k.getSize());

            // Edit data ke-1 (indeks 0)
            System.out.println("\nEdit data ke-1 (indeks 0)");
            System.out.println("Sebelum edit: " + k.getIsi(0));
            k.setIsi(0, "Ahok");
            System.out.println("Setelah edit: " + k.getIsi(0));
            System.out.println("Jumlah elemen: " + k.getSize());
            System.out.println();
            
            // Menampilkan ulang isi koleksi
            System.out.println("\nSetelah edit:");
            k.showAll();

            // Coba tambah lebih dari kapasitas
            System.out.println();
            int bound = ((k.getWadah().length - k.getSize())-1);
            
            for (int i = 0; i <= bound; i++) {
                k.add("Null");
            }

            System.out.println("Show all :");
            k.showAll();
            
            System.out.println();
            System.out.println("Mencoba tambahkan objek");
            k.add("test aj");
        } catch (Eksepsi e) {
            System.out.println("Terjadi Eksepsi: " + e.getMessage());
        }
    }
}