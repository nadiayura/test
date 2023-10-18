package Hierarchical;
public class Staff extends Hierarchical.Karyawan {
    public Staff(String nama){
        super(nama);
    }
    public void kerja(){
        System.out.println(" Tugas dari " + this.nama + " adalah bantu Dosen");
    }

}