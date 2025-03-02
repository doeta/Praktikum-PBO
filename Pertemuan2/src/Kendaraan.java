/* Nama File    : Kendaraan.java
* Deskripsi    : berisi atribut dan method dalam class Kendaraan
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 25 Februari 2025
*/

public class Kendaraan {
    private String noPlat;
    private String jenis;

    // Konstruktor tanpa parameter
    public Kendaraan() {}

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Selektor
    public String getNoPlat(){
        return noPlat;
    }
    public String getJenis(){
        return jenis;
    }
    
    //Mutator
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    // Method untuk mencetak data kendaraan
    public void printKendaraan() {
        System.out.println("Kendaraan: " + jenis + " (No. Plat: " + noPlat + ")");
    }
}
