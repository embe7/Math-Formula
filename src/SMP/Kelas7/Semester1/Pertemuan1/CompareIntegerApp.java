package SMP.Kelas7.Semester1.Pertemuan1;

public class CompareIntegerApp {
    public static void main(String[] args) {
        Compare nilai1 = new Compare(10,5);
        Compare nilai2 = new Compare(-16,-10);
        Compare nilai3 = new Compare(-23,2);
        Compare nilai4 = new Compare(-3,0);
        Compare nilai5 = new Compare(4,-5);
        Compare nilai6 = new Compare(20,20);

        nilai1.sayCompare();
        nilai2.sayCompare();
        nilai3.sayCompare();
        nilai4.sayCompare();
        nilai5.sayCompare();
        nilai6.sayCompare();
    }
}
