import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Doğum ayınız nedir?Sayi ile belirtin");
        int ay=input.nextInt();
        System.out.println("Doğum gününüz nedir?");
        int gun=input.nextInt();

        if(ay==1){
            if(gun<=21){
                System.out.println("Burcunuz oğlak");
            }
            else{
                System.out.println("Burcunuz kova");
            }
        }
        if(ay==2){
            if(gun<=19){
                System.out.println("Burcunuz kova");
            }
            else{
                System.out.println("Burcunuz balık");
            }
        }
        if(ay==3){
            if(gun<=20){
                System.out.println("Burcunuz balık");
            }
            else{
                System.out.println("Burcunuz koç");
            }
        }
        if(ay==4){
            if(gun<=20){
                System.out.println("Burcunuz koç");
            }
            else{
                System.out.println("Burcunuz boğa");
            }
        }
        if(ay==5){
            if(gun<=21){
                System.out.println("Burcunuz boğa");
            }
            else{
                System.out.println("Burcunuz ikizler");
            }
        }
        if(ay==6){
            if(gun<=22){
                System.out.println("Burcunuz ikizler");
            }
            else{
                System.out.println("Burcunuz yengeç");
            }
        }
        if(ay==7){
            if(gun<=22){
                System.out.println("Burcunuz yengeç");
            }
            else{
                System.out.println("Burcunuz aslan");
            }
        }
        if(ay==8){
            if(gun<=23){
                System.out.println("Burcunuz aslan");
            }
            else{
                System.out.println("Burcunuz başak");
            }
        }
        if(ay==9){
            if(gun<=22){
                System.out.println("Burcunuz başak");
            }
            else{
                System.out.println("Burcunuz terazi");
            }
        }
        if(ay==10){
            if(gun<=22){
                System.out.println("Burcunuz terazi");
            }
            else{
                System.out.println("Burcunuz akrep");
            }
        }
        if(ay==11){
            if(gun<=21){
                System.out.println("Burcunuz akrep");
            }
            else{
                System.out.println("Burcunuz yay");
            }
        }
        if(ay==12){
            if(gun<=21){
                System.out.println("Burcunuz yay");
            }
            else{
                System.out.println("Burcunuz oğlak");
            }
        }
    }
}
/*
        Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
         */