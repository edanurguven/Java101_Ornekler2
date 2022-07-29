import java.util.Scanner;

public class UcakBiletiFiyatHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km,yas,cesit;
        double fiyat,indirim;
        System.out.println("Gidilecek yer kac km uzaklıkta? :");
        km=input.nextInt();
        System.out.println("Kac yasindasiniz? :");
        yas=input.nextInt();
        System.out.println("Yolculuk tipinizi secin\n1-)Gidis\n2-)Gidis-Gelis :");
        cesit=input.nextInt();

        fiyat=(0.10)*km;

        if((km>0)&&(yas>0)&&(cesit==1 || cesit==2)){
            if(12>yas){
                indirim=fiyat*(0.50);
                fiyat=fiyat-indirim;
                if(cesit==2){
                    indirim=fiyat*(0.20);
                    fiyat=fiyat-indirim;
                    fiyat=fiyat*2;

                }
            }
            else if ((24>yas)&&(yas>=12)) {
                indirim=fiyat*(0.10);
                fiyat=fiyat-indirim;
                if(cesit==2){
                    indirim=fiyat*(0.20);
                    fiyat=fiyat-indirim;
                    fiyat=fiyat*2;
                }
            }
            else if(yas>65){
                indirim=fiyat*(0.30);
                fiyat=fiyat-indirim;
                if(cesit==2){
                    indirim=fiyat*(0.20);
                    fiyat=fiyat-indirim;
                    fiyat=fiyat*2;

                }
            }
            System.out.println("Toplam tutar : "+ fiyat);
        }
        else{
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}
