public class ContohMetodeGenerik {
    // Metode generik untuk mengendalikan Datum
    public static <T extends Anabul> void kendalikanDatum(Datum<T> datum) {
        T hewan = datum.getIsi();
        hewan.getNama();
        hewan.gerak();
        hewan.bersuara();
        System.out.println();
    }
}