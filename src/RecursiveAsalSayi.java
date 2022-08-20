import java.util.Scanner;

public class RecursiveAsalSayi {

    static int asalSayi(int num,int i) {
       if(i==1)
           return 1;
       else{
           if(num%i==0)
               return 0;
           else
               return asalSayi(num,i-1);
       }

    }

        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            System.out.print("Sayı giriniz: ");
            int num = input.nextInt();
            int i=num/2;
            if (asalSayi(num,i) == 1)
                System.out.print("Asal sayı");
            else
                System.out.print("Asal değil");
        }

}
