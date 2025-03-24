/* Nama File    : Manusia.java
 * Deskripsi    : Berisi atribut dan method dalam class Manusia
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 17 Maret 2025
 */

import java.time.LocalDate;
public abstract class Manusia {
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns;

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTgl_mulai_kerja() {
        return this.tgl_mulai_kerja;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public void cetakInfo(){
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Mulai Kerja : " + getTgl_mulai_kerja());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Pendapatan : " + getPendapatan());
    }
    
    public static int getCounterMns() {
        return counterMns;
    }

    public abstract int HitungMasaKerja();
}
