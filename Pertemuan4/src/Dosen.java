/* Nama File    : Dosen.java
* Deskripsi    : berisi atribut dan method dalam class Dosen
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 11 Maret 2025
*/
// Kelas Dosen (Turunan dari Pegawai)
class Dosen extends Pegawai {
    // Atribut
    private String Fakultas;
    private static int countDosen;

    // Konstruktor
    public Dosen() {
        super();
        countDosen++;
    }

    public Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String Fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
        countDosen++;
    }

    // Getter dan Setter
    public String getFakultas() {
        return Fakultas;
    }

    // Metode
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas      : " + Fakultas);
    }

    // Menampilkan jumlah dosen
    public static void printCountDosen() {
        System.out.println("Jumlah Dosen  : " + countDosen);
    }
}
