/* Nama File    : Dosen.java
* Deskripsi    : berisi atribut dan method dalam class Dosen
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 25 Februari 2025
*/
public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    // Konstruktor tanpa parameter
    public Dosen() {}

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi;
    }

    //Mutator
    public void setNip(String nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    // Method untuk mencetak data dosen
    public void printDosen() {
        System.out.println("Dosen Wali: " + nama + " (NIP: " + nip + ", Prodi: " + prodi + ")");
    }
}