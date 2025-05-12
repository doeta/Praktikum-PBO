/* Nama File    : Pegawai.java
 * Deskripsi    : Berisi class programmer yang merupakan subclass dari class Pegawai
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama) {
        super(nama); // panggil konstruktor Pegawai
        this.bonus = 450000;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Bonus : " + bonus);
    }
}
