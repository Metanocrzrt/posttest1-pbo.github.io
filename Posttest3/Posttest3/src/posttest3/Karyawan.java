package posttest3;


public class Karyawan extends Data{
    private int IdKaryawan;
    private String NamaKaryawan;
    
    public Karyawan(String namaKaryawan, int idKaryawan) {
        super(namaKaryawan, idKaryawan);
        this.IdKaryawan = idKaryawan;
        this.NamaKaryawan = namaKaryawan;
    }
    
    public void notif() {
        System.out.println("Berhasil ditambahkan dikategori Karyawan. ");
    }

    public int getIdKaryawan() {
        return IdKaryawan;
    }

    public void setIdkaryawan(int idKaryawan) {
        this.IdKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return NamaKaryawan;
    }

    public void setNamaKaryawan(String NamaKaryawan) {
        this.NamaKaryawan = NamaKaryawan;
    }
}
    
