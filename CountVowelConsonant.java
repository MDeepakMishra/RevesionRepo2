public class CountVowelConsonant {
    public static void main(String[] args) {
        System.out.println("COUNT TOTAL NUMBER Vowel And Consonant");
        int Count_V = 0, Count_C = 0;    
        String s = "This is a really simple SenTencE";  
         s = s.toLowerCase();
         for(int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) =='a' ||  s.charAt(i) =='e' ||  s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u') {
                Count_V++;
            }
            else  if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
                Count_C++;
            }
         }
         System.out.println("TOTAL NUM OF VOWEL" + " " +  Count_V);
         System.out.println("TOTAL NUM OF CONSONANT" + " " +  Count_C);
        }
}
