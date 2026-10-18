public class Kendaraan {
    protected String merk;
    protected int tahunProduksi;
    protected int kapasitasMesin;

    public void nyalakanMesin() {
        System.out.println("Mesin kendaraan dinyalakan");
    }

    public void matikanMesin() {
        System.out.println("Mesin kendaraan dimatikan");
    }
}