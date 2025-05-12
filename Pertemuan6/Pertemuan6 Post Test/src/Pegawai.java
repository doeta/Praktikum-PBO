/* Nama File    : Pegawai.java
 * Deskripsi    : Berisi class Pegawai yang merupakan superclass dari class Manager
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public abstract class Pegawai {
    protected String nama;
    protected int gajiPokok;

    public Pegawai(String nama) {
        this.nama = nama;
        this.gajiPokok = 5000000;
    }

    public abstract void tampilData();
}
