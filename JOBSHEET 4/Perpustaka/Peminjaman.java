import java.time.LocalDate;

public class Peminjaman {

    private String idPeminjaman;
    private Anggota anggota;
    private Buku buku;
    private LocalDate tanggal;

    public Peminjaman(String idPeminjaman,
                      Anggota anggota,
                      Buku buku,
                      LocalDate tanggal) {

        this.idPeminjaman = idPeminjaman;
        this.anggota = anggota;
        this.buku = buku;
        this.tanggal = tanggal;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getInfo() {
        return "ID Peminjaman : " + idPeminjaman +
               "\nAnggota       : " + anggota.getNama() +
               "\nBuku          : " + buku.getJudul() +
               "\nTanggal       : " + tanggal;
    }
}