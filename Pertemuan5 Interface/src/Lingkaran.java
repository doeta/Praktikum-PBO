// Nama File: Lingkaran.java
// Deskripsi: Class untuk representasi lingkaran
// Pembuat: Duta Adi Pamungkas
// Tanggal: 17-03-2025

public class Lingkaran extends BangunDatar implements IResize{
    private double jari; 

    public Lingkaran() {
        setJmlSisi(0); 
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border); 
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJariJari(double jariJari) {
        this.jari = jariJari;
    }

    // Implementasi method getLuas()
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Implementasi method getKeliling()
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // Implementasi method dari IResize
    @Override
    public void zoomIn() {
        jari = jari * 1.1; 
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9; 
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100; 
    }

    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}