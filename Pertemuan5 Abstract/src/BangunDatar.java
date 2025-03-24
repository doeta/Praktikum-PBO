// Nama File: BangunDatar.java
// Deskripsi: Abstract class untuk representasi bangun datar
// Pembuat: Duta Adi Pamungkas
// Tanggal: 17-03-2025

public abstract class BangunDatar {
    // Atribut
    private int jmlSisi;  // Jumlah sisi
    private String warna; // Warna bangun datar
    private String border; // Jenis border

    // Konstruktor default
    public BangunDatar() {
        // Konstruktor kosong
    }

    // Konstruktor berparameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }
    
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }
    
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}