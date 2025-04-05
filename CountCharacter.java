public class CountCharacter {
    public static void main(String[] args) {
        String s= "Count total number of character";    
        int count = 0;  
        for(int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Total number of character" + " " + count) ;
    }
}
