package posttest4;
public class KarMagang extends Data{
    private String NamaKarMagang;
    private int IdKarMagang;
    
    public KarMagang(String namakarmagang, int idkarmagang) {
        super(namakarmagang,idkarmagang);
        this.NamaKarMagang= namakarmagang;
        this.IdKarMagang= idkarmagang;
    }

    public String getNamaKarMagang() {
        return NamaKarMagang;
    }
    public void setNamakarMagang(String namakarmagang) {
        this.NamaKarMagang = namakarmagang;
    }
    public int getIdKarMagang() {
        return IdKarMagang;
    }
    public void setIdKarMagang(int idkarmagang) {
        this.IdKarMagang = idkarmagang;
    }

    
}
