import java.util.Scanner;

public class GecmeNotu {

    public static void main(String[] args) {
        double mat,fizik,turkce,kimya,muzik;
        double ort=0,sonuc;

        Scanner input=new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz : ");
        mat=input.nextInt();
        if(mat>=0 && mat<=100){
            ort+=mat;
        }
        System.out.println("Fizik notunuzu giriniz : ");
        fizik=input.nextInt();
        if(fizik>=0 && fizik<=100){
            ort+=fizik;
        }
        System.out.println("Turkce notunuzu giriniz : ");
        turkce=input.nextInt();
        if(turkce>=0 && turkce<=100){
            ort+=turkce;
        }
        System.out.println("Kimya notunuzu giriniz : ");
        kimya=input.nextInt();
        if(kimya>=0 && kimya<=100){
            ort+=kimya;
        }
        System.out.println("Muzik notunuzu giriniz : ");
        muzik=input.nextInt();
        if(muzik>=0 && muzik<=100){
            ort+=muzik;
        }
        sonuc=ort/5;
        if(sonuc>=55){
            System.out.println("Gectiniz, ortalamaniz:"+sonuc);
        }
        else{
            System.out.println("Gecemediniz, ortalamaniz:"+sonuc);

        }

    }
}
