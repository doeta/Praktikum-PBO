// Nama File: IResize.java
// Deskripsi: Interface untuk objek yang dapat di-resize
// Pembuat: Duta Adi Pamungkas
// Tanggal: 17-03-2025
public interface IResize {
    // Method untuk memperbesar ukuran sebesar 10%
    void zoomIn();

    // Method untuk memperkecil ukuran sebesar 10%
    void zoomOut();

    // Method untuk menskalakan ukuran berdasarkan persentase yang diberikan
    void zoom(int percent);
}