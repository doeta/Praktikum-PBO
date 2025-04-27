public abstract class Pegawai {
    protected String nama;
    protected int gajiPokok;

    public Pegawai(String nama) {
        this.nama = nama;
        this.gajiPokok = 5000000;
    }

    public abstract void tampilData();
}
