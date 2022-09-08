package Math_String_class;

import java.util.Scanner;

public class Palindromik_Kelimeler {
    public static boolean isPalindrom(String str){
        char[] arr=new char[str.length()];
        arr=str.toCharArray();
        for (int i=str.length()-1,j=0;i>=0;i--,j++){
            if(arr[j]!=str.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(isPalindrom(str));
    }
}
