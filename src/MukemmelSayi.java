import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        int sum=0;
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                sum+=i;
            }
        }
        if(sayi==sum){
            System.out.println("Mükemmel sayı");
        }
        else{
            System.out.println("Mükemmel sayı degil");
        }
    }
}
