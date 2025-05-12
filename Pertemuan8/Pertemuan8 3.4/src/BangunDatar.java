/* Nama File    : BangunDatar.java
 * Deskripsi    : Ini merupakan class abstrak yang berisi method abstract
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
import java.util.Iterator;
public abstract class BangunDatar {
    public abstract double hitungKeliling();
    
    public abstract double hitungLuas();

    Iterator<BangunDatar> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}