//Nama File: LambdaList.java
//Nama : Duta Adi Pamungkas
//NIM : 24060123140174

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //Lambda digunaan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
    
}