import java.util.Scanner;

public class ArmstrongSayilar {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi=input.nextInt();
        int toplam=0;
        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("Toplam : "+toplam);
    }
}
