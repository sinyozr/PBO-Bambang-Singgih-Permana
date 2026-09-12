public class Anggota {

    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return this.nama;
    }

    public int getLimitPinjaman() {
        return this.limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return this.jumlahPinjaman;
    }

    public void pinjam(int nominal) {

        if (this.jumlahPinjaman + nominal > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    public void angsur(int nominal) {

        int batasMinimal = (int) (this.jumlahPinjaman * 0.1);

        if (nominal < batasMinimal) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            this.jumlahPinjaman -= nominal;
        }
    }
}