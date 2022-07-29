import java.util.Scanner;

public class EtkinlikOneri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int heat;
        String durum;
        System.out.println("Sıcaklık derecesi nedir?");
        heat=input.nextInt();

        durum=(heat<5)? "Kayak yapabilirsiniz" :((5<=heat && heat<15)? "Sinemaya gidebilirsiniz":((15<=heat && heat<25) ?
                "Piknik yapabilirsiniz":"Yüzmeye gidebilirsiniz."));
        System.out.println(durum);
    }
}
