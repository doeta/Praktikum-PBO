/* Nama File    : Manager.java
 * Deskripsi    : Berisi class Manager yang merupakan subclass dari class Pegawai
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */

public class Manager extends Pegawai {
    private int tunjangan;

    public Manager(String nama) {
        super(nama); // panggil konstruktor Pegawai
        this.tunjangan = 700000;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
    }
}
