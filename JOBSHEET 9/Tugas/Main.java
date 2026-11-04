public class Main {
    public static void main(String[] args) {

        // Membuat objek TransferBank
        TransferBank transfer = new TransferBank();
        transfer.idTransaksi = "TR001";
        transfer.jumlah = 100000;

        // Membuat objek EWallet
        Ewallet ewallet = new Ewallet();
        ewallet.idTransaksi = "EW001";
        ewallet.jumlah = 50000;

        // Membuat objek KartuKredit
        KartuKredit kartu = new KartuKredit();
        kartu.idTransaksi = "KK001";
        kartu.jumlah = 200000;

        // Menampilkan TransferBank
        System.out.println("=== TRANSFER BANK ===");
        transfer.cetakStruk();

        // Menampilkan EWallet
        System.out.println("\n=== E-WALLET ===");
        ewallet.cetakStruk();

        // Menampilkan KartuKredit
        System.out.println("\n=== KARTU KREDIT ===");
        kartu.cetakStruk();
    }
}