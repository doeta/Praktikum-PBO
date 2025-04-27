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
