package SMP.Kelas7.Semester1.Pertemuan1;

class Compare {
    int bilA;
    int bilB;

    Compare(int bilPertama,int bilKedua){
        this.bilA = bilPertama;
        this.bilB = bilKedua;
    }

    void sayCompare(){
        boolean nilaiSama = true;

        nilaiSama = bilA == bilB;

        if (bilA < bilB){
            System.out.println("Hasil Perbandingan Bilangan : " + bilA + " Lebih Kecil dari " + bilB);
        }else if (bilA > bilB){
            System.out.println("Hasil Perbandingan Bilangan : " + bilA + " Lebih Kecil besar " + bilB);
        }else if (nilaiSama){
            System.out.println("Hasil Perbandingan Bilangan : " + bilA + " Sama Dengan " + bilB);
        }else{
            System.out.println("Insert Bilangan");
        }
    }
}
