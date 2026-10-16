public class Dosen07 extends Pegawai07 {
    public String nidn;

    // public Dosen07() {
    //     System.out.println("Ini constructor class Dosen07");
    // }

    public Dosen07(String nip, String nama, double gaji, String nidn) {
        // System.out.println("Ini constructor class Dosen yang berparameter");

        // modif construktor berparameter percobaan-7
        super(nip, nama, gaji);
        super.nip = nip;
        super.nama = nama;
        super.gaji = gaji;
        this.nidn = nidn;
    }

    public String getInfo() {
        return "NIDN   : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}