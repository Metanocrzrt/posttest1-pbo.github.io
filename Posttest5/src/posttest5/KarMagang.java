
package posttest5;

public class KarMagang extends Data{
    private String NamaKarMagang;
    private int IdKarMagang;
    

    
    public KarMagang(String namaKarMagang, int IdKarMagang) {
        super(namaKarMagang, IdKarMagang);
        this.NamaKarMagang = namaKarMagang;
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

    @Override
    public void tampil(){
        System.out.println("=============================================");
        System.out.println("Perusahaan             : " + perusahaan);
        System.out.println("Nama                   : " + getNamaKarMagang());
        System.out.println("ID                     : " + getIdKarMagang());
       
    }
    
    
    
}
    

