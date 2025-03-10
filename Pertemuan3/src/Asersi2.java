/**
 * File : Asersi2.java
 * deskripsi : Program untuk menunjukan asersi jari2 ditolak jika bernilai nol
 * nama : Duta Adi Pamungkas
 * tanggal : 4 Februari 2025
 */

 // class lingkaran
 class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double  hitungKeliling   (){
        double keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}

//class asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jarijari = 0;
        assert (jarijari > 0) : "Jari-jari tidak boleh nol atau negatif";
        Lingkaran lingkaran1 = new Lingkaran(jarijari);
        double kelilingLingkaran = lingkaran1.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
//Pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas. Jelaskan pada lembar laporan praktikum! 
//Jawab : Program Asersi2.java kurang tepat karena asersi tidak aktif secara default di Java, sehingga tidak selalu mencegah jari-jari nol. Selain itu, asersi hanya bekerja jika program dijalankan dengan opsi -ea. Validasi lebih baik ditempatkan di konstruktor menggunakan IllegalArgumentException agar selalu berlaku dan memastikan nilai jari-jari valid dalam semua kondisi.
