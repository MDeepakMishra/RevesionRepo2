import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int n1 = 0 , n2 = 1 , n3 ;
        System.out.print(n1 + " ");
         System.out.print(n2 +" ");
        for(int i =  2 ; i <= n ; i++){
            n3 = n1 + n2 ;
            n1 =n2;
            n2=n3;
            System.out.print(n3 + " ");
            }
    }
}
