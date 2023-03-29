package posttest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class Posttest4 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<KarMagang> listKarMag= new ArrayList<>();
    static ArrayList<Karyawan> listKar = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    public static void tambahData() throws IOException {
        System.out.println("Pilih Jenis data");
        System.out.println("1. Karyawan");
        System.out.println("2. Karyawan Magang");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Karyawan ==========");
            System.out.print("Masukkan ID Karyawan                     : ");
            int idKaryawan = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Karyawan                   : ");
            String namaKaryawan = input.readLine();
            System.out.println("=============================================");
            listKar.add(new Karyawan(namaKaryawan, idKaryawan));
            System.out.println("Data " + namaKaryawan + " berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Karyawan Magang ==========");
            System.out.print("Masukkan ID Karyawan Magang                       : ");
            int idkarmagang = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Karyawan Magang                     : ");
            String namaKarMag = input.readLine();
            System.out.println("=============================================");
            listKarMag.add(new KarMagang(namaKarMag, idkarmagang));
            
        }else{
            System.out.println("Pilihan Salah");
        }
    }
    
    public static void lihatData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. Karyawan");
        System.out.println("2. Karyawan Magang");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n============ List Data Karyawan ============");
            if (listKar.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listKar.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    listKar.get(i).tampil();
                    }
                }
                System.out.println("===========================================");
        }else if(pil == 2){
            System.out.println("\n=========== List Data Karyawan Magang ===========");
            if (listKarMag.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listKarMag.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    listKarMag.get(i).tampil();
                }
            }
                System.out.println("======================================");
        }else{
            System.out.println("Pilihan salah");

        }
    } 
    
                          

    public static void editData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. Karyawan");
        System.out.println("2. Karyawan Magang");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listKar.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listKar.size();i++){
                    System.out.println("=================================================");
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("ID Karyawan               :" + listKar.get(i).getidKaryawan());
                    System.out.println("Nama Karyawan             :" + listKar.get(i).getnamaKaryawan());
                    System.out.println("=================================================");
                    }
                }
                System.out.print("Masukkan indeks data Karyawan yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                index -=1;
                if (index < 0 || index >= listKar.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Karyawan kar = listKar.get(index);
                    System.out.println("Data penduduk dengan indeks " + index + 1);
                    System.out.println("======= Masukkan data karyawan yang baru =======");
                    System.out.print("Masukkan ID Karyawan                      : ");                  
                    kar.setidKaryawan(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Nama Karyawan                    : ");
                    kar.setnamaKaryawan(input.readLine());
                    System.out.println("=================================================");
                    System.out.println("Data Karyawan berhasil diubah!");
                }
            }
        else if(pil == 2){
            if (listKarMag.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listKar.size();i++){
                    System.out.println("=================================================");
                    System.out.println("Data indeks ke-" + (i + 1));
                    System.out.println("ID Karyawan                :" + listKar.get(i).getidKaryawan());
                    System.out.println("Nama Karyawan              :" + listKar.get(i).getnamaKaryawan());
                    System.out.println("=================================================");
                    }
                }
                      
                System.out.print("Masukkan indeks data karyawan magang yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                index -=1;
                if (index < 0 || index >= listKarMag.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    KarMagang karmag = listKarMag.get(index);
                    System.out.println("Data dosen dengan indeks " + index + 1);
                    System.out.println("======= Masukkan data karyawan magang yang baru =======");
                    System.out.print("Masukkan ID karyawan magang                       : ");                  
                    karmag.setidKaryawan(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Nama Karyawan Magang                     : ");
                    karmag.setName(input.readLine());
                    System.out.println("===============================================");
                    System.out.println("Data karyawan magang berhasil diubah!");
                }
            }
        else{
            System.out.println("Input Salah");
        }
    }
    
    public static void hapusData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. Karyawan");
        System.out.println("2. Karyawan Magang");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listKar.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listKar.size();i++){
                    System.out.println("=======================================");
                    System.out.println("Data indeks ke-" + (i + 1));
                    System.out.println("ID karyawan               :" + listKar.get(i).getidKaryawan());
                    System.out.println("Nama Karyawan             :" + listKar.get(i).getnamaKaryawan());
                    System.out.println("=======================================");
                    }
                }
                System.out.print("Masukkan indeks data karyawan yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                index -=1;
                if (index < 0 || index >= listKar.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Karyawan kar = listKar.get(index);
                    listKar.remove(index);
                    System.out.println("Data karyawan dengan indeks " + index + " berhasil dihapus:");
                }
            }
    
        else if(pil == 2){
            if (listKarMag.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listKarMag.size();i++){
                    System.out.println("=======================================");
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("ID Karyawan Magang                 :" + listKarMag.get(i).getIdKarMagang());
                    System.out.println("Nama Karyawan Magang               :" + listKarMag.get(i).getNamaKarMagang());
                    System.out.println("=======================================");
                }
                System.out.print("Masukkan indeks data karyawan magang yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                index -=1;
                if (index < 0 || index >= listKarMag.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    KarMagang karmag = listKarMag.get(index);
                    listKarMag.remove(index);
                    System.out.println("Data anak dengan indeks " + index + " berhasil dihapus:");
                    
                }
            }
        }else{
            System.out.println("Input Salah");
        }
        
    }
    public static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("""
                           Sistem pendataan karyawan tambang batu bara
                           ===========================================
                           | [1] Add Data                            |
                           | [2] Read Data                           |
                           | [3] Update Data                         |
                           | [4] Delete Data                         |
                           | [5] Exit Program                        |
                           ===========================================
                           """);
        System.out.print("Pilih: ");
        int pilih = Integer.parseInt(input.readLine());
        switch(pilih){
            case 1:
                tambahData();
                froze();
                break;
            case 2:
                lihatData();
                froze();
                break;
            case 3:
                editData();
                froze();
                break;
            case 4:
                hapusData();
                froze();
                break;
            case 5:
                System.out.println("makasih sappo");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah!");
                froze();
                break;
            }
        }
    }  
}
