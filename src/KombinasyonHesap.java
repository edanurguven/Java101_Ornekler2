import java.util.Scanner;

public class KombinasyonHesap {
    public static void main(String[] args) {
        int sonuc,N=1,R=1,NR=1;
        Scanner input=new Scanner(System.in);
        System.out.println("(N,r) olmak üzere N ?:");
        int n=input.nextInt();
        System.out.println("(N,r) olmak üzere r ?");
        int r=input.nextInt();
        for(int i=1;i<=n;i++){
            N=N*i;
        }
        for(int i=1;i<=r;i++){
            R=R*i;
        }
        int nr=n-r;
        for(int i=1;i<=nr;i++){
            NR=NR*i;
        }
        sonuc=N/(R*(NR));
        System.out.println("Sonuc : "+sonuc);
    }
}
