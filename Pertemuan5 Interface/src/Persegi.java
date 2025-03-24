// Nama File: Persegi.java
// Deskripsi: Class untuk representasi persegi
// Pembuat: Duta Adi Pamungkas
// Tanggal: 17-03-2025

public class Persegi extends BangunDatar implements IResize{
    private double sisi; 

    // Konstruktor default
    public Persegi() {
        setJmlSisi(4); 
    }

    // Konstruktor berparameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border); 
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi method getLuas()
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    // Implementasi method getKeliling()
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // Implementasi method dari IResize
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1; // Memperbesar sisi sebesar 10%
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9; // Memperkecil sisi sebesar 10%
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100; // Menskalakan sisi berdasarkan persentase
    }
    
    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}