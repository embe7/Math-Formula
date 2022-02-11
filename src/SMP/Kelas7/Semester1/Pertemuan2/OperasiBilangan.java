package SMP.Kelas7.Semester1.Pertemuan2;

class OperasiBilangan {
    int bilA;
    int bilB;
    int bilC;
    String operator1;
    String operator2;

    OperasiBilangan(int bilPertama,String operator1,int bilKedua, String operator2,int bilketiga){
        this.bilA = bilPertama;
        this.bilB = bilKedua;
        this.bilC = bilketiga;
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    void sayHasilOperasi() {

        int tambah;
        int kurang;
        int kali;
        int bagi;
        int total;

        if (operator1.equals("+")) {
            if (operator2.equals("x")) {
                kali = bilB * bilC;
                total = bilA + kali;
                System.out.println("Hasil : " + total);
            } else if (operator2.equals("+")) {
                total = bilA + bilB + bilC;
                System.out.println("Hasil : " + total);
            } else if (operator2.equals("/")) {
                bagi = bilA + bilB;
                total = bilC + bagi;
                System.out.println("hasil : " + total);
            } else if (operator2.equals("-")) {
                total = bilA + bilB - bilC;
                System.out.println("hasil : " + total);
            } else {
                System.out.println("Operator Tidak Ditemukan");
            }
        } else if (operator1.equals("-")) {
            if (operator2.equals("+")) {
                kurang = bilA - bilB + bilC;
                total = kurang;
                System.out.println("hasil : " + total);
            } else if (operator2.equals("-")) {
                kurang = bilA - bilB - bilC;
                total = kurang;
            } else if (operator2.equals("x")) {
                kurang = bilB * bilC;
                total = bilA - kurang;
                System.out.println("hasil : " + total);
            } else if (operator2.equals("/")) {
                kurang = bilA - bilB / bilC;
                total = kurang;
                System.out.println("hasil : " + total);
            } else {
                System.out.println("Operator Tidak Ditemukan");
            }
        } else if (operator1.equals("x")) {
            if (operator2.equals("+")) {
                kali = bilA * bilB + bilC;
                total = kali;
                System.out.println("hasil : " + total);
            } else if (operator2.equals("-")) {
                kali = bilA - bilB - bilC;
                total = kali;
            } else if (operator2.equals("x")) {
                kali = bilA * bilB * bilC;
                total = kali;
                System.out.println("hasil : " + total);
            } else if (operator2.equals("/")) {
                kali = bilA * bilB / bilC;
                total = kali;
                System.out.println("hasil : " + total);
            } else {
                System.out.println("Operator Tidak Ditemukan");
            }
        } else if (operator1.equals("/")) {
            if (operator2.equals("+")) {
                bagi = bilA / bilB + bilC;
                total = bagi;
                System.out.println("hasil : " + total);
            } else if (operator2.equals("-")) {
                bagi = bilA / bilB - bilC;
                total = bagi;
            } else if (operator2.equals("x")) {
                bagi = bilA / bilB * bilC;
                total = bagi;
                System.out.println("hasil : " + total);
            } else if (operator2.equals("/")) {
                bagi = bilA / bilB / bilC;
                total = bagi;
                System.out.println("hasil : " + total);
            } else {
                System.out.println("Operator Tidak Ditemukan");
            }
        }
    }
}
