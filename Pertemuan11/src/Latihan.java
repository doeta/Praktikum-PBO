//Nama File: Latihan.java
//Nama : Duta Adi Pamungkas
//NIM : 24060123140174

import java.util.HashMap;
import java.util.Map;

public class Latihan {
    public static void main(String[] args) {
        // Membuat Map dengan NIM sebagai key dan nama mahasiswa sebagai value
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24001", "Duta Ganteng 1");
        mahasiswaMap.put("24002", "Duta Ganteng 2");
        mahasiswaMap.put("24003", "Duta Ganteng 3");
        mahasiswaMap.put("24004", "Duta Ganteng 4");
        mahasiswaMap.put("24005", "Duta Ganteng 5");

        System.out.println("=== Daftar Mahasiswa ===");
        System.out.println("NIM\t\tNama Mahasiswa");
        System.out.println("------------------------");
        
        // Menggunakan lambda expression untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println(nim + "\t\t" + nama);
        });
        
        System.out.println("\n=== Alternatif Tampilan ===");
        // Alternatif lain menggunakan lambda expression
        mahasiswaMap.forEach((nim, nama) -> 
            System.out.printf("NIM: %s, Nama: %s%n", nim, nama)
        );
    }
}