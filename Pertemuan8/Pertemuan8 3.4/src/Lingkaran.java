/* Nama File    : Lingkaran.java
 * Deskripsi    : Ini merupakan class Lingkaran yang merupakan subclass dari class BangunDatar
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    public double getJejari() {
        return this.jejari;
    }

    public void setJejari(double jejari) {
        this.jejari = jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }

    @Override
    public double hitungLuas(){
        return jejari*jejari*3.14;
    }
}