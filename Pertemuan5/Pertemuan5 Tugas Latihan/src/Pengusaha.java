/* Nama File    : Pengusaha.java
 * Deskripsi    : Berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 17 Maret 2025
 */


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Pengusaha extends Manusia implements Pajak{ 
    private String npwp;
    private static int counterPengusaha;
    private int B = 7;

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return this.npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    @Override
    public double hitungPajak(){
        return getPendapatan() * 0.15;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP : " + getNpwp());
        System.out.println("Pajak : " + hitungPajak());
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public int HitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now())+B;
    }
}
