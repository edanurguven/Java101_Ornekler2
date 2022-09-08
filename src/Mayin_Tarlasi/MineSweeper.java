package Mayin_Tarlasi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    public void run(int roww,int coll){

        Scanner input=new Scanner(System.in);
        int row=roww;
        int column=coll;
        String[][] minefield=new String[row][column];
        String[][] new_minefield=new String[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                minefield[i][j]="_ ";
                new_minefield[i][j]="_ ";
            }
        }


        int numberOfValue=row*column;
        int numberOfMine=numberOfValue/4;
        int count=0;
        Random rand = new Random();

        while(count<numberOfMine){
            int random1=rand.nextInt(row);
            int random2=rand.nextInt(column);

            if(minefield[random1][random2].equals("_ ")){
                minefield[random1][random2]="* ";
                count++;
            }
        }

         //Mayinlarin yerini gostermesi icin
        for(String[] i:minefield){
            for(String j:i){
                System.out.print(j);
            }
            System.out.println();
        }

        int q=numberOfValue-numberOfMine;
        while(q-->=0){
            System.out.print("Satır giriniz :");
            int i_row=input.nextInt();
            while(i_row>=minefield.length){
                System.out.print("Uzunluk dışı satır girdiniz,yeni satır giriniz :");
                i_row=input.nextInt();
            }
            System.out.print("Sütun giriniz :");
            int i_col=input.nextInt();
            while(i_col>=minefield[0].length){
                System.out.print("Uzunluk dışı sütun girdiniz,yeni sütun giriniz :");
                i_col=input.nextInt();
            }

            if(minefield[i_row][i_col].equals("* ")){
                System.out.println("Oyunu kaybettiniz!");
                break;
            }
            else{
                minefield=isMinesContains(minefield,new_minefield,i_row,i_col);
            }
            if(q==0){
                System.out.println("Tebrikler oyunu kazandınız!");
                break;
            }
        }

    }
    public boolean isLengthTrue(String[][] matris,int row,int col){

        if((row<0)||(row>matris.length-1)){
            return false;
        }
        if((col<0)||(col>matris[0].length-1)){
            return false;
        }
        return true;
    }
    public String[][] isMinesContains(String[][] matris,String[][] new_minefield,int row,int col){
        int mines_count=0; //mayin

        if(isLengthTrue(matris, row-1, col-1)){
            if((matris[row-1][col-1].equals("* "))){
                mines_count++;
            }
        }

        if(isLengthTrue(matris,row,col-1)){
            if(matris[row][col-1].equals("* ")){
                mines_count++;
            }
        }

        if(isLengthTrue(matris,row+1,col-1)){
            if(matris[row+1][col-1].equals("* ")){
                mines_count++;
            }
        }

        if(isLengthTrue(matris,row-1,col)){
            if(matris[row-1][col].equals("* ")){
                mines_count++;
            }
        }

        if(isLengthTrue(matris,row+1,col)){
            if(matris[row+1][col].equals("* ")){
                mines_count++;
            }
        }

        if(isLengthTrue(matris,row-1,col+1)){
            if(matris[row-1][col+1].equals("* ")){
                mines_count++;
            }
        }

        if(isLengthTrue(matris,row,col+1)){
            if(matris[row][col+1].equals("* ")){
                mines_count++;
            }
        }

        if(isLengthTrue(matris,row+1,col+1)){
            if(matris[row+1][col+1].equals("* ")){
                mines_count++;
            }
        }

        String c=String.valueOf(mines_count);
        new_minefield[row][col]=c+" ";
        System.out.println("===============================");
        for(String[] i:new_minefield){
            for(String j:i){
                System.out.print(j);
            }
            System.out.println();
        }
        return matris;
    }
}
