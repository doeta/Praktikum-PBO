/* Nama File    : Main.java
 * Deskripsi    : Ini meurupakan main untuk menjalankan program koleksi anabul
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Membuat objek koleksi dengan kapasitas 10
            Koleksi k = new Koleksi(10);
            
            // Array untuk menyimpan objek Anabul
            Anabul[] daftarHewan = new Anabul[10];

            // Menambahkan data ke dalam koleksi dan array hewan
            daftarHewan[0] = new Kucing("Asep");
            k.add("Asep");
            daftarHewan[1] = new Anjing("Jamal");
            k.add("Jamal");
            daftarHewan[2] = new Burung("Udin");
            k.add("Udin");
            daftarHewan[3] = new Kucing("Fatur");
            k.add("Fatur");
            daftarHewan[4] = new Anjing("Slamet");
            k.add("Slamet");
            daftarHewan[5] = new Burung("Budi");
            k.add("Budi");
            daftarHewan[6] = new Kucing("Susi");
            k.add("Susi");
            daftarHewan[7] = new Anjing("Joko");
            k.add("Joko");
            daftarHewan[8] = new Burung("Jono");
            k.add("Jono");
            daftarHewan[9] = new Kucing("Acumalaka");
            k.add("Acumalaka");


            // Menampilkan seluruh isi koleksi
            System.out.println("Isi koleksi:");
            k.showAll();
            System.out.println("Jumlah elemen: " + k.getSize());
            
            System.out.println("\nPerilaku Hewan dalam Koleksi:");
            // Menampilkan nama, bunyi, dan gerakan semua hewan
            for (int i = 0; i < k.getSize(); i++) {
                Anabul hewan = daftarHewan[i];
                String namaHewan = k.getIsi(i);
                
                System.out.println("\nHewan ke-" + (i+1) + ":");
                System.out.println("Nama Hewan: " + namaHewan);
                
                // Menentukan jenis Anabul
                String jenisHewan;
                if (hewan instanceof Kucing) {
                    jenisHewan = "Kucing";
                } else if (hewan instanceof Anjing) {
                    jenisHewan = "Anjing";
                } else if (hewan instanceof Burung) {
                    jenisHewan = "Burung";
                } else {
                    jenisHewan = "Tidak Dikenal";
                }
                System.out.println("Jenis Anabul: " + jenisHewan);
                
                System.out.print("Cara Gerak: ");
                hewan.gerak();
                
                System.out.print("Cara Bersuara: ");
                hewan.bersuara();
            }
            
            System.out.println();

            // Menghapus salah satu data
            System.out.println("Hapus 'Acumalaka'");
            String dihapus = k.delete("Acumalaka");
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
            k.setIsi(0, "Rahmat");
            System.out.println("Setelah edit: " + k.getIsi(0));
            System.out.println("Jumlah elemen: " + k.getSize());
            
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