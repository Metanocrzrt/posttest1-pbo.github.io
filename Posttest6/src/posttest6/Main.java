
package posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Main { 
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<KarMagang> listKarMagang = new ArrayList<>();
    static ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("................... ");
        input.readLine();
        System.out.println("");
    }
    
    
    
    public static void jenis()
    {
        System.out.println("-------------------------------------------");
        System.out.println("Pilih Jenis Data :");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Magang");
    }
    
    static final void display() { 
        System.out.println("\n-----------------------------------------------");
        System.out.println("|                   List Data                 |");
    }
    
    
    public static void tambahData() throws IOException {
        jenis();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("------ Masukkan Data Karyawan Tetap -------");
            System.out.print("Masukkan ID    : ");
            int idKaryawan = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama  : ");
            String namaKaryawan = input.readLine();
            System.out.println("-------------------------------------------");

            Karyawan Kar = new Karyawan(namaKaryawan, idKaryawan);
            listKaryawan.add(Kar);
            Kar.info(namaKaryawan);

        }else if(pil == 2){
            System.out.println("------ Masukkan Data Karyawan Magang -------");
            System.out.print("Masukkan ID    : ");
            int idKarMagang = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama  : ");
            String namaKarMagang = input.readLine();
            System.out.println("----------------------------------------------");
            KarMagang magang = new KarMagang(namaKarMagang, idKarMagang);
            listKarMagang.add(magang);
            magang.info(namaKarMagang);
        }else{
            System.out.println("Pilihan Salah");
        }
    }
    
    public static void lihatData() throws IOException{
        jenis();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            display();
            System.out.println("|                 Karyawan Tetap              |");
            System.out.println("-----------------------------------------------");
            if (listKaryawan.isEmpty()){
                System.out.println("\n-------------------------------------------------");
                System.out.println("\t  Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listKaryawan.size();i++){
                    System.out.println("Data ke-" + (i+1));
                    listKaryawan.get(i).tampil();
                    }
                }
                System.out.println("-------------------------------------------------");
        }else if(pil == 2){
            display();
            System.out.println("|                      Karyawan Magang                     |");
            System.out.println("------------------------------------------------------------");
            if (listKarMagang.isEmpty()){
                System.out.println("\n------------------------------------------------------");
                System.out.println("\t  Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listKarMagang.size();i++){
                    System.out.println("Data ke-" + (i+1));
                    listKarMagang.get(i).tampil();
                }
            }
                System.out.println("--------------------------------------------------------");
        }else{
            System.out.println("Pilihan salah");

        }
    } 
    
     
    public static void editData() throws IOException{
        jenis();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listKaryawan.isEmpty()) {
                System.out.println("\n-------------------------------------------------");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("--------------------------------------------------");
            } else {
                for(int i = 0; i < listKaryawan.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listKaryawan.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data karyawan tetap yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                
                if(index <= listKaryawan.size() || index > 0){
                    System.out.println("=------ Masukkan data karyawan tetap yang baru -------");
                    System.out.print("\nMasukkan ID    : ");
                    int idKaryawan = Integer.parseInt(input.readLine());
                    listKaryawan.get(index-1).setIdKaryawan(idKaryawan);

                    System.out.print("Masukkan Nama    : ");
                    String namaKaryawan = input.readLine();
                    listKaryawan.get(index-1).setNamaKaryawan(namaKaryawan);
                    System.out.println("------------------------------------------------------");
                }else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }  
        }else if(pil == 2){
            if (listKarMagang.isEmpty()) {
                System.out.println("\n-------------------------------------------------");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("-------------------------------------------------");
            } else {
                for(int i = 0; i < listKarMagang.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listKarMagang.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data karyawan magang yang ingin diubah : ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listKarMagang.size() || index > 0){
                    System.out.println("------- Masukkan data karyawan magang yang baru -------");
                    System.out.print("\nMasukkan ID                       : ");
                    int idKarMagang = Integer.parseInt(input.readLine());
                    listKarMagang.get(index-1).setIdKarMagang(idKarMagang);
                    System.out.println(  "-----------------------------------------------------");
                    }else
                    {
                        System.out.println("Indeks tidak ditemukan!");
                    }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    
    public static void hapusData() throws IOException{
        jenisdata();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){ 
        if (listKaryawan.isEmpty()) {
                System.out.println("\n-------------------------------------------------");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("-------------------------------------------------");
            } else {
            for(int i = 0; i < listKaryawan.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listKaryawan.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data karyawan tetap yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listKaryawan.size() || index > 0) 
                {
                    listKaryawan.remove(index-1);
                    System.out.println("Data karyawan tetap dengan indeks " + index + " berhasil dihapus");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else if(pil == 2){
            if (listKarMagang.isEmpty()) {
                System.out.println("\n-------------------------------------------------");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("-------------------------------------------------");
            } else {
                for(int i = 0; i < listKarMagang.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listKarMagang.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data karyawan magang yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listKarMagang.size() || index > 0) 
                {
                    listKarMagang.remove(index-1);
                    System.out.println("Data karyawan magang dengan indeks " + index + " berhasil dihapus:");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
        
    }
        
        
    private static void jenisdata() {
    }


    public static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("""
                           Sistem Pendataan Karyawan Tambang Batu Bara
                           -------------------------------------------
                           | [1] Create Data                         |
                           | [2] Read Data                           |
                           | [3] Update Data                         |
                           | [4] Delete Data                         |
                           | [5] Exit                                |
                           -------------------------------------------""");
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
                System.out.println("makasih sappoo!");
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
