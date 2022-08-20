package MaasHesap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Adınız : ");
        String name=input.nextLine();
        System.out.println("Maaşınız : ");
        double salary=input.nextDouble();
        System.out.println("Çalışma saati : ");
        int hours=input.nextInt();
        System.out.println("Başlangıç yılı : ");
        int year=input.nextInt();
        Employee emp=new Employee(name,salary,hours,year);
        System.out.print(emp.toString());
    }
}
