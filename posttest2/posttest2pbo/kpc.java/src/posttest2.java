import main.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class posttest2 {
    public static void main(String[] args) throws IOException {
        ArrayList<kpc> karyawan = new ArrayList<>();
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while(true){
            System.out.println("\n ******************************************* ");
            System.out.println(" Sistem Pendataan Karyawan Tambang Batu Bara");
            System.out.println(" *******************************************");
            System.out.println("[1] Create New Data");
            System.out.println("[2] Read Data");
            System.out.println("[3] Update data");
            System.out.println("[4] Delete data");
            System.out.println("[5] Program Exit");
            
            System.out.println("   Pilih menu: ");
            int pil = Integer.parseInt(br.readLine());
            
            switch(pil){
                case 1:
                    System.out.println("\nCREATE");
                    int id = karyawan.size();
                    System.out.println("Nama Karyawan: ");
                    String NamaKar = br.readLine();
                    
                    System.out.println("Pekerjaan Karyawan: ");
                    String PekerjaanKar = br.readLine();
                    
                    System.out.println("Umur Karyawan: ");
                    int UmurKar = Integer.parseInt(br.readLine());
                    
                    System.out.println("Gaji Karyawan: ");
                    int GajiKar = Integer.parseInt(br.readLine());
                    
                    kpc Kar = new kpc(id, NamaKar, PekerjaanKar, UmurKar, GajiKar);
                    karyawan.add(Kar);
                    System.out.println("Data added successfully!");
                    break;
                case 2:
                    System.out.println("\nREAD");
                    if(karyawan.size() == 0){
                        System.out.println("no data saved yet");
                    } else{
                        for(int i = 0; i < karyawan.size(); i++){
                            kpc kpc = karyawan.get(i);
                            id = kpc.getId();
                            String namaKar= kpc.getNamaKar();
                            String pekerjaanKar = kpc.getPekerjaanKar();
                            int umurKar = kpc.getUmurKar();
                            int gajiKar = kpc.getGajiKar();
                            System.out.println("ID\t\t:" + id);
                            System.out.println("Nama karyawan\t:" + namaKar);
                            System.out.println("Pekerjaan\t:" + pekerjaanKar);
                            System.out.println("Umur\t\t:" + umurKar);
                            System.out.println("Gaji\t\t:" + gajiKar);
                            System.out.println("================================ ");
                        }
                    }
                    break;
                case 3:
                    if(karyawan.size() > 0){
                        for(int i = 0; i < karyawan.size(); i++){
                            kpc kpc = karyawan.get(i);
                            id = kpc.getId();
                            String namaKar = kpc.getNamaKar();
                            String pekerjaanKar = kpc.getPekerjaanKar();
                            int umurKar = kpc.getUmurKar();
                            int gajiKar = kpc.getGajiKar();
                            System.out.println("ID\t\t:" + id);
                            System.out.println("Nama karywan\t:" + namaKar);
                            System.out.println("Pekerjaan\t\t:" + pekerjaanKar);
                            System.out.println("Umur\t\t:" + umurKar);
                            System.out.println("Gaji\t\t:" + gajiKar);
                            System.out.println(" =============================== ");
                        }
    
                        System.out.println("\nUPDATE");
                        System.out.println("ID karyawan yang ingin di ubah: ");
                        id = Integer.parseInt(br.readLine());
                        if(id > karyawan.size()){
                            System.out.println("ID terpilih belum tersimpan");
                        } else{
                            System.out.println("Nama karyawan baru: ");
                            String NamaKarB = br.readLine();

                            System.out.println("Pekerjaan karyawan baru: ");
                            String PekerjaanKarB = br.readLine();
    
                            System.out.println("Umur karyawan terbaru: ");
                            int UmurKarB = Integer.parseInt(br.readLine());
    
                            System.out.println("Gaji karyawan baru: ");
                            int GajiKarB = Integer.parseInt(br.readLine());
    
                            kpc KarUpdate = new kpc(id, NamaKarB, PekerjaanKarB, UmurKarB, GajiKarB);
                            karyawan.set(id, KarUpdate);
                            System.out.println("data changed successfully!");
                        }
                    } else{
                        System.out.println("no data saved yet");
                    }
                    break;
                case 4:
                    for(int i = 0; i < karyawan.size(); i++){
                        kpc kpc = karyawan.get(i);
                        id = kpc.getId();
                        String namaKar = kpc.getNamaKar();
                        String pekerjaanKar = kpc.getPekerjaanKar();
                        int umurKar = kpc.getUmurKar();
                        int gajiKar = kpc.getGajiKar();
                        System.out.println("ID\t\t:" + id);
                        System.out.println("Nama karyawan\t:" + namaKar);
                        System.out.println("Pekerjaan\t\t:" + pekerjaanKar);
                        System.out.println("Umur\t\t:" + umurKar);
                        System.out.println("Gaji\t\t:" + gajiKar);
                        System.out.println(" ================================= ");
                    }
                
                    System.out.println("\nDELETE");
                    if(karyawan.size() > 0){
                        System.out.println("ID karyawan yang ingin di hapus: ");
                        id = Integer.parseInt(br.readLine());
                        if(id > karyawan.size()){
                            System.out.println("ID terpilih belum tersimpan");
                        } else{
                            karyawan.remove(id);
                            System.out.println("data deleted successfully!");
                        }
                    } else{
                        System.out.println("Belum ada data tersimpan");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
            }
        }
    }
}
