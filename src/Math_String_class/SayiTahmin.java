package Math_String_class;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        boolean flg=false;
        Scanner input=new Scanner(System.in);
        int count=5;
        while(count>0){
            System.out.println("Tahmini sayınızı giriniz:");
            int a=input.nextInt();
            if(a==number){
                System.out.println("Tahmininiz doğru!");
                flg=true;
                break;
            }
            else if(a>number){
                System.out.println("Sayınız gizli sayıdan büyük");
                count--;
                System.out.println("Kalan hakkınız :"+count);
            }
            else if(a<number){
                System.out.println("Sayınız gizli sayıdan küçük :");
                count--;
                System.out.println("Kalan hakkınız :"+count);
            }

        }
        if(flg!=true){
            System.out.println("Doğru tahmin edemediniz,gizli sayı:"+number);
        }
    }

}
