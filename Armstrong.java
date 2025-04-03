import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("To check weathr num is arm or not");
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int rev = 0 , rem , arm=0;
       int temp = n;
       while (n >0) {
        rem =n % 10;
        arm = arm + rem * rem * rem;
        n = n /10;
        }
        System.out.println(arm);
          if(temp == arm){
            System.out.println("Armstrong");
           }
           else{
            System.out.println("Not A Armstrong");
           }
    }
}
