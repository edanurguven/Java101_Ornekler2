import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input=new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz : ");
        n1=input.nextInt();
        System.out.println("Ikinci sayiyi giriniz : ");
        n2=input.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nSeciminiz : ");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("sonuc : "+(n1+n2));
                break;
            case 2:
                System.out.println("sonuc : "+(n1-n2));
                break;
            case 3:
                System.out.println("sonuc : "+(n1*n2));
                break;
            case 4:
                if(n2!=0)
                    System.out.println("sonuc : "+(n1/n2));
                else
                    System.out.println("sayi 0'a bolunemez");
                break;
            default:
                System.out.println("Yanlis girdiniz");
        }
    }
}
