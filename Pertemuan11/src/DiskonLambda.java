//Nama File: DiskonLambda.java
//Nama : Duta Adi Pamungkas
//NIM : 24060123140174

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args){
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        //Dengan Lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}

//Perbedaan utama antara diskonLebaran dan diskonBiasa terletak pada cara penulisannya. 
//diskonLebaran ditulis dengan format singkat tanpa kurung kurawal dan tidak perlu kata return, 
//contohnya: (harga) -> harga - (harga * 0.4). 
//Sementara diskonBiasa ditulis dengan kurung kurawal dan harus pakai kata return: (harga) -> { return harga - (harga * 0.1); }. 
//Keduanya sama-sama berfungsi untuk menghitung diskon, 
//tapi yang pertama lebih praktis untuk perhitungan sederhana, sedangkan yang kedua cocok kalau mau nulis kode yang lebih panjang atau kompleks.
