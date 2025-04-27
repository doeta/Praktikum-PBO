/* Nama File    : Burung.java
 * Deskripsi    : Brisi class Burung yang merupakan subclass dari Anabul
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 22 April 2025
 */
public class Burung extends Anabul{
    public Burung(String nama){
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Burung : Terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Burung : Cuit");
    }
}