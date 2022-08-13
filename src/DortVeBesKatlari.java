import java.util.Scanner;

public class DortVeBesKatlari {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz : ");
        int sayi=input.nextInt();
        for(int i=1 ,j=1 ;(i<=sayi)||(j<=sayi) ;i*=4,j*=5){
            if(i<=sayi){
                System.out.print(i+" ");
            }
            if(j<=sayi &&(j!=1)){

                System.out.print(j+" ");
            }
        }
    }
}
