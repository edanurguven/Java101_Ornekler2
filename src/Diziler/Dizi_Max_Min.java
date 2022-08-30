package Diziler;
import java.util.Arrays;
import java.util.Scanner;

public class Dizi_Max_Min {
    public static void main(String[] args) {
        int[] array={15,12,788,1,-1,-778,2,0};
        int[] array2=new int[array.length+1];


        Scanner input=new Scanner(System.in);
        System.out.print("Girilen sayı : ");
        int num=input.nextInt();

        for (int i=0;i<array.length;i++){
            array2[i]=array[i];
        }
        array2[array.length]=num;
        Arrays.sort(array2);
        int a=(Arrays.binarySearch(array2,num));
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+array2[a-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+array2[a+1]);

    }
}
