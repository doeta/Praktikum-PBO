/* Nama File    : Anjing.java
 * Deskripsi    : berikan class Anjing yang merupakan subclass dari Anabul
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 * Tanggal      : 22 April 2025
 */
public class Anjing extends Anabul{
    public Anjing(String nama){
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Anjing : Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Anjing : Guk-guk");
    }
}