package Diziler;

import java.util.Arrays;

public class Dizi_CiftSayi_Tekrar {

    static boolean isTrue(int[] array,int value){
        for(int i:array){
            if(value==i){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={3,4,7,3,3,2,9,10,21,4,1,33,9,1,2};
        int[] array=new int[list.length];
        int startIndex=0;

        for(int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                if((i!=j)&&(list[i]==list[j])&&(list[i]%2==0)){
                    if(!isTrue(array,list[i])){
                        array[startIndex]=list[i];
                        startIndex++;
                    }break;
                }
            }
        }

        System.out.print(Arrays.toString(array));
    }
}
