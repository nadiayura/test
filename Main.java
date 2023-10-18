package Hierarchical;
public class Main {
    public static void main(String[] args){
        Hierarchical.Karyawan k1 = new Karyawan("Wahyu");
        Dosen d1 = new Dosen("Amir");
        Staff s1 = new Staff("Melan");
        k1.kerja();
        d1.kerja();
        s1.kerja();
    }
}