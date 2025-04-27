/* Nama File    : Mahasiswa.java
 * Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 25 Maret 2025
 */
public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    private static int countMahasiswa = 0;

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        countMahasiswa++;
    }

    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    @Override
    public void displayInfo() {
        System.out.println("Mahasiswa:");
        System.out.println("Nama: " + super.getNama());
        System.out.println("Email: " + super.getEmail());
        System.out.println("NIM: " + NIM);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.printf("UKT: Rp%,.2f\n", hitungUKT());
        System.out.println("-------------------");
    }

    public static int getCountMahasiswa() {
        return countMahasiswa;
    }
}