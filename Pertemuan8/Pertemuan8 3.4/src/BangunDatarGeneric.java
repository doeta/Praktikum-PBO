/* Nama File    : BangunDatarGeneric.java
 * Deskripsi    : Ini merupakan class generik yang digunakan untuk menampung objek bangun datar
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }
    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
    
    public double hitungluas(){
        return bangunDatar.hitungLuas();
    }

}

