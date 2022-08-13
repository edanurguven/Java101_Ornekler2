import java.util.Scanner;

public class UsluSayiHesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int total=1;
        System.out.println("Üssü alınacak sayı : ");
        int n=input.nextInt();
        System.out.println("Üs olacak sayı : ");
        int a=input.nextInt();
        for (int i=1;i<=a;i++){
            total*=n;
        }
        System.out.println("Sonuc : "+total);
    }
}
