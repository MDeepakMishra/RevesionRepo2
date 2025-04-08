import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        System.out.println("SWAP STRING WITHOUT USING ANY THIRD VERIABLE");
        System.out.println("ENTER FIRST STRING ");
        Scanner sc =  new Scanner(System.in);
        String s1 = sc.nextLine();
   
        System.out.println("ENTER SECOND STRING ");
        String s2 = sc.nextLine();
       
        System.out.println("STRING BEFORE SWAPING");
        System.out.println(s1 + " " + s2);
        s1 = s1 + s2 ;
        s2 =  s1.substring(0, (s1.length() - s2.length()));
        s1 = s1.substring(s2.length());    
            
        System.out.println("Strings after swapping: " );
        System.out.println(s1 + " " + s2);
    }
}
