public class Penyewa {
    private String namaPenyewa;
    private Kendaraan kendaraanDisewa;

    public Penyewa(String namaPenyewa, Kendaraan kendaraanDisewa) {
        this.namaPenyewa = namaPenyewa;
        this.kendaraanDisewa = kendaraanDisewa;
    }

    public void tampilkanInfoSewa() {
        System.out.println("Penyewa: " + namaPenyewa + " | Menyewa -> " + kendaraanDisewa.getDetail());
    }
}
