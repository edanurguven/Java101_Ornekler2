package Mayin_Tarlasi;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Mayın tarlası oyununa hoş geldiniz!");
        MineSweeper mine=new MineSweeper();
        Scanner input=new Scanner(System.in);
        System.out.print("Mayın tarlası kaç satır olsun : ");
        int row=input.nextInt();
        System.out.print("Mayın tarlası kaç sütun olsun : ");
        int col=input.nextInt();
        mine.run(row,col);
    }
}
