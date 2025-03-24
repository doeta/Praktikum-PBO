// Nama File: Persegi.java
// Deskripsi: Class untuk representasi persegi
// Pembuat: Duta Adi Pamungkas
// Tanggal: 17-03-2025
public class Persegi extends BangunDatar {
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


    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
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