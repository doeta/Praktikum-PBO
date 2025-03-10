/**
 * File : ExceptionOnArray.java
 * deskripsi : Program penggunaan eksepsi meggunakan class library java
 * nama : Duta Adi Pamungkas
 * tanggal : 4 Februari 2025
 */

 public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
