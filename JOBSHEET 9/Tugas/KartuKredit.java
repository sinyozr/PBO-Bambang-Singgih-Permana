public class KartuKredit extends MetodePembayaran {
    private String nomorKartu;
    private String namaPemegang;
    private double limitKredit;

    @Override
    public boolean prosesPembayaran() {
        return true;
    }

    @Override
    public double hitungBiayaAdmin() {
        return jumlah * 0.02;
    }
}