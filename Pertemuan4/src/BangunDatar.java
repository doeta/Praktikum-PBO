/* Nama File    : BangunDatar.java
* Deskripsi    : berisi atribut dan method dalam class Bangundatar
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 11 Maret 2025
*/
public class BangunDatar {
    // Atribut
    protected int jmlSisi;  // Jumlah sisi
    protected String warna; // Warna bangun datar
    protected String border; // Jenis border
    private static int countBangunDatar = 0; //Jumlah objek BangunDatar yang telah dibuat
    // Konstruktor default
    public BangunDatar() {
        // Konstruktor kosong
    }
    
    //Konstruktor berpamaeter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

     // Getter dan Setter untuk jmlSisi
     public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Getter dan Setter untuk warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter dan Setter untuk border
    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Method untuk menampilkan informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // Method untuk menampilkan jumlah objek BangunDatar yang telah dibuat
    public static void printCountBangunDatar() {
        System.out.println("Jumlah objek BangunDatar yang telah dibuat: " + countBangunDatar);
    }
}
