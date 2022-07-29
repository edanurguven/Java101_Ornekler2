import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yil,deger;
        System.out.println("Dogdugunuz yili giriniz : ");
        yil=input.nextInt();
        deger=yil%12;
        switch (deger){
            case 0:
                System.out.println("Sembolunuz maymun");
                break;
            case 1:
                System.out.println("Sembolunuz horoz");
                break;
            case 2:
                System.out.println("Sembolunuz kopek");
                break;
            case 3:
                System.out.println("Sembolunuz domuz");
                break;
            case 4:
                System.out.println("Sembolunuz fare");
                break;
            case 5:
                System.out.println("Sembolunuz okuz");
                break;
            case 6:
                System.out.println("Sembolunuz kaplan");
                break;
            case 7:
                System.out.println("Sembolunuz tavsan");
                break;
            case 8:
                System.out.println("Sembolunuz ejderha");
                break;
            case 9:
                System.out.println("Sembolunuz yilan");
                break;
            case 10:
                System.out.println("Sembolunuz at");
                break;
            case 11:
                System.out.println("Sembolunuz koyun");
                break;
            default:
                System.out.println("Yanlis veri.");
        }
    }
}
