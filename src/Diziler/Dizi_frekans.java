package Diziler;

import java.util.Arrays;
import java.util.List;

public class Dizi_frekans {

    static int[] values(int[] array){
        int[] arr=new int[]{};

        for(int i:array){
            if(!contains(i,arr))
                arr=add(i,arr);
        }
        return arr;
    }

    static  boolean contains(int value,int[] array){
        for (int i:array){
            if(value==i)
                return true;
        }
        return false;
    }

    static int[] add(int value,int[] array){
        int[] arr=new int[array.length+1];
        for (int i=0;i<arr.length-1;i++){
            arr[i]=array[i];
        }
        arr[arr.length-1]=value;
        return arr;
    }

    public static void main(String[] args) {

        int[] array=new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int[] list=values(array);
        System.out.println("Tekrar Sayıları");
        for(int i=0;i<list.length;i++){
            int count=0;
            for (int j=0;j<array.length;j++){
                if((list[i]==array[j])){
                    count++;
                }
            }
            System.out.println(list[i]+" sayısı "+count+" kere tekrar edildi.");
        }
    }

}
