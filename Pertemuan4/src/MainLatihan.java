/* Nama File    : MainLatihan.java
* Deskripsi    : berisi aplikasi dalam class Pegawai
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 11 Maret 2025
*/
// Kelas Main untuk menjalankan program
public class MainLatihan {
    public static void main(String[] args) {
        // Membuat objek DosenTetap
        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi", "1990-05-05", "2015-01-01", 5000000, "Fakultas Sains dan Matematika", "78647324");
        dosenTetap.printInfo();
        System.out.println();

        // Membuat objek DosenTamu
        DosenTamu dosenTamu = new DosenTamu("1234567890", "Budi", "1985-10-15", "2015-01-01", 4000000, "Fakultas Teknik", "12345678", 36);
        dosenTamu.printInfo();
        System.out.println();

        // Membuat objek Tendik
        Tendik tendik = new Tendik("9876543210", "Cici", "1980-03-20", "2015-01-01", 3000000, "Akademik");
        tendik.printInfo();
        System.out.println();

        // Menampilkan jumlah masing-masing jenis pegawai
        Pegawai.printCountPegawai();
        Dosen.printCountDosen();
        Tendik.printCountTendik();
    }
}