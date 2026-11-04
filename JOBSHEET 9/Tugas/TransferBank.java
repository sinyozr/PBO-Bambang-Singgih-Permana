public class TransferBank extends MetodePembayaran {
    private String namaBank;
    private String nomorRekening;
    private String atasNama;

    @Override
    public boolean prosesPembayaran() {
        return true;
    }

    @Override
    public double hitungBiayaAdmin() {
        return 2500;
    }
}