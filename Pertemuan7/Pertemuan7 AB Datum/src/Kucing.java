/* Nama File    : Kucing.java
 * Deskripsi    : Brisi class Kucing yang merupakan subclass dari Anabul
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 22 April 2025
 */
public class Kucing extends Anabul{   
    public Kucing(String nama){
        setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Kucing : Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Kucing : Meong");
    }
}