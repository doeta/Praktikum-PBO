/* Nama File    : Segitiga.java
 * Deskripsi    : Ini merupakan class Segitiga yang merupakan subclass dari class BangunDatar
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public class Segitiga extends BangunDatar{
    //asumsikan segitiga sama sisi
    private double sisi;
    private double tinggi;
    
    public Segitiga(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungKeliling(){
        return 3*sisi;
    }
    
    @Override
    public double hitungLuas(){
        return (sisi*tinggi)/2;
    }
    
}
