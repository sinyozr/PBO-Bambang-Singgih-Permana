public class Motor {
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;

    public String getplatNomor() {
        return platNomor;
    }

    public void setplatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean getstatusMesin() {
        return statusMesin;
    }

    public void setstatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    public int getkecepatan() {
        return kecepatan;
    }

    public void setkecepatan(int kecepatan) {
        if (!this.statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan maksimal adalah 100");
        } else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif");
        } else {
            this.kecepatan = kecepatan;
        }
    }

    public void displayInfo() {
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Status Mesin: " + (this.statusMesin ? "ON" : "OFF"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("==============================");
    }

}