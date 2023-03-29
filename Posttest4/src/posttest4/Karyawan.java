/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

public class Karyawan extends Data{
    private String namaKaryawan;
    private int idKaryawan;
    
    public Karyawan(String namaKaryawan,int idKaryawan) {
        super(namaKaryawan, idKaryawan);
        this.namaKaryawan = namaKaryawan;
        this.idKaryawan = idKaryawan;
    }

    /**
     * @return
     */
    public String getnamaKaryawan() {
        return namaKaryawan;
    }

    /**
     * @param namaKaryawan
     */
    public void setnamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    /**
     * @return 
     */
    public int getidKaryawan() {
        return idKaryawan;
    }

    /**
     * @param idKaryawan
     */
    public void setidKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Nama Karyawan          : " + namaKaryawan);
        System.out.println("Id Karyawan            : " + idKaryawan);
    }
}
