import java.util.Scanner;

public class KullaniciGiris {

    public static boolean sifreKontrol(String girdi,String kayitliSifre,String yanlisSifre) {
        Scanner input = new Scanner(System.in);
        //String sifre;
        boolean logic;
        if (girdi.equals(kayitliSifre) || girdi.equals(yanlisSifre)) {
            logic = false;
            System.out.println("Sifre olusturulamadi,lutfen baska sifre giriniz : ");
            girdi = input.nextLine();
            return (sifreKontrol(girdi, kayitliSifre, yanlisSifre));
        } else {
            logic = true;
        }
        return logic;
    }

    public static void main(String[] args) {
        String userName,password,newPassw,nnPass,cevap;


        password="java123";
        Scanner input=new Scanner(System.in);
        System.out.println("Adiniz : ");
        userName=input.nextLine();
        System.out.println("Sifreniz : ");
        newPassw=input.nextLine();
        if (userName.equals("patika") && newPassw.equals(password)){
            System.out.println("Basarili giris");
        }
        else if(!(newPassw.equals(password))){
            System.out.println("Sifreniz yanlis,sifreniz sifirlansin mi? y/n");
            cevap=input.nextLine();
            if(cevap.equals("y")){
                System.out.println("Yeni sifrenizi girin : ");
                nnPass=input.nextLine();
                /*
                if(nnPass.equals(password) || nnPass.equals(newPassw)){
                    System.out.println("Sifre olusturulamadi,lutfen baska sifre giriniz : ");
                    nnPass=input.nextLine();
                */
                if(sifreKontrol(nnPass,password,newPassw)){
                    System.out.println("sifreniz kaydedildi.");
                }
                else{
                    System.out.println("Sifreniz kaydedildi.");

                }
                password=nnPass;
            }
        }
    }
}
