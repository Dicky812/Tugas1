//Objek Class
public class Guru {
    int id;
    String nama;
    String mapel;
    String alamat;

    //Constructur nama sama dengan nam Class
    public Guru() {
        id = 0;
        nama = "";
        mapel = "";
        alamat = "";
    }
        //Constructor Parameter
       public Guru(int id, String nama, String mapel, String alamat){
         this.id = id ;
         this.nama = nama ;
         this.mapel = mapel ;
         this.alamat = alamat ;
            }

        //Method
        public void print () {
            System.out.println("-----------------------");
            System.out.println("ID :"+ id);
            System.out.println("Nama :"+ nama);
            System.out.println("Mapel :"+ mapel);
            System.out.println("Alamat : "+ alamat);
            System.out.println("-----------------------");

        }   
        
    }
    

