import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
         System.out.println("FIND THE DUBLICATE CHARACTER");
        System.out.println("ENTER THE STRING");
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        char s1[] = s.toCharArray();
        
        int count ;
        System.out.println("DUBLICATE CHARACTER ARE");
        for(int i = 0 ; i < s1.length; i++){
            count = 1;
            for(int j = i + 1  ; j < s1.length; j++ ){
                   if (s1[i] == s1[j] && s1[i] != ' ') {
                    count++;
                    s1[j] ='0';
                   }
            }
            if (count > 1 && s1[i] != '0') {
                System.out.println(s1[i]);
            }
        }
     
    }
}
