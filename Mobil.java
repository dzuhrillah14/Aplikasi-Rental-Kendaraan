public class Mobil extends Kendaraan {
    private int jmlRoda;

    public Mobil(String merk, String model, int tahunProduksi, int jmlRoda) {
        super(merk, model, tahunProduksi);
        this.jmlRoda = jmlRoda;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", Roda: " + jmlRoda + " (Mobil)";
    }
}
