import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kpc {
    public static void main(String[] args) throws IOException{
        int pil, id;
        String nama_karyawan;
        
        ArrayList<String> tambang = new ArrayList<String>();

        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while(true){
            System.out.println("\n =========================================== ");
            System.out.println(" Sistem Pendataan karyawan tambang batu bara");
            System.out.println(" ===========================================");
            System.out.println("[1]Buat data baru karyawan");
            System.out.println("[2]Lihat data karyawan");
            System.out.println("[3]Ubah data karyawan");
            System.out.println("[4]Hapus data karyawan");
            System.out.println("[5]Keluar");
            
            System.out.print("Pilihan menu: ");
            pil = Integer.parseInt(br.readLine());
            
            switch(pil){
                case 1:
                System.out.println("\nNama karyawan:");
                nama_karyawan = br.readLine();
                tambang.add(nama_karyawan);
                System.out.println("Data sukses tersimpan!");
                break;
                case 2:
                System.out.println("\nData yang tersimpan:");
                if(tambang.size() > 0){
                    for(int i = 0; i < tambang.size(); i++){
                        System.out.println(i+1 + ". " + tambang.get(i));
                    }
                } else{
                    System.out.println("Tidak ada data tersimpan");
                }
                System.out.println("waitt");
                loading.wait(1000);
                break;
                case 3:
                System.out.println("\nUbah data");
                if(tambang.size() > 0){
                    for(int i = 0; i < tambang.size(); i++){
                        System.out.println(i + ". " + tambang.get(i));
                        System.out.print("ID karyawan yang ingin di ubah: ");
                        id = Integer.parseInt(br.readLine());
                        if(id > tambang.size()){
                            System.out.println("ID terpilih belum tersimpan");
                        } else{
                            System.out.print("Nama karyawan baru: ");
                            nama_karyawan = br.readLine();
                            tambang.set(id, nama_karyawan);   
                            System.out.println("Data sukses terubah!");
                        }
                    }
                } else{
                    System.out.println("Tidak ada data tersimpan");
                }
                break;
                case 4:
                System.out.println("\nHapus data");
                if(tambang.size() > 0){
                    for(int i = 0; i < tambang.size(); i++){
                        System.out.println(i + ". " + tambang.get(i));
                        System.out.println("ID karyawan yang ingin di hapus: ");
                        id = Integer.parseInt(br.readLine());
                        if(id > tambang.size()){
                            System.out.println("ID terpilih belum tersimpan");
                        } else{
                            tambang.remove(id);
                            System.out.println("Data sukses terhapus!");
                        }
                    }
                } else{
                    System.out.println("Tidak ada data tersimpan");
                }
                break;
                case 5:
                System.out.println("Arigato!");
                System.exit(0);
                default:
                System.out.println("\nPilihan tidak tersedia");
            }
        }
        
    }
}