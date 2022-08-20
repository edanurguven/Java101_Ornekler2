import java.util.Scanner;

public class RecursiveUsHesap {
    static int usHesap(int taban,int us){
        if(us==0){
            return 1;
        }
        else {
            return taban*usHesap(taban,us-1);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Tabanı giriniz : ");
        int taban=input.nextInt();
        System.out.print("Us giriniz : ");
        int us=input.nextInt();
        System.out.print("sonuç : "+usHesap(taban,us));
    }
}
