package OgrenciBilgiSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;

        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int matQuiz, int fizik,int fizikQuiz, int kimya,int kimyaQuiz) {

        if ((mat >= 0 && mat <= 100)&&(matQuiz >= 0 && matQuiz <= 100)) {
            this.mat.note = mat;
            this.mat.quiz=matQuiz;
        }

        if ((fizik >= 0 && fizik <= 100)&&(fizikQuiz >= 0 && fizikQuiz <= 100)) {
            this.fizik.note = fizik;
            this.fizik.quiz=fizikQuiz;
        }

        if ((kimya >= 0 && kimya <= 100)&&(kimyaQuiz >= 0 && kimyaQuiz <= 100) ) {
            this.kimya.note = kimya;
            this.kimya.quiz=kimyaQuiz;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double fizikNot=((this.fizik.quiz*0.20)+(this.fizik.note*0.80));
        double matNot=((this.mat.quiz*0.20)+(this.mat.note*0.80));
        double kimyaNot=((this.kimya.quiz*0.20)+(this.kimya.note*0.80));

        this.avarage = (fizikNot+matNot+kimyaNot) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + ((this.mat.quiz*0.20)+(this.mat.note*0.80)));
        System.out.println("Fizik Notu : " + ((this.fizik.quiz*0.20)+(this.fizik.note*0.80)));
        System.out.println("Kimya Notu : " + ((this.kimya.quiz*0.20)+(this.kimya.note*0.80)));
    }
}
