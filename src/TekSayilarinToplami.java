import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean deger=false;
        int sum=0;
        while(deger==false){
            System.out.println("Sayi giriniz : ");
            int sayi=input.nextInt();
            if(sayi%4==0){
                sum+=sayi;
            }
            if(sayi%2==1){
                deger=true;
            }
        }
        System.out.println("Girdiğiniz değerlerin 4'ün katı olan sayıların toplamı: "+sum);
    }
}
