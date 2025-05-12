/* Nama File    : Koleksi.java
 * Deskripsi    : Ini merupakan class Koleksi yang merupakan class untuk menyimpan data string
 * Pembuat      : Duta Adi Pamungkas
 * NIM          : 24060123140174
 */
public class Koleksi {
    private int nbElm;
    private String[] wadah;

    public Koleksi(int slot) {
        wadah = new String[slot];
        nbElm = 0;
    }

    public String[] getWadah() {
        return wadah;
    }

    public void setWadah(String[] wadah) {
        this.wadah = wadah;
    }

    public String getIsi(int index) throws Eksepsi {
        if (index >= 0 && index < getSize()) {
            return wadah[index];
        } else {
            throw new Eksepsi("Diluar slot wadah!");
        }
    }

    public void setIsi(int index, String a) throws Eksepsi {
        if (index >= 0 && index < wadah.length) {
            wadah[index] = a;
        } else {
            throw new Eksepsi("Diluar slot wadah!");
        }
    }

    public int getSize() {
        return nbElm;
    }

    public void setSize(int size) throws Eksepsi {
        if (size >= 0 && size <= wadah.length) {
            nbElm = size;
        } else {
            throw new Eksepsi("Melebihi wadah");
        }
    }

    public void add(String isi) throws Eksepsi {
        if (getSize() <= wadah.length) {
            setIsi(getSize(), isi);
            setSize(getSize() + 1);
        } else {
            throw new Eksepsi("Wadah penuh!");
        }
    }

    public String delete(String isi) throws Eksepsi {
        int index = -1;
        String backup = null;
        for (int i = 0; i < getSize(); i++) {
            if (wadah[i].equals(isi)) {
                index = i;
                backup = wadah[i];
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < getSize() - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            setSize(getSize() - 1);
            System.out.println("Berhasil dihapus");
            return backup;
        } else {
            System.out.println("Gagal menghapus");
            return null;
        }
    }

    public void showAll() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(wadah[i]);
        }
    }
}
