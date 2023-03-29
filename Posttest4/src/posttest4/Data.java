package posttest4;

class Data { // digunakan untuk menyimpan informasi tentang objek-objek yang dibuat dalam program.
    private String namaKaryawan; 
    private int idKaryawan;
    

    // untuk membuat objek baru dari class dgn nilai atribut yang telah
    // diinisialisasi pada saat objek dibuat.
    public Data(String namakaryawan, int idKaryawan) {
        this.namaKaryawan = namakaryawan;
        this.idKaryawan = idKaryawan;
       
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return namaKaryawan;
    }

    /**
     * @param namaKaryawan the name to set
     */
    public void setName(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }



    public int getidKaryawan() {
        return idKaryawan;
    }

    /**
     * @param idKaryawan
     */
    public void setidKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    
    public void tampil(){
        System.out.println("Nama Karyawan              : " + namaKaryawan );
        System.out.println("Id Karyawan                : " + idKaryawan );
    }
}

