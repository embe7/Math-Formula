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

    void sayHasilOperasi(){
        if (operator1.equals("+")){
            if (operator2.equals("x")){
                int kali = bilB * bilC;
                int total = bilA + kali;
                System.out.println("Hasil : "  + total);
            }else if (operator2.equals("+")){
                int total = bilA + bilB + bilC;
                System.out.println("Hasil : " + total);
            }else if (operator2.equals("/")){
                int bagi = bilA + bilB;
                int total = bilC + bagi;
                System.out.println("hasil : " + total);
            }else if (operator2.equals("-")){
                int total = bilA + bilB - bilC;
                System.out.println("hasil : " + total );
            }
        }else {
            System.out.println("code belum selesai");
        }
    }

}
