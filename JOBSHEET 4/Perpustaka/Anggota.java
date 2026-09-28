public class Anggota {
private String idAnggota;
private String nama;
private String alamat;

public Anggota(String idAnggota, String nama, String alamat) {
    this.idAnggota = idAnggota;
    this.nama = nama;
    this.alamat = alamat;
}

public String getIdAnggota() {
    return idAnggota;
}

public void setIdAnggota(String idAnggota) {
    this.idAnggota = idAnggota;
}

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public String getAlamat() {
    return alamat;
}

public void setAlamat(String alamat) {
    this.alamat = alamat;
}

public String getInfo() {
    return "ID Anggota : " + idAnggota +
           "\nNama       : " + nama +
           "\nAlamat     : " + alamat;
}

}
