import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n=input.nextInt();
        int kucuk=0,buyuk=0,value=0;
        for (int i=1;i<=n;i++){
            System.out.println(i+". sayınızı giriniz:");
            value=input.nextInt();
            if(value>buyuk){
                buyuk=value;
            }
            if(value<kucuk){
                kucuk=value;
            }
        }
        System.out.println("En büyük: "+buyuk);
        System.out.println("En küçük: "+kucuk);
    }
}
