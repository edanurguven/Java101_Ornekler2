import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayınızı girin : ");
        int sayi=input.nextInt();
        double sum=0.0;
        for(double i=1;i<=sayi;i++){
            sum+=(1/i);
        }
        System.out.println("Sonuc : "+sum);
    }
}
