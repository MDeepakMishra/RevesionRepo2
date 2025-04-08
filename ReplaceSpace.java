import java.util.Scanner;

public class ReplaceSpace {
    public static void main(String[] args) {
        System.out.println("REPLACE STRING WITH A SPECIFIC CHARACTER");
        System.out.println("ENTER THE STRING");
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();

        char ch = '-'; 
        s = s.replace(' ', ch);    
            
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(s); 
    }
}
