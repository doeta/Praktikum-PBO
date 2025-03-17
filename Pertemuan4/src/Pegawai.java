/* Nama File    : Pegawai.java
* Deskripsi    : berisi atribut dan method dalam class Pegawai
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 11 Maret 2025
*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Kelas Pegawai
public class Pegawai {
    // Atribut
    private double gajiPokok;
    private String NIP;
    private String nama;
    private Date tanggalLahir;
    private Date TMT;
    private static int countPegawai;

    // Konstruktor
    public Pegawai() {
        countPegawai++;
    }

    public Pegawai(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        // Konversi String ke Date
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.tanggalLahir = dateFormat.parse(tanggalLahir);
            this.TMT = dateFormat.parse(TMT);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.gajiPokok = gajiPokok;
        countPegawai++;
    }

    // Getter dan Setter
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public Date getTMT() {
        return TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Metode
    public void printInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println("NIP           : " + NIP);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + dateFormat.format(tanggalLahir));
        System.out.println("TMT           : " + dateFormat.format(TMT));
        System.out.println("Gaji Pokok    : Rp " + String.format("%,.2f", gajiPokok));
    }

    // Menghitung masa kerja dalam tahun dan bulan
    public String getHitungMasaKerja() {
        Date sekarang = new Date();
        long diffInMillies = Math.abs(sekarang.getTime() - TMT.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        int tahun = (int) (diff / 365);
        int bulan = (int) ((diff % 365) / 30);

        return tahun + " tahun " + bulan + " bulan";
    }

    // Menampilkan jumlah pegawai
    public static void printCountPegawai() {
        System.out.println("Jumlah Pegawai: " + countPegawai);
    }
}
