/**
 * File : AngkaSial.java
 * deskripsi : Program menggunakan exception sendiri untuk menolak angka 13
 * pengenalan klausa 'throw' dan 'throws'
 * nama : Duta Adi Pamungkas
 * tanggal : 4 Februari 2025
 */

 public class AngkaSial {
    public void  cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(13);
            as.cobaAngka(10);
            as.cobaAngka(12);
        } catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("angka sial tidak boleh dimasukan");
        }
    }
}
//Pertanyaan : 
//1.Ketika eksepsi terjadi, apakah baris 14 pada AngkaSial.java di atas dieksekusi?  
//2.Apakah baris 23 pada AngkaSial.java di atas dieksekusi?  

// Jawab :  
// 1. Baris 14 tidak dieksekusi karena saat angka 13 dimasukkan, eksepsi langsung dilempar sehingga eksekusi metode terhenti sebelum mencapai baris tersebut.  
// 2. Baris 23 dieksekusi karena berada di dalam blok catch yang menangani eksepsi yang dilempar saat angka 13 dimasukkan.  

//Note :
//itu untuk barisnya saya ubah menyesuaikan dengan kode yang saya, seharusnya kan pertanyaanya baris 12 daan 21.