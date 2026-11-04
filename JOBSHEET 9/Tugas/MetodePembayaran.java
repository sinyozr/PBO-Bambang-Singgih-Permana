public abstract class MetodePembayaran {
    public String idTransaksi;
    public double jumlah;

    public abstract boolean prosesPembayaran();

    public abstract double hitungBiayaAdmin();

    public double hitungTotal() {
        return jumlah + hitungBiayaAdmin();
    }

    public void cetakStruk() {
        System.out.println("ID: " + idTransaksi);
        System.out.println("Total: " + hitungTotal());
    }
}