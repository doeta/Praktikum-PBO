/* Nama File    : Petani.java
 * Deskripsi    : Berisi atribut dan method dalam class Petani
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 17 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani;
    private int C = 1;

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsal_kota(){
        return this.asal_kota;
    }   

    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota : " + getAsal_kota());
        System.out.println("Pajak : " + hitungPajak());
    }

    @Override
    public int HitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now())+C;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }
}
