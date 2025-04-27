/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Berisi atribut dan method dalam class CivitasAkademika
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 25 Maret 2025
 */
public abstract class CivitasAkademika {
    private String nama;
    private String email;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public abstract void displayInfo();
}
