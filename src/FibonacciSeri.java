import java.util.Scanner;

public class FibonacciSeri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç elemanlı fibonacci dizisi gormek istiyorsunuz? : ");
        int count2= input.nextInt();
        int count=0;
        int sum=0;
        int num1=0,num2=1;
        while(count<count2){
            System.out.print(sum+"  ");
            num1=num2;
            num2=sum;
            sum=num1+num2;
            count++;

        }

    }
}
