/* Nama File    : Persegi.java
 * Deskripsi    : Ini merupakan class Persegi yang merupakan subclass dari class BangunDatar
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi){
       this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling(){
        return 4*sisi;
    }
    
    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }
}
