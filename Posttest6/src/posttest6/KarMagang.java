
package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class KarMagang extends Data implements Info{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<KarMagang> listKarMagang = new ArrayList<>();
    
    private String namaKarMagang;
    private int idKarMagang;
    

    
    public KarMagang(String namaKarMagang, int idKarMagang) {
        super(namaKarMagang, idKarMagang);
        this.namaKarMagang = namaKarMagang;
        this.idKarMagang = idKarMagang;
    }

    /**
     * @return 
     */
    public String getNamaKarMagang() {
        return namaKarMagang;
    }

    /**
     * @param NamaKarMagang
     */
    public void setNamaKarMagang(String namaKarMagang) {
        this.namaKarMagang = namaKarMagang;
    }

    /**
     * @return 
     */
    public int getIdKarMagang() {
        return idKarMagang;
    }

    /**
     * @param idKarMagang
     */
    public void setIdKarMagang(int idKarMagang) {
        this.idKarMagang = idKarMagang;
    }

    @Override
    public void tampil(){
        System.out.println("Perusahaan             : " + perusahaan);
        System.out.println("Nama                   : " + getNamaKarMagang() );
        System.out.println("ID                     : " + getIdKarMagang() );
        System.out.println("Posisi                 : " + Posisi());
        System.out.println("Status Pekerjaan       : " + StatusPekerjaan());
    }
    
    
    @Override
    public String Posisi(){
        return "Indonesia";
    }
    @Override
    public String StatusPekerjaan(){
        return "Magang";
    }
    
}
