/* Nama File    : Main.java
 * Deskripsi    : Program utama untuk menampilkan informasi civitas akademika
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 25 Maret 2025
 */
public class Main {
    public static void main(String[] args) {
        // Membuat fakultas
        Fakultas fsm = new Fakultas("Fsm", 15000000, 10000000);
        Fakultas ekonomi = new Fakultas("Ekonomi", 12000000, 8500000);
        
        // Membuat mahasiswa
        Mahasiswa m1 = new Mahasiswa("Duta Adi Pamungkas", "dutaadi@univ.ac.id", "24060123140174", 4, fsm);
        Mahasiswa m2 = new Mahasiswa("Asep Keseimbangan", "asep@univ.ac.id", "24060122140999", 6, ekonomi);
        
        // Membuat dosen
        Dosen d1 = new Dosen("Dr. Helmie Arif Wibawa, S.Si., M.Cs.", "helmie@univ.ac.id", "D001", 10, fsm);
        Dosen d2 = new Dosen("Nurdin Bahtiar, S.Si., M.T.", "nurdin@univ.ac.id", "D002", 15, ekonomi);
        
        // Membuat tendik
        Tendik t1 = new Tendik("Beny Nugroho, S.Kom.", "benny@univ.ac.id", "T001", 8);
        Tendik t2 = new Tendik("Anang Ardiyanto, S.Kom.", "anang@univ.ac.id", "T002", 12);

        // Menampilkan informasi
        m1.displayInfo();
        m2.displayInfo();
        d1.displayInfo();
        d2.displayInfo();
        t1.displayInfo();
        t2.displayInfo();

        // Menampilkan jumlah instance
        System.out.println("Total Mahasiswa: " + Mahasiswa.getCountMahasiswa());
        System.out.println("Total Dosen: " + Dosen.getCountDosen());
        System.out.println("Total Tendik: " + Tendik.getCountTendik());
    }
}