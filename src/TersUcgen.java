import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int sayi=input.nextInt();
        for (int k=sayi-1;k>=0;k--) {
            for(int j=(sayi-k-1);j>=0;j--){
                System.out.print(" ");
            }
            for (int i = (2*k+1); i >=1; i--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
