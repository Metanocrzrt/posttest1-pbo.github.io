
package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Karyawan extends Data implements Info{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    
    private String namaKaryawan;
    private int idKaryawan;
    
    public Karyawan(String namaKaryawan, int idKaryawan) {
        super(namaKaryawan, idKaryawan);
        this.namaKaryawan = namaKaryawan;
        this.idKaryawan = idKaryawan;
    }

    /**
     * @return the statusPerkawinan
     */
    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    /**
     * @param namaKaryawan
     */
    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    /**
     * @return 
     */
    public int getIdKaryawan() {
        return idKaryawan;
    }

    /**
     * @param idKaryawan
     */
    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    
    
    @Override
    public void tampil(){
        System.out.println("Perusahaan             : " + perusahaan);
        System.out.println("Nama                   : " + getNamaKaryawan() );
        System.out.println("ID                     : " + getIdKaryawan() );
        System.out.println("Posisi                 : " + Posisi());
        System.out.println("StatusPekerjaan        : " + StatusPekerjaan());
    }
    
    // Penggunaan static
    public static void Berlaku(){
        System.out.println("Berlaku Hingga : Seumur Hidup");
    }
    
    @Override
    public String Posisi(){
        return "Operator";
    }
    @Override
    public String StatusPekerjaan(){
        return "Permananen";
    }
}
