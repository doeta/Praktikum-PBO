    /* Nama File    : Titik.java
    * Deskripsi    : berisi atribut dan method dalam class Titik
    * Pembuat      : Duta Adi Pamungkas
    * Tanggal      : 18 Februari 2025
    */
package Pertemuan1;
public class Titik {
    /* States/Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* Behavior/Method */
    // Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }
    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }
    // mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }
    // Mengubah nilai absis
    void setAbsis(double x) {
        this.absis = x;
    }
    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        this.ordinat = y;
    }
    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }
    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
    // Menampilkan countertitik
    void printCounterTitik(){
        System.out.println("Jumlah Objek Titik : " + Titik.counterTitik);
    }
    // Mendapatkan kuadran titik
    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if(absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if(absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }
    // Mendapatkan jarak dari titik ke pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }
    // Mendapatkan jarak antara titik ini dengan titik lain
    double getJarak(Titik T) {
        double dx = this.absis - T.absis;
        double dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }
    // Merefleksikan titik terhadap sumbu X
    void refleksIX() {
        ordinat = -ordinat;
    }
    // Merefleksikan titik terhadap sumbu Y
    void refleksIY() {
        absis = -absis;
    }
    // Mendapatkan titik hasil refleksi terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }
    // Mendapatkan titik hasil refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }   
}
// end class Titik