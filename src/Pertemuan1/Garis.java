/* Nama File    : Garis.java
* Deskripsi    : berisi atribut dan method dalam class Garis
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 18 Februari 2025
*/

package Pertemuan1;
public class Garis {
    /* 1.Atribut Garis terdiri atas titik awal dan titik akhir yang masing-masing bertipe Titik. 
         Tambahkan pula atribut static counterGaris untuk menyimpan banyaknya objek garis yang pernah dibuat. */ 
    Titik T0;
    Titik T1;
    static int counterGaris = 0;
    
    /* 2. Method Garis terdiri atas: */
    // a. Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1).
    Garis(){
        T0 = new Titik();
        T1 = new Titik(1,1);
        counterGaris++;
    }
    // b. Konstruktor dengan parameter masukan titik awal dan titik akhir.
    Garis(Titik T0, Titik T1){
        this.T0 = T0;
        this.T1 = T1;
        counterGaris++;
    }
    // c. Selektor (getter) untuk setiap atribut beserta mutatornya (setter). Tambahkan pula selektor untuk mendapatkan atribut static counterGaris.
    // Mengembalikan nilai Titik awal
    Titik getTitikAwal(){
        return T0;
    }
    // Mengembalikan nilai Titik akhir
    Titik getTitikAkhir(){
        return T1;
    }
    // Mengubah nilai Titik awal
    void setTitikAwal(Titik T0){
        this.T0 = T0;
    }
    // Mengubah nilai Titik akhir
    void setTitikAkhir(Titik T1){
        this.T1 = T1;
    }
    // Mengembalikan nilai counterGaris
    static int getCounterGaris() {
        return counterGaris;
    }
    // Menampilkan garis
    void printGaris() {
        System.out.println("Garis (" + T0.getAbsis() + ", " + T0.getOrdinat() + "),(" + T1.getAbsis() + ", " + T1.getOrdinat() + ")" );
    }
    // Menampilkan countGaris
    void printCounterGaris(){
        System.out.println("Jumlah Objek Garis : " + Garis.counterGaris);
    }
    // d. Method untuk mendapatkan panjang sebuah garis.
    double getPanjang(){
        double dx = T1.getAbsis() - T0.getAbsis();
        double dy = T1.getOrdinat() - T0.getOrdinat();
        return Math.sqrt(dx*dx + dy*dy);
    }
    // e. Method untuk mendapatkan gradien dari sebuah garis.
    double getGradien(){
        double dx = T1.getAbsis() - T0.getAbsis();
        double dy = T1.getOrdinat() - T0.getOrdinat();
        if(dx != 0){
            return dy/dx;
        }
        else{
            return 0;
        }
    }
    // f. Method untuk mendapatkan titik tengah dari sebuah garis.
    Titik getTitikTengah(){
        double dx = (T0.getAbsis() + T1.getAbsis())/2;
        double dy = (T0.getOrdinat() + T1.getOrdinat())/2;
        return new Titik(dx, dy);
    }
    // g. Method untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya.
    boolean isSejajar(Garis G){
        double gradien1 = this.getGradien();
        double gradien2 = G.getGradien();
        return gradien1 == gradien2;
    }
    // h. Method untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya.
    boolean isTegakLurus(Garis G){
        double gradien1 = this.getGradien();
        double gradien2 = G.getGradien();
        return (gradien1 * gradien2) == -1;
    }
    // i. Method untuk menampilkan ke layar titik awal dan titik akhir garis.
    void tampilTitikGaris(){
        System.out.println("Titik Awal : (" + T0.getAbsis() + ", " + T0.getOrdinat() + ")");
        System.out.println("Titik Akhir : (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");
    }
    // j. Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c. Contoh: garis yang dibuat dari titik (-2,0) dan (0,4) mempunyai persamaan garis y = 2x + 4.
    void persamaanGaris(){
        double m = getGradien();
        double c = T0.getOrdinat() - (m * T0.getAbsis());
        System.out.println("y = " + m + "x + " + c);
    }
}
