public class Ewallet extends MetodePembayaran {
    private String penyedia;
    private String nomorHp;
    private double saldo;

    @Override
    public boolean prosesPembayaran() {
        return true;
    }

    @Override
    public double hitungBiayaAdmin() {
        return 1000;
    }
}