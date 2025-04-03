import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("to find the fectorial of the number");
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  fac= 1 ;
        for(int i =  1 ; i <= n ; i++){
           fac =  fac + fac * i ;
            }
            System.out.print( " Factoril of the number" + " " + fac);
            
    }
}
