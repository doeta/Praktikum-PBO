/* Nama File    : Dosen.java
 * Deskripsi    : Berisi atribut dan method dalam class Dosen
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 25 Maret 2025
 */
public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int countDosen = 0;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        countDosen++;
    }

    public double hitungGaji() {
        return fakultas.getGajiPokok() * (1 + 0.01 * super.getMasaKerja());
    }

    @Override
    public void displayInfo() {
        System.out.println("Dosen:");
        System.out.println("Nama: " + super.getNama());
        System.out.println("Email: " + super.getEmail());
        System.out.println("NIP: " + super.getNIP());
        System.out.println("Masa Kerja: " + super.getMasaKerja() + " tahun");
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.printf("Gaji: Rp%,.2f\n", hitungGaji());
        System.out.println("-------------------");
    }

    public static int getCountDosen() {
        return countDosen;
    }
}
