
package posttest6;

public abstract class Data { 
    protected  final String perusahaan = "PT KPC , Sangatta"; 
    private  String namaKaryawan; 
    private int idKaryawan;
    

 
    public Data(String namaKaryawan, int idKaryawan) {
        this.namaKaryawan = namaKaryawan; 
        this.idKaryawan = idKaryawan;
       
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
        return idKaryawan;
    }

    /**
     * @param idKaryawan
     */
    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    
    
     //Overloading
    public void info(String namaKaryawan){
        System.out.println("\tData Karyawan dengan Nama " + namaKaryawan + "  berhasil ditambahkan!" );
    }
    
    //Overloading
    public void info(int idKaryawan){
        System.out.println("\tData Karyawan dengan ID " + idKaryawan + " berhasil diubah !");
    }
    
    
    // abstract method  
    public abstract void tampil();
    
    
    
  
}

