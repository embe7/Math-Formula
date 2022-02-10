package SMP.Kelas7.Semester1.Pertemuan2;

public class OperasiBilanganBulat {
    public static void main(String[] args) {
        OperasiBilangan nilai1 = new OperasiBilangan(10,"+",50,"x",1);
        OperasiBilangan nilai2 = new OperasiBilangan(10,"+",50,"-",30);

        nilai1.sayHasilOperasi();
        nilai2.sayHasilOperasi();
    }
}
