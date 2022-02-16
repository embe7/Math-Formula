package SMP.Kelas7.Semester1.Pertemuan2;

public class OperasiBilanganBulat {
    public static void main(String[] args) {
        OperasiBilangan nilai1 = new OperasiBilangan(100,"/",50,"+",1);
        OperasiBilangan nilai2 = new OperasiBilangan(100,"/",50,"-",30);
        OperasiBilangan nilai3 = new OperasiBilangan(100,"/",50,"*",30);
        OperasiBilangan nilai4 = new OperasiBilangan(100,"/",50,"/",30);

        nilai1.sayHasilOperasi();
        nilai2.sayHasilOperasi();
        nilai3.sayHasilOperasi();
        nilai4.sayHasilOperasi();
    }
}
