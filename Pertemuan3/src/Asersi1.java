/**
 * File : Asersi1.java
 * deskripsi : Program untuk menunjukan asersi
 * nama : Duta Adi Pamungkas
 * tanggal : 4 Februari 2025
 */

 public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if (x < 0){
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan code";
            System.out.println("x bilangan negatif");
        }
    }
}
