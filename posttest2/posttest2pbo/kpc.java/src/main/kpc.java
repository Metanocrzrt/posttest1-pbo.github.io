package main;
public class kpc {
    private int id;
    private String namaKar;
    private String pekerjaanKar;
    private int umurKar;
    private int gajiKar;

public kpc(int Id, String NamaKar, String PekerjaanKar, int UmurKar, int GajiKar){
    this.id = Id;
    this.namaKar = NamaKar;
    this.pekerjaanKar = PekerjaanKar;
    this.umurKar = UmurKar;
    this.gajiKar = GajiKar;
}

public int getId(){
    return id;
}

public String getNamaKar(){
    return namaKar;
}

public String getPekerjaanKar(){
    return pekerjaanKar;
}

public int getUmurKar(){
    return umurKar;
}

public int getGajiKar(){
    return gajiKar;
}

}