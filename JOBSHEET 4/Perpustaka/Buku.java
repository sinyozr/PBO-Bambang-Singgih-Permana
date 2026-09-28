public class Buku {

    private String idBuku;
    private String judul;
    private String penulis;
    private boolean tersedia;

    public Buku(String idBuku, String judul, String penulis) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tersedia = true;
    }

    // Getter untuk mengambalikann nilai
    public String getIdBuku() {
        return idBuku;
    }

    // Setter untuk mengisi / perbarui nilai
    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void pinjamBuku() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Buku berhasil dipinjam.");
        } else {
            System.out.println("Buku sedang tidak tersedia.");
        }
    }

    public void kembalikanBuku() {
        tersedia = true;
        System.out.println("Buku berhasil dikembalikan.");
    }

    public String getInfo() {
        return "ID Buku    : " + idBuku +
               "\nJudul      : " + judul +
               "\nPenulis    : " + penulis +
               "\nTersedia   : " + tersedia;
    }
}