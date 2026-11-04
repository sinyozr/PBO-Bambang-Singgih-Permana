public class Ular extends Hewan {
    public boolean isBerbisa;

public Ular(boolean isBerbiasa, double berat, String makanan, String habitat){
    super(berat, makanan, habitat);
    this.isBerbisa = isBerbiasa;
}

@Override public void bergerak(){
    System.out.println("Mengerutkan otot dari segala sisi hingga membentuk lengkungan");
    System.out.println("Menemukan titik penanhan seperti batu atau pohon");
    System.out.println("menggunakanan sisik untuk mendorong tubuh ke depan");
}

@Override 
public void bernapas(){
    System.out.println("Otot perut mengendur, udara masuk melalui lubang di segmen tubuh");
    System.out.println("Trakea mengirimkan oksigen");
    System.out.println("Otot perut berkontrakasi, udara dikeluarkan");
    
}

@Override 
public void cetakInfo(){
    super.cetakInfo();
    System.out.println("Berbisa : " + this.isBerbisa);
}
}
