import java.util.Scanner;

public class PalindromSayi {

    static  boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastnumber;
        while(temp!=0){
            lastnumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastnumber;
            temp/=10;

        }
        if (number==reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayınızı girin :");
        int num=input.nextInt();
        if(isPalindrom(num))
            System.out.print("Sayı palindrom");
        else
            System.out.print("Palindrom degil");
    }
}
