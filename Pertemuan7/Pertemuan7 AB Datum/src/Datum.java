/* Nama File    : Datum.java
 * Deskripsi    : berisi class Datum yang merupakan class generik
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public class Datum<T> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }
}