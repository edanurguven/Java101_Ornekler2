import java.util.Scanner;

public class Recursive_DesenMetot {
    static  void recursive_metot(int num1,int i,int flg){
        if (i==0) return;
        if ((flg==-1) && ((num1-5)>-5)) flg=-1; else flg=1;
        System.out.print(num1+" ");
        recursive_metot(num1+(flg*5),i-1, flg);
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        int num=input.nextInt();
        int i;

        if(num%5==0){
            i=(num/5);
            recursive_metot(num,i*2+1,-1);
        }
        else if(num%5!=0){
            i=((num/5)+1);
            recursive_metot(num,i*2+1,-1);
        }

    }
}
