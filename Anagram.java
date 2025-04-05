import java.util.Arrays; 
class Anagram {
    public static void main(String[] args) {
        String s1="Goal";  
        String s2="loaG";
        System.out.println("original string");
        System.out.println(s1 +" " + s2);
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] S1 = s1.toCharArray();
        char[] S2 = s2.toCharArray();
        if (s1.length()!=s2.length()) {
             System.out.println("These string is not a anagram");
        }
        else{

            Arrays.sort(S1);
            Arrays.sort(S2);
            if(Arrays.equals(S1, S2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }
    }
}
