/* Nama File    : Karyawan.java
 * Deskripsi    : Berisi atribut dan method dalam class Karyawan
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 25 Maret 2025
 */
public abstract class Karyawan extends CivitasAkademika {
    private String NIP;
    private int masaKerja;

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public int getMasaKerja() {
        return masaKerja;
    }
}
