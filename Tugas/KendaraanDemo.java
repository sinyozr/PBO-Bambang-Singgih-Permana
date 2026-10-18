public class KendaraanDemo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.merk = "Toyota";
        mobil.tahunProduksi = 2024;
        mobil.kapasitasMesin = 1500;

        System.out.println("=== MOBIL ===");
        System.out.println("Merk: " + mobil.merk);
        System.out.println("Tahun Produksi: " + mobil.tahunProduksi);
        System.out.println("Kapasitas Mesin: " + mobil.kapasitasMesin);

        mobil.nyalakanMesin();
        mobil.bukaPintu();
        mobil.matikanMesin();

        Motor motor = new Motor();
        motor.merk = "Honda";
        motor.tahunProduksi = 2025;
        motor.kapasitasMesin = 150;

        System.out.println("\n=== MOTOR ===");
        System.out.println("Merk: " + motor.merk);
        System.out.println("Tahun Produksi: " + motor.tahunProduksi);
        System.out.println("Kapasitas Mesin: " + motor.kapasitasMesin);

        motor.nyalakanMesin();
        motor.wheelie();
        motor.matikanMesin();
    }
}