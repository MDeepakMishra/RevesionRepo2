import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int temp = n;
       int rev = 0 , rem ;
       while (n >0) {
        rem =n % 10;
        rev = rev * 10 + rem ;
        n = n /10;
        
       }
       System.out.println("After Reverse" + " " + rev);
       if(temp == rev){
        System.out.println("Pallindrom");
       }
       else{
        System.out.println("Not A Pllindrom");
       }
    }
}
