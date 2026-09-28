import java.util.ArrayList;

public class Perpustakaan {

    private ArrayList<Peminjaman> daftarPeminjaman;

    public Perpustakaan() {
        daftarPeminjaman = new ArrayList<>();
    }

    public void tambahPeminjaman(Peminjaman peminjaman) {
        daftarPeminjaman.add(peminjaman);
    }

    public void tampilkanSemuaPeminjaman() {

        if (daftarPeminjaman.isEmpty()) {
            System.out.println("Belum ada peminjaman.");
            return;
        }

        for (Peminjaman peminjaman : daftarPeminjaman) {
            System.out.println("-------------------------");
            System.out.println(peminjaman.getInfo());
        }
    }
}