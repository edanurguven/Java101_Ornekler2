import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.println("Ilk sayiyi girin:");
        a=input.nextInt();
        System.out.println("Ikinci sayiyi girin:");
        b=input.nextInt();
        System.out.println("Ucuncu sayiyi girin:");
        c=input.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println(a+">"+b+">"+c);
            }
            else if(c>b){
                System.out.println(a+">"+c+">"+b);
            }
            else{
                System.out.println(a+">"+b+"="+c);
            }
        }
        else if((b>a) && (b>c)){
            if(a>c){
                System.out.println(b+">"+a+">"+c);
            }
            else if(c>a){
                System.out.println(b+">"+c+">"+a);
            }
            else{
                System.out.println(b+">"+a+"="+c);
            }

        }
        else if((c>a)&&(c>b)){
            if(a>b){
                System.out.println(c+">"+a+">"+b);
            }
            else if(b>a){
                System.out.println(c+">"+b+">"+a);
            }
            else{
                System.out.println(c+">"+b+"="+a);
            }
        }

    }
}
