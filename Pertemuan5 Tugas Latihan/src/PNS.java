/* Nama File    : PNS.java
 * Deskripsi    : Berisi atribut dan method dalam class PNS
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 17 Maret 2025

 */


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS;
    private int A = 4;

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int HitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now())+A;
    }

    @Override
    public double hitungPajak(){
        return getPendapatan() * 0.1;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP : " + getNip());
        System.out.println("Masa Kerja : " + HitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}
