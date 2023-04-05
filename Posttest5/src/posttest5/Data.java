package posttest5;



public abstract class Data { 
    protected  final String perusahaan = "PT KPC, Sangatta";
    private  String namaKaryawan; 
    private  int IdKaryawan;
    

   
    public Data(String namaKaryawan,  int IdKaryawan) {
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
    public void setNik(int IdKaryawan) {
        this.IdKaryawan = IdKaryawan;
    }

    
    
     //Overloading
    public void info(String name){
        System.out.println("\tData Karyawan dengan Nama " + namaKaryawan + "  berhasil ditambahkan!" );
    }
    
    //Overloading
    public void info(int nik){
        System.out.println("\tData Karyawan dengan Id " + IdKaryawan + " berhasil diubah !");
    }
    
    
    // abstract method  
    public abstract void tampil();
  
}

