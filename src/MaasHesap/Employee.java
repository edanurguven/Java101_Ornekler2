package MaasHesap;

public class Employee {
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;
    public Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

   // Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
   // Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.


    public double tax(){  // Maaşa uygulanan vergiyi hesaplayacaktır.
        if(salary>=1000){
            return ((salary)*3)/100;
        }
        else if(salary<1000){
            return 0;
        }
        return 0;
    }

    public double bonus(){  //Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        if(workHours>40){
            return (workHours-40)*30;
        }
        return 0;
    }
    public double raiseSalary(){  //Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        int years=2021-hireYear;
        double zam;
        if(10>years){
            return (salary*(5))/100;
        }
        else if((9<years)&&(years<20)){
            return (salary*10)/100;
        }
        else if(years>19){
            return (salary*15)/100;
        }
        return 0;
    }
   // Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
   // Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
   // Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.

    @Override
    public String toString(){
        return  "Vergi : "+tax()+
                "\nBonus : "+bonus()+
                "\nMaas Artışı : "+raiseSalary()+
                "\nVergi ve bonuslar ile maaş : "+(salary-tax()+bonus()) +
                "\nToplam maaş : "+(salary-tax()+bonus()+raiseSalary());
    }
}

