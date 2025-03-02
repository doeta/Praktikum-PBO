/* Nama File    : Mahasiswa.java
* Deskripsi    : berisi atribut dan method dalam class Mahasiswa
* Pembuat      : Duta Adi Pamungkas
* Tanggal      : 25 Februari 2025
*/

import java.util.ArrayList;
public class Mahasiswa {

    /*************** ATRIBUT ***************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*************** METHOD ***************/
    
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>(); // Inisialisasi ArrayList kosong
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    // Getter dan Setter
    public String getNim() { 
        return nim; 
    }
    public void setNim(String nim) { this.nim = nim; }
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { this.nama = nama; }
    public String getProdi() { 
        return prodi; 
    }
    public void setProdi(String prodi) { this.prodi = prodi; }

    public Dosen getDosenWali() { 
        return dosenWali; 
    }
    public void setDosenWali(Dosen dosenWali) { this.dosenWali = dosenWali; }

    public Kendaraan getKendaraan() { 
        return kendaraan; 
    }
    public void setKendaraan(Kendaraan kendaraan) { this.kendaraan = kendaraan; }

    // Method untuk menambah mata kuliah
    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    // Method untuk mendapatkan jumlah mata kuliah
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    // Method untuk mendapatkan total SKS
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : listMatKul) {
            totalSKS += mk.getSks();
        }
        return totalSKS;
    }

    // Method untuk mencetak detail mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);

        System.out.println("\nDaftar Mata Kuliah:");
        for (MataKuliah mk : listMatKul) {
            System.out.println("- " + mk.getNama() + " (" + mk.getSks() + " SKS)");
        }

        if (dosenWali != null) {
            System.out.println("\nDosen Wali:");
            System.out.println("- Nama: " + dosenWali.getNama() + " (NIP: " + dosenWali.getNip() + ")");
        } else {
            System.out.println("\nDosen Wali: Belum ditentukan");
        }

        if (kendaraan != null) {
            System.out.println("\nKendaraan:");
            System.out.println("- Jenis: " + kendaraan.getJenis() + " (No. Plat: " + kendaraan.getNoPlat() + ")");
        } else {
            System.out.println("\nKendaraan: Tidak ada");
        }
    }
}
