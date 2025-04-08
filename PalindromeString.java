import java.util.Scanner;

public class PalindromeString  {
    public static void main(String[] args) {
        System.out.println("TO CHECK WEATHER STRING IS PALLIDROM OR NOT");
        System.out.println("ENTER THE STRING");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String temp = s ;
        String s1 ="";
        System.out.println("ORIGINAL STRING");
        System.out.println(s);

        System.out.println("REVERSE STRING");
       for(int  i = s.length() -1 ; i >= 0 ; i--){
        s1 = s1 + s.charAt(i);
       }
       System.out.println(s1);
       if (s1.equals(temp)) {
        System.out.println("GIVEN STRING IS PALLINDROM");
       }
       else{
        System.out.println("GIVEN STRING IS NOT A PALLINDROM");
       }
       
    }
    
}
