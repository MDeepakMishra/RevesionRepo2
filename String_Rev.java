public class String_Rev {
    public static void main(String[] args) {
        String s = "Deepak Mishra";
        String s1 ="";
        System.out.println("ORIGINAL STRING");
        System.out.println(s);

        System.out.println("REVERSE STRING");
       for(int  i = s.length() -1 ; i >= 0 ; i--){
        s1 = s1 + s.charAt(i);
       }
       System.out.println(s1);

    }
}
