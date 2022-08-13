public class AsalSayiBulma {
    public static void main(String[] args) {
        for(int sayi=2;sayi<=100;sayi++){
            int kontrol=0;
            for(int i=2;i<sayi;i++){
                if(sayi%i==0){
                    kontrol=1;
                    break;
                }
            }
            if(kontrol==1){
                System.out.println(sayi+" asal degil");
            }
            else{
                System.out.println(sayi+" asaldir");
            }
        }
    }
}
