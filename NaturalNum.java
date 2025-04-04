import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUBER");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ; 
        for( int i = 1 ; i <=n ; i++){
            sum +=i;
            }
            System.out.println("SUM OF ALL NATURAL NUMBERS");
            System.out.print(sum);
        
    }
}
