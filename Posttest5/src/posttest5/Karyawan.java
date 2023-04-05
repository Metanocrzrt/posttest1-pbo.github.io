
package posttest5;


public class Karyawan extends Data{
    private String namaKaryawan;
    private int IdKaryawan;
    
    public Karyawan(String namaKaryawan, int IdKaryawan) {
        super(namaKaryawan, IdKaryawan);
        this.namaKaryawan = namaKaryawan;
        this.IdKaryawan = IdKaryawan;
    }

    /**
     * @return 
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
        return IdKaryawan;
    }

    /**
     * @param IdKaryawan
     */
    public void setIdKaryawan(int idKaryawan) {
        this.IdKaryawan = idKaryawan;
    }
    
    
    @Override
    public void tampil(){
        System.out.println("Perusahaan             : " + perusahaan);
        System.out.println("Nama                   : " + getNamaKaryawan() ); 
        System.out.println("ID                     : " + getIdKaryawan() );
       
    }
}
