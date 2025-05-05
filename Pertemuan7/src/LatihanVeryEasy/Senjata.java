/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanVeryEasy;

/**
 *
 * @author dutaa
 */
public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0; // Inisialisasi peluru ke 0
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public int getPeluru() { // Ubah dari private ke public
        return peluru;
    }

    public void setPeluru(int peluru) { // Ubah dari private ke public
        this.peluru = peluru;
    }

    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi); // Cetak suara senjata
            peluru--; // Kurangi peluru sebanyak 1
        } else {
            System.out.println("Peluru habis!");
        }
    }
}