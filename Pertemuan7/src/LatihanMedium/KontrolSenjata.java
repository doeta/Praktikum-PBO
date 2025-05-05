/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMedium;

/**
 *
 * @author dutaa
 */
public class KontrolSenjata{
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        if (senjata.getPeluru() <= 0){
            System.out.println("Peluru habis");
            return false;
        } else {
            senjata.setPeluru(senjata.getPeluru()- 1);
            return true;
        }
    }
    
    public int isiPeluru(int jumPeluru){
        int total = senjata.getPeluru() + jumPeluru;
        senjata.setPeluru(total);
        System.out.println("Peluru berhasil ditambah " + jumPeluru);
        return total;
    }
    
    public int menembak(int jumlah){
        int total = senjata.getPeluru() - jumlah;
        System.out.println("Siap, menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
            } else {
                break;
            }
        }
        return total;
    }
    
    public void menusuk(){
        if (senjata.isMenusuk()){
            System.out.println("Aku tusuk nih");
        } else {
            System.out.println("Aduh tumpul, gabisa tusuk");
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
    }
}