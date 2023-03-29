package posttest4;

class Data { 
    private String namaKaryawan; 
    private int IdKaryawan ;
    public Data(String namakaryawan, int idKaryawan2) {
        this.namaKaryawan = namakaryawan;
        this.IdKaryawan = idKaryawan2;
       
    }
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
    public void setNamaKaryawan(String namakaryawan) {
        this.namaKaryawan = namakaryawan;
    }
    public int getIdKaryawan() {
        return IdKaryawan;
    }
    public void setIdkaryawan(int idKaryawan) {
        this.IdKaryawan = idKaryawan;
    }

}
