import java.util.Scanner;

public class Ortalama_3_4 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int s=input.nextInt();
        for(int i=1;i<=s;i++){
            if(i%3==0){
                if(i%4==0){
                    sum+=i;
                    count++;
                }
            }
        }
        System.out.println("İşleminizin sonucu : "+(sum/count));
    }
}
