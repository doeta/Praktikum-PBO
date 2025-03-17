/* Nama File    : DosenTamu.java
* Deskripsi    : berisi atribut dan method dalam class DosenTamu
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 11 Maret 2025
*/
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


// Kelas DosenTamu (Turunan dari Dosen)
class DosenTamu extends Dosen {
    // Atribut
    private String NIDK;
    private int kontrakKerja;

    // Konstruktor
    public DosenTamu() {
        super();
    }

    public DosenTamu(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String Fakultas, String NIDK, int kontrakKerja) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.kontrakKerja = kontrakKerja;
    }

    // Getter dan Setter
    public String getNIDK() {
        return NIDK;
    }

    public int getKontrakKerja() {
        return kontrakKerja;
    }

    public void setKontrakKerja(int kontrakKerja) {
        this.kontrakKerja = kontrakKerja;
    }

    // Menghitung akhir kontrak
    public Date getAkhirKontrak() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getTMT());
        cal.add(Calendar.MONTH, kontrakKerja);
        return cal.getTime();
    }

    // Menghitung tunjangan
    public double getHitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    // Metode
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK          : " + NIDK);
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("Kontrak Kerja : " + kontrakKerja + " bulan");
        System.out.println("Akhir Kontrak : " + new SimpleDateFormat("dd MMMM yyyy").format(getAkhirKontrak()));
        System.out.println("Tunjangan     : Rp " + String.format("%,.2f", getHitungTunjangan()));
    }
}
