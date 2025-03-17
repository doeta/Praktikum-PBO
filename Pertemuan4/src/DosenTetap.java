/* Nama File    : DosenTetap.java
* Deskripsi    : berisi atribut dan method dalam class DosenTetap
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 11 Maret 2025
*/
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Kelas DosenTetap (Turunan dari Dosen)
class DosenTetap extends Dosen {
    // Atribut
    private String NIDN;
    private int BUP;

    // Konstruktor
    public DosenTetap() {
        super();
        this.BUP = 65; // Usia standar BUP untuk dosen tetap
    }

    public DosenTetap(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String Fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
        this.BUP = 65; // Usia standar BUP untuk dosen tetap
    }

    // Getter dan Setter
    public String getNIDN() {
        return NIDN;
    }

    // Menghitung BUP
    public Date getHitungBUP() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getTanggalLahir());
        cal.add(Calendar.YEAR, BUP);
        cal.set(Calendar.DAY_OF_MONTH, 1); // BUP jatuh pada tanggal 1 bulan berikutnya
        cal.add(Calendar.MONTH, 1);
        return cal.getTime();
    }

    // Menghitung tunjangan
    public double getHitungTunjangan() {
        long diffInMillies = Math.abs(new Date().getTime() - getTMT().getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        int tahun = (int) (diff / 365);
        return 0.02 * tahun * getGajiPokok();
    }

    // Metode
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN          : " + NIDN);
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Masa Kerja    : " + getHitungMasaKerja());
        System.out.println("BUP           : " + new SimpleDateFormat("dd MMMM yyyy").format(getHitungBUP()));
        System.out.println("Tunjangan     : Rp " + String.format("%,.2f", getHitungTunjangan()));
    }
}
