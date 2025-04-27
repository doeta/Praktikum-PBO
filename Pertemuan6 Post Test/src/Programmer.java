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
