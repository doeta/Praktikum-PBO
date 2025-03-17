/* Nama File    : Tendik.java
* Deskripsi    : berisi atribut dan method dalam class Tendik
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 11 Maret 2025
*/
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Kelas Tendik (Turunan dari Pegawai)
class Tendik extends Pegawai {
    // Atribut
    private String bidang;
    private int BUP;
    private static int countTendik;

    // Konstruktor
    public Tendik() {
        super();
        this.BUP = 55; // Usia standar BUP untuk tendik
        countTendik++;
    }

    public Tendik(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
        this.BUP = 55; // Usia standar BUP untuk tendik
        countTendik++;
    }

    // Getter dan Setter
    public String getBidang() {
        return bidang;
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
        return 0.01 * tahun * getGajiPokok();
    }

    // Metode
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang        : " + bidang);
        System.out.println("BUP           : " + new SimpleDateFormat("dd MMMM yyyy").format(getHitungBUP()));
        System.out.println("Tunjangan     : Rp " + String.format("%,.2f", getHitungTunjangan()));
    }

    // Menampilkan jumlah tendik
    public static void printCountTendik() {
        System.out.println("Jumlah Tendik : " + countTendik);
    }
}
