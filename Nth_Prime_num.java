import java.util.Scanner;

public class Nth_Prime_num {

    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count =0;
       for(int i =  1 ; i <= n ; i++){
        if(n % i ==0){
          count ++;
          
          if( count == 2){
            System.out.println("Prime");
           }
           else{
            System.out.println(" Not A Prime");
           }
        }
       }
      
    }
    
}