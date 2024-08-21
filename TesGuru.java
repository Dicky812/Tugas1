//Driver Class

import java.util.Scanner;

public class TesGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("Mapel : ");
        String mapel = in.nextLine();
        System.out.println("Alamat : ");
        String alamat = in.nextLine();
        System.out.println("ID :"); 
        int id = in.nextInt();

        // Membuat Obyek
        Guru buaulia = new Guru();
        buaulia.id = 1;
        buaulia.nama = "Nama : Aulia ";
        buaulia.mapel = "Mapel : Produktif RPL";
        buaulia.alamat = "Alamat : Malang";

            System.out.println("ini data Bu Aulia");
            System.out.println(buaulia.id);
            System.out.println(buaulia.nama);
            System.out.println(buaulia.mapel);
            System.out.println(buaulia.alamat);

        Guru bupasha = new Guru();
        bupasha.id = 2;
        bupasha.nama = "Nama : Pasha ";
        bupasha.mapel = "Mapel : Produktif RPL";
        bupasha.alamat = "Alamat : Malang";

            System.out.println("ini data Bu Pasha ");
            System.out.println(bupasha.id);
            System.out.println(bupasha.nama);
            System.out.println(bupasha.mapel);
            System.out.println(bupasha.alamat);

        Guru bufeni = new Guru();
        bufeni.id = 3;
        bufeni.nama = "nama : Feni ";
        bufeni.mapel = "mapel : matematika";
        bufeni.alamat = "alamat : malang";

            System.out.println("ini data bu feni");
            System.out.println(bufeni.id);
            System.out.println(bufeni.nama);
            System.out.println(bufeni.mapel);
            System.out.println(bufeni.alamat);

        Guru pakGuntur = new Guru();
        pakGuntur.id = 4;
        pakGuntur.nama = "nama : Guntur";
        pakGuntur.mapel = "mapel : sejarah";
        pakGuntur.alamat = "alamat : malang";
        
            System.out.println("ini data pak Guntur");
            System.out.println(pakGuntur.id);
            System.out.println(pakGuntur.nama);
            System.out.println(pakGuntur.mapel);
            System.out.println(pakGuntur.alamat);

        Guru pakayat = new Guru();
        pakayat.id = 5;
        pakayat.nama = "nama : Ayat";
        pakayat.mapel = "mapel : informatika";
        pakayat.alamat = "alamat : malang";

            System.out.println("ini data pak Ayat");
            System.out.println(pakayat.id);
            System.out.println(pakayat.nama);
            System.out.println(pakayat.mapel);
            System.out.println(pakayat.alamat);

            buaulia.print();
            bupasha.print();
            bufeni.print();
            pakGuntur.print();
            pakayat.print();


            }

        

    }