
import java.time.LocalDate;

public class DemoPerpustakaan {

    public static void main(String[] args) {

        // 1. Membuat satu anggota
        Anggota anggota1 = new Anggota(
            "A001", "Budi", "Malang"
        );

        // 2. Membuat tiga buku berbeda
        Buku buku1 = new Buku(
            "B001", "Pemrograman Java", "Andi"
        );

        Buku buku2 = new Buku(
            "B002", "Basis Data", "Rudi"
        );

        Buku buku3 = new Buku(
            "B003", "Jaringan Komputer", "Doni"
        );

        // 3. Membuat objek perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // 4. Meminjam ketiga buku
        buku1.pinjamBuku();
        buku2.pinjamBuku();
        buku3.pinjamBuku();

        // 5. Membuat tiga transaksi peminjaman
        Peminjaman peminjaman1 = new Peminjaman(
            "P001", anggota1, buku1, LocalDate.now()
        );

        Peminjaman peminjaman2 = new Peminjaman(
            "P002", anggota1, buku2, LocalDate.now()
        );

        Peminjaman peminjaman3 = new Peminjaman(
            "P003", anggota1, buku3, LocalDate.now()
        );

        // 6. Menyimpan semua transaksi
        perpustakaan.tambahPeminjaman(peminjaman1);
        perpustakaan.tambahPeminjaman(peminjaman2);
        perpustakaan.tambahPeminjaman(peminjaman3);

        // 7. Menampilkan semua transaksi
        System.out.println("\n=== DATA PEMINJAMAN ===");

        perpustakaan.tampilkanSemuaPeminjaman();
        }
        }

