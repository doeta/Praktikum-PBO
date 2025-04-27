/* Nama File    : Tendik.java
 * Deskripsi    : Berisi atribut dan method dalam class Tendik
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 25 Maret 2025
 */
public class Tendik extends Karyawan {
    private static int countTendik = 0;
    private static final double GAJI_POKOK = 4000000;

    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        countTendik++;
    }

    public double hitungGaji() {
        return GAJI_POKOK * (1 + 0.01 * super.getMasaKerja());
    }

    @Override
    public void displayInfo() {
        System.out.println("Tendik:");
        System.out.println("Nama: " + super.getNama());
        System.out.println("Email: " + super.getEmail());
        System.out.println("NIP: " + super.getNIP());
        System.out.println("Masa Kerja: " + super.getMasaKerja() + " tahun");
        System.out.printf("Gaji: Rp%,.2f\n", hitungGaji());
        System.out.println("-------------------");
    }

    public static int getCountTendik() {
        return countTendik;
    }
}
