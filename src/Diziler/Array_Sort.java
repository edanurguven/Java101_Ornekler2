package Diziler;
import java.util.Scanner;

public class Array_Sort {

    static  int[] sort(int[] array) {
        int temp=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] <= array[j])) {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Dizinin boyutu n : ");
            int Len = input.nextInt();

            int[] array = new int[Len];

            System.out.println("Dizinin elemanlarını giriniz: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print((i + 1) + ". elemanı : ");
                array[i] = input.nextInt();
            }
            for(int i:sort(array)){
                System.out.print(i+" ");
            }
        }
    }

