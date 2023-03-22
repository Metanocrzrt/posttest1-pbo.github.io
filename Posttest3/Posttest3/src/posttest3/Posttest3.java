
package posttest3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

 
public class Posttest3 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Karyawan> listKar = new ArrayList<>();
    static ArrayList<KarMagang> listKarMagang = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }


    public static void tambahData() throws IOException {
        System.out.println("Jenis data");
        System.out.println("1. KarMagang");
        System.out.println("2. Karyawan");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data KarMagang ==========");
            System.out.print("Masukkan Id Karyawan Magang         : ");
            int idkarmagang = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Karyawan               : ");
            String namakaryawan = input.readLine();
            System.out.println("=============================================");
            listKarMagang.add(new KarMagang(namakaryawan, idkarmagang));
            System.out.println("Data " + namakaryawan+ " berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Karyawan ==========");
            System.out.print("Masukkan ID Karyawan                     : ");
            int idkaryawan = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Karyawan                   : ");
            String namakaryawan = input.readLine();
            System.out.println("=============================================");
            listKar.add(new Karyawan(namakaryawan,idkaryawan));
            System.out.println("Data " + namakaryawan+ " berhasil ditambahkan!");

        }else{
            System.out.println("Pilihan Salah");

      
      }
    }


    
    /**
     * @throws IOException
     */
    public static void lihatData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. KarMagang");
        System.out.println("2. Karyawan");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n============ List Data KarMagang ============");
            if (listKarMagang.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listKarMagang.size();i++){
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("ID KarMagang         :" + listKarMagang.get(i).getIdKarMagang());
                    System.out.println("Nama KarMagang       :" + listKarMagang.get(i).getNamaKarMagang());
                  
                }
                System.out.println("===========================================");
            }
        }
            
        else if(pil == 2){
            System.out.println("\n=========== List Karyawan ===========");
            if (listKar.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listKar.size();i++){
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("Nama Karyawan           :" + listKar.get(i).getIdKaryawan());
                    System.out.println("Id Karyawan             :" + listKar.get(i).getNamaKaryawan());
                }
            }
                System.out.println("=======================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void editData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. KarMagang");
        System.out.println("2. Karyawan");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listKarMagang.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data KarMagang yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listKarMagang.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    KarMagang magang = listKarMagang.get(index);
                    System.out.println("Data karmagang dengan indeks " + index);
                    System.out.println(magang);
                    System.out.println("======= Masukkan data karmagang yang baru =======");
                    System.out.print("Masukkan ID KarMagang                       : ");                  
                    magang.setIdKarMagang (Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Nama KarMagang                   : ");
                }
            }
        }else if(pil == 2){
            if (listKar.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data karyawan yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listKar.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Karyawan kar = listKar.get(index);
                    System.out.println("Data karywan dengan indeks " + index);
                    System.out.println(kar);
                    System.out.println("======= Masukkan data karyawan yang baru =======");
                    System.out.print("Masukkan ID karyawan                       : ");                  
                    kar.setIdkaryawan (Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Nama karyawan                     : ");
                    kar.setNamaKaryawan (input.readLine());
                    System.out.println("=================================================");
                    System.out.println("Data karyawan berhasil diubah!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    public static void hapusData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. Karmagang");
        System.out.println("2. Karyawan");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listKarMagang.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data karmagang yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listKarMagang.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    listKarMagang.get(index);
                    listKarMagang.remove(index);
                    System.out.println("Data karmagang dengan indeks " + index + " berhasil dihapus:");
                }
            }
        }else if(pil == 2){
            if (listKar.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data karyawan yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listKar.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    listKar.get(index);
                    listKar.remove(index);
                    System.out.println("Data karyawan dengan indeks " + index + " berhasil dihapus:");
                    
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
                           Sistem Pendataan Karyawan Tambang Batu Bara
                           <=><=><=><=><=><=><=><=><=><=><=><=><=><=>>
                           |[1] Add Data                             |
                           |[2] Read Data                            |
                           |[3] Update Data                          |
                           |[4] Delete Data                          |
                           |[5] Exit Program                         |
                           <=><=><=><=><=><=><=><=><=><=><=><=><=><=>>
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
                System.out.println("bye bye dek");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah");
                froze();
                break;
            }
        }
    }

    public static BufferedReader getInput() {
        return input;
    }

    public static void setInput(BufferedReader input) {
        Posttest3.input = input;
    }

    public static ArrayList<Karyawan> getListKar() {
        return listKar;
    }

    public static void setListKar(ArrayList<Karyawan> listKar) {
        Posttest3.listKar = listKar;
    }

    public static ArrayList<KarMagang> getListKarMagang() {
        return listKarMagang;
    }

    public static void setListKarMagang(ArrayList<KarMagang> listKarMagang) {
        Posttest3.listKarMagang = listKarMagang;
    }
    
}
