import java.util.Scanner;

public class DeseneGoreMetot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        int num=input.nextInt();
        int i=0;
        while(-5<num){
            System.out.print(num+" ");
            num-=5;
            i++;
        }num+=5;
        while(1<i){
            num+=5;
            System.out.print(num+" ");
            i--;
        }
    }
}
