package Hierarchical;
public class Dosen extends Hierarchical.Karyawan {
    public Dosen(String nama){
        super(nama);
    }
    public void kerja(){
        System.out.println(" Tugas dari " + this.nama + " adalah Mengajar");
    }

}