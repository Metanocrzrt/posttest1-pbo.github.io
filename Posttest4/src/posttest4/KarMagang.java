
package posttest4;

public class KarMagang extends Data{
    private String NamaKarMagang;
    private int IdKarMagang;

    
    public KarMagang(String namakarmagang, int idkarmagang) {
        super(namakarmagang,idkarmagang);
        this.NamaKarMagang= namakarmagang;
        this.IdKarMagang= idkarmagang;
    }

    /**
     * @return 
     */
    public int getIdKarMagang() {
        return IdKarMagang;
    }

    /**
     * @param IdKarMagang
     */
    public void setIdKarMagang(int IdKarMagang) {
        this.IdKarMagang = IdKarMagang;
    }

    /**
     * @return 
     */
    public String getNamaKarMagang() {
        return NamaKarMagang;
    }

    /**
     * @param NamaKarMagang 
     */
    public void setNamaKarMagang(String NamaKarMagang) {
        this.NamaKarMagang = NamaKarMagang;
    }
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Id Karyawan Magang   : " + IdKarMagang);
        System.out.println("Nama Karyawan Magang : " + NamaKarMagang);
    }
    
    // overloading
    public void tampil(boolean showID){
        if(showID) tampil();
        else super.tampil();
    }
    
    
   
}
    

